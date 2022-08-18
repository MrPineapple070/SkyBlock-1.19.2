package net.hypixel.skyblock.items.trophy_fish;

import javax.annotation.Nonnull;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public enum Tier {
	Bronze, Diamond, Gold, Silver;

	@Nonnull
	private static final MutableComponent bronze = Component.translatable("trophy_fish.tier.bronze")
			.withStyle(ChatFormatting.DARK_GRAY);

	@Nonnull
	private static final MutableComponent diamond = Component.translatable("trophy_fish.tier.diamond")
			.withStyle(ChatFormatting.AQUA);

	@Nonnull
	private static final MutableComponent gold = Component.translatable("trophy_fish.tier.gold")
			.withStyle(ChatFormatting.GOLD);

	@Nonnull
	private static final MutableComponent silver = Component.translatable("trophy_fish.tier.silver")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Convert this into a {@link MutableComponent}
	 *
	 * @return {@link MutableComponent}
	 */
	@Nonnull
	public MutableComponent getName() {
		switch (this) {
		case Bronze:
			return bronze.copy();
		case Diamond:
			return diamond.copy();
		case Gold:
			return gold.copy();
		case Silver:
			return silver.copy();
		default:
			throw new IllegalStateException("Illegal Tier:\t" + this);
		}
	}
}
