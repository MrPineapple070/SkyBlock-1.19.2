package net.hypixel.skyblock.items;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class EnchantedItem extends ModItem {
	public EnchantedItem(final Properties properties) {
		super(properties, Rarity.Uncommon);
	}

	@Override
	public boolean isFoil(final ItemStack stack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}
}
