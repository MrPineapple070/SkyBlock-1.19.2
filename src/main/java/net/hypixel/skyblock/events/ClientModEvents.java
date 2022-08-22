package net.hypixel.skyblock.events;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraft.client.Minecraft;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Handles {@link FMLClientSetupEvent} for {@link SkyblockMod}
 * 
 * @author MrPineapple070
 * @version 0.14.0
 * @since 0.1.0
 */
@Mod.EventBusSubscriber(modid = SkyblockMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {
	protected static final Logger LOGGER = LogManager.getLogger();

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {
		final Minecraft minecraft = Minecraft.getInstance();
		// Some client setup code
		LOGGER.info("HELLO FROM CLIENT SETUP");
		LOGGER.info("MINECRAFT NAME >> {}", minecraft.getUser().getName());
	}
}
