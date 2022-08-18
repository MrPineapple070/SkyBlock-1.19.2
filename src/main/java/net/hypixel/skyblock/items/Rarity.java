package net.hypixel.skyblock.items;

import net.minecraft.ChatFormatting;

public enum Rarity {
	Common(ChatFormatting.WHITE), Divine(ChatFormatting.AQUA), Epic(ChatFormatting.DARK_PURPLE),
	Legendary(ChatFormatting.GOLD), Mythic(ChatFormatting.LIGHT_PURPLE), Rare(ChatFormatting.BLUE),
	Special(ChatFormatting.RED), Uncommon(ChatFormatting.GREEN), Very_Special(ChatFormatting.RED);

	public final ChatFormatting color;

	Rarity(final ChatFormatting color) {
		this.color = color;
	}
}
