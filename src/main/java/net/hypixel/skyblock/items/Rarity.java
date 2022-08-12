package net.hypixel.skyblock.items;

import net.minecraft.ChatFormatting;

public enum Rarity {
	Common(ChatFormatting.WHITE), Uncommon(ChatFormatting.GREEN), Rare(ChatFormatting.BLUE),
	Epic(ChatFormatting.DARK_PURPLE), Legendary(ChatFormatting.GOLD), Mythic(ChatFormatting.LIGHT_PURPLE),
	Divine(ChatFormatting.AQUA), Special(ChatFormatting.RED), Very_Special(ChatFormatting.RED);

	public final ChatFormatting color;

	private Rarity(final ChatFormatting color) {
		this.color = color;
	}
}
