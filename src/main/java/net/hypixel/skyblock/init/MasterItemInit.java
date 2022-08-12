package net.hypixel.skyblock.init;

import java.util.Objects;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraftforge.eventbus.api.IEventBus;

public class MasterItemInit {
	public static final void register(final IEventBus bus) {
		Objects.requireNonNull(bus, "IEventBus cannot be null");

		SkyblockMod.LOGGER.debug("Registering items");
		ItemInit.ITEMS.register(bus);
		SwordInit.SWORDS.register(bus);
	}
}
