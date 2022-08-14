package net.hypixel.skyblock.items.gemstone;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.errorprone.annotations.Immutable;

import net.hypixel.skyblock.util.StatString;
import net.minecraft.network.chat.Component;

@Immutable
public enum GemstoneType {
	Amber(StatString.mining_speed), Amethyst(StatString.defense), Jade(StatString.mining_fortune),
	Jasper(StatString.strength), Opal(StatString.true_def), Ruby(StatString.health), Sapphire(StatString.intelligence),
	Topaz(StatString.pristine);

	@Nonnull
	public final Component stat;

	private GemstoneType(@Nonnull final Component stat) {
		this.stat = Objects.requireNonNull(stat, "StatString cannot be null");
	}
}
