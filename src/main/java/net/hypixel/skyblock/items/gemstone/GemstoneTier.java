package net.hypixel.skyblock.items.gemstone;

import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.items.Rarity;

public enum GemstoneTier {
	Fine(Rarity.Rare), Flawed(Rarity.Uncommon), Flawless(Rarity.Epic), Perfect(Rarity.Legendary), Rough(Rarity.Common);

	@Nonnull
	public final Rarity rarity;

	private GemstoneTier(Rarity rarity) {
		this.rarity = Objects.requireNonNull(rarity, "Rarity cannot be null");
	}
}
