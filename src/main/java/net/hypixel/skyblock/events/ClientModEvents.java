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
 * @version 11 June 2019
 * @since 11 June 2019
 */
@Mod.EventBusSubscriber(modid = SkyblockMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {
	/**
	 * Direct reference to {@link Logger}.
	 */
	protected static final Logger LOGGER = LogManager.getLogger();

	/**
	 * This method is called upon {@link FMLClientSetupEvent}
	 * 
	 * @param event {@link FMLClientSetupEvent}
	 */
	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {
		final Minecraft minecraft = Minecraft.getInstance();
		// Some client setup code
		LOGGER.info("HELLO FROM CLIENT SETUP");
		LOGGER.info("MINECRAFT USER NAME >> {}", minecraft.getUser().getName());
	}
}
