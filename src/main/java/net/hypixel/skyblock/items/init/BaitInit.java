package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.SkyblockMod;
import net.hypixel.skyblock.items.bait.Bait;
import net.hypixel.skyblock.items.bait.Blessed;
import net.hypixel.skyblock.items.bait.Carrot;
import net.hypixel.skyblock.items.bait.Corrupted;
import net.hypixel.skyblock.items.bait.Dark;
import net.hypixel.skyblock.items.bait.Fish;
import net.hypixel.skyblock.items.bait.Hot;
import net.hypixel.skyblock.items.bait.Ice;
import net.hypixel.skyblock.items.bait.Light;
import net.hypixel.skyblock.items.bait.Minnow;
import net.hypixel.skyblock.items.bait.Shark;
import net.hypixel.skyblock.items.bait.Spiked;
import net.hypixel.skyblock.items.bait.Spooky;
import net.hypixel.skyblock.items.bait.Whale;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BaitInit {
	public static final DeferredRegister<Item> BAIT = DeferredRegister.create(ForgeRegistries.ITEMS, SkyblockMod.MODID);

	public static final RegistryObject<Bait> minnow = BAIT.register("minnow_bait", Minnow::new);
	public static final RegistryObject<Bait> dark = BAIT.register("dark_bait", Dark::new);
	public static final RegistryObject<Bait> spooky = BAIT.register("spooky_bait", Spooky::new);
	public static final RegistryObject<Bait> light = BAIT.register("light_bait", Light::new);
	public static final RegistryObject<Bait> blessed = BAIT.register("blessed_bait", Blessed::new);
	public static final RegistryObject<Bait> spiked = BAIT.register("spiked_bait", Spiked::new);
	public static final RegistryObject<Bait> fish = BAIT.register("fish_bait", Fish::new);
	public static final RegistryObject<Bait> carrot = BAIT.register("carrot_bait", Carrot::new);
	public static final RegistryObject<Bait> corrupted = BAIT.register("corrupted_bait", Corrupted::new);
	public static final RegistryObject<Bait> ice = BAIT.register("ice_bait", Ice::new);
	public static final RegistryObject<Bait> shark = BAIT.register("shark_bait", Shark::new);
	public static final RegistryObject<Bait> hot = BAIT.register("hot_bait", Hot::new);
	public static final RegistryObject<Bait> whale = BAIT.register("whale_bait", Whale::new);
}