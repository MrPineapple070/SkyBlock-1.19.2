package net.hypixel.skyblock;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.hypixel.skyblock.items.init.MasterItemInit;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 *
 * @author MrPineapple070
 * @version 0.14.0 
 * @since 0.1.0
 */
@Mod(SkyblockMod.MODID)
public class SkyblockMod {
	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(final FMLClientSetupEvent event) {
			final Minecraft minecraft = Minecraft.getInstance();
			// Some client setup code
			LOGGER.info("HELLO FROM CLIENT SETUP");
			LOGGER.info("MINECRAFT NAME >> {}", minecraft.getUser().getName());
		}
	}

	/**
	 * Directly reference a slf4j {@link Logger}
	 */
	public static final Logger LOGGER = LogUtils.getLogger();

	/**
	 * Define mod id in a common place for everything to reference
	 */
	public static final String MODID = "skyblock";

	public SkyblockMod() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		// Register the commonSetup method for modloading
		modEventBus.addListener(this::commonSetup);

		// BLOCKS.register(modEventBus);
		MasterItemInit.register(modEventBus);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
		final Minecraft minecraft = Minecraft.getInstance();
		// Some common setup code
		LOGGER.info("HELLO FROM COMMON SETUP");
		LOGGER.info("MINECRAFT LAUNCHED VERSION >> {}", minecraft.getLaunchedVersion());
		LOGGER.info("MINECRAFT VERSION TYPE >> {}", minecraft.getVersionType());
	}

	@SubscribeEvent
	public void onServerStarting(final ServerStartingEvent event) {
		// Do something when the server starts
		LOGGER.info("HELLO from server starting");
	}
}
