package net.hypixel.skyblock.items;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * A specific type of {@link ModItem} that applies the enchantment glint to them
 * 
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class EnchantedItem extends ModItem {
	/**
	 * Constructor
	 * 
	 * @param properties {@link Properties} of this Item
	 */
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
