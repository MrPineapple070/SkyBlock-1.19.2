package net.hypixel.skyblock.items.crafting;

import java.util.Objects;

import javax.annotation.Nonnull;

import org.jetbrains.annotations.Nullable;
import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import net.hypixel.skyblock.util.JSONUtils;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;

public class EnchantedItemRecipe implements IEnchantedItemRecipe {
	public static class Serializer implements RecipeSerializer<EnchantedItemRecipe> {

		@Override
		public EnchantedItemRecipe fromJson(final ResourceLocation recipe, final JsonObject json) {
			final String group = JSONUtils.getAsString(json, "group", "");
			final ItemStack input = CraftingHelper.getItemStack(JSONUtils.getAsJsonObject(json, "input"), true);
			if (input.isEmpty())
				throw new JsonParseException("No ingredients for recipe");
			return new EnchantedItemRecipe(recipe, group, input,
					CraftingHelper.getItemStack(JSONUtils.getAsJsonObject(json, "output"), true));
		}

		@Override
		@Nullable
		public EnchantedItemRecipe fromNetwork(final ResourceLocation recipe, final FriendlyByteBuf buffer) {
			return new EnchantedItemRecipe(recipe, buffer.readUtf(0x7FFF), buffer.readItem(), buffer.readItem());
		}

		@Override
		public void toNetwork(final FriendlyByteBuf buffer, final EnchantedItemRecipe recipe) {
			buffer.writeUtf(recipe.group);
			buffer.writeItem(recipe.input);
			buffer.writeItem(recipe.output);
		}
	}

	/**
	 * Group name that this is in.
	 */
	@Nonnull
	public final String group;

	/**
	 * {@link ResourceLocation} for the id.
	 */
	@Nonnull
	public final ResourceLocation id;

	/**
	 * Input {@link ItemStack} for this {@link IEnchantedItemRecipe}.
	 */
	@Nonnull
	@Immutable
	public final ItemStack input;

	/**
	 * Output {@link ItemStack} for this {@link IEnchantedItemRecipe}
	 */
	@Nonnull
	@Immutable
	public final ItemStack output;

	public EnchantedItemRecipe(ResourceLocation id, String group, ItemStack input, ItemStack output) {
		this.id = Objects.requireNonNull(id, "ID ResourceLocation cannot be null");
		this.group = Objects.requireNonNull(group, "Group cannot be null");
		this.input = Objects.requireNonNull(input, "Inputs cannot be null");
		this.output = Objects.requireNonNull(output, "Output cannot be null");
		LOGGER.debug("Input:\t" + this.input.toString());
		LOGGER.debug("Output:\t" + this.output.toString());
	}

	@Override
	public ItemStack assemble(CraftingContainer inv) {
		return this.output.copy();
	}

	@Override
	public String getGroup() {
		return this.group;
	}

	@Override
	public ResourceLocation getId() {
		return this.id;
	}

	@Override
	public ItemStack getInput() {
		return this.input;
	}

	@Override
	public ItemStack getResultItem() {
		return this.output;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return RecipeSerializerInit.enchanted_item_serializer.get();
	}

	@Override
	public boolean matches(CraftingContainer inv, Level level) {
		boolean matches = !this.output.isEmpty();

		int size = 0;
		for (int i = 0; i < inv.getContainerSize(); ++i) {
			final ItemStack stack = inv.getItem(i);
			if (this.input.sameItem(stack))
				if (this.input.getCount() <= stack.getCount())
					++size;
		}

		matches &= size == 5;
		LOGGER.info(matches ? this.output.toString() + " matches" : "Failed to match");
		return matches;
	}
}
