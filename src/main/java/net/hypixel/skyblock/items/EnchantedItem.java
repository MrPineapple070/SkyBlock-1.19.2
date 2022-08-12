package net.hypixel.skyblock.items;

import net.minecraft.world.item.ItemStack;

public class EnchantedItem extends ModItem {
	public EnchantedItem(Properties properties) {
		super(properties, Rarity.Uncommon);
	}
	
	@Override
	public boolean isFoil(ItemStack stack) {
		return true;
	}
}
