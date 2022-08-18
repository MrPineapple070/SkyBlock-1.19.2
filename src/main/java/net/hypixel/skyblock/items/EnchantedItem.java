package net.hypixel.skyblock.items;

import net.minecraft.world.item.ItemStack;

public class EnchantedItem extends ModItem {
	public EnchantedItem(final Properties properties) {
		super(properties, Rarity.Uncommon);
	}

	@Override
	public boolean isFoil(final ItemStack stack) {
		return true;
	}
}
