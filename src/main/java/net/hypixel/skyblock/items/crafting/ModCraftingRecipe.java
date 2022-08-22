package net.hypixel.skyblock.items.crafting;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingRecipe;

public interface ModCraftingRecipe extends CraftingRecipe {
	/**
	 * {@link Logger}
	 */
	@Nonnull
	Logger LOGGER = LogManager.getLogger();

	/**
	 * {@link ItemStack}
	 */
	@Nonnull
	ItemStack table = new ItemStack(Items.CRAFTING_TABLE);

	@Override
	default public ItemStack getToastSymbol() {
		return table;
	}
}
