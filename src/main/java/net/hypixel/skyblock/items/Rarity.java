package net.hypixel.skyblock.items;

import java.lang.reflect.Constructor;

import net.minecraft.ChatFormatting;

/**
 * Applies a {@link ChatFormatting} to the
 * {@link Item#getName(net.minecraft.world.item.ItemStack)}.
 * 
 * @author MrPineapple070
 * @version 13 September 2021
 * @since 11 June 2019
 */
public enum Rarity {
	Common(ChatFormatting.WHITE), Divine(ChatFormatting.AQUA), Epic(ChatFormatting.DARK_PURPLE),
	Legendary(ChatFormatting.GOLD), Mythic(ChatFormatting.LIGHT_PURPLE), Rare(ChatFormatting.BLUE),
	Special(ChatFormatting.RED), Uncommon(ChatFormatting.GREEN), Very_Special(ChatFormatting.RED);

	/**
	 * {@link ChatFormatting} to apply
	 */
	public final ChatFormatting color;

	/**
	 * {@link Constructor}
	 * 
	 * @param color {@link ChatFormatting}
	 */
	Rarity(final ChatFormatting color) {
		this.color = color;
	}
}
