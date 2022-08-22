package net.hypixel.skyblock.items.crafting;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;

public interface IEnchantedItemRecipe extends ModCraftingRecipe {
	/**
	 * {@link ResourceLocation} that is the ID for this {@link Recipe}.
	 */
	@Nonnull
	@Immutable
	ResourceLocation recipe_type_id = new ResourceLocation(SkyblockMod.MODID, "enchanted_item");
	
	@Override
	default boolean canCraftInDimensions(int width, int height) {
		return width * height < 10;
	}
	
	@Nonnull
	ItemStack getInput();
}
