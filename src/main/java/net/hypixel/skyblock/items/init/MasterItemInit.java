package net.hypixel.skyblock.items.init;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.errorprone.annotations.Immutable;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraftforge.eventbus.api.IEventBus;

@Immutable
public class MasterItemInit {
	public static final void register(@Nonnull final IEventBus bus) {
		Objects.requireNonNull(bus, "IEventBus cannot be null");

		SkyblockMod.LOGGER.debug("Registering items");
		ItemInit.ITEMS.register(bus);
		EnchantedItemInit.ITEMS.register(bus);
		GemstoneInit.GEMSTONE.register(bus);
		TrophyFishInit.FISH.register(bus);
		AccessoryInit.ACCESSORIES.register(bus);
		SwordInit.SWORDS.register(bus);
	}
}
