package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.SkyblockMod;
import net.hypixel.skyblock.items.gemstone.GemstoneItem;
import net.hypixel.skyblock.items.gemstone.GemstoneTier;
import net.hypixel.skyblock.items.gemstone.GemstoneType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GemstoneInit {
	public static final DeferredRegister<Item> GEMSTONE = DeferredRegister.create(ForgeRegistries.ITEMS,
			SkyblockMod.MODID);

	public static final RegistryObject<GemstoneItem> rough_amber = GEMSTONE.register("rough_amber",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Amber));
	public static final RegistryObject<GemstoneItem> flawed_amber = GEMSTONE.register("flawed_amber",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Amber));
	public static final RegistryObject<GemstoneItem> fine_amber = GEMSTONE.register("fine_amber",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Amber));
	public static final RegistryObject<GemstoneItem> flawless_amber = GEMSTONE.register("flawless_amber",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Amber));
	public static final RegistryObject<GemstoneItem> perfect_amber = GEMSTONE.register("perfect_amber",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Amber));
	
	public static final RegistryObject<GemstoneItem> rough_topaz = GEMSTONE.register("rough_topaz",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Topaz));
	public static final RegistryObject<GemstoneItem> flawed_topaz = GEMSTONE.register("flawed_topaz",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Topaz));
	public static final RegistryObject<GemstoneItem> fine_topaz = GEMSTONE.register("fine_topaz",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Topaz));
	public static final RegistryObject<GemstoneItem> flawless_topaz = GEMSTONE.register("flawless_topaz",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Topaz));
	public static final RegistryObject<GemstoneItem> perfect_topaz = GEMSTONE.register("perfect_topaz",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Topaz));
	
	public static final RegistryObject<GemstoneItem> rough_sapphire = GEMSTONE.register("rough_sapphire",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Sapphire));
	public static final RegistryObject<GemstoneItem> flawed_sapphire = GEMSTONE.register("flawed_sapphire",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Sapphire));
	public static final RegistryObject<GemstoneItem> fine_sapphire = GEMSTONE.register("fine_sapphire",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Sapphire));
	public static final RegistryObject<GemstoneItem> flawless_sapphire = GEMSTONE.register("flawless_sapphire",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Sapphire));
	public static final RegistryObject<GemstoneItem> perfect_sapphire = GEMSTONE.register("perfect_sapphire",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Sapphire));
	
	public static final RegistryObject<GemstoneItem> rough_amethyst = GEMSTONE.register("rough_amethyst",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Amethyst));
	public static final RegistryObject<GemstoneItem> flawed_amethyst = GEMSTONE.register("flawed_amethyst",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Amethyst));
	public static final RegistryObject<GemstoneItem> fine_amethyst = GEMSTONE.register("fine_amethyst",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Amethyst));
	public static final RegistryObject<GemstoneItem> flawless_amethyst = GEMSTONE.register("flawless_amethyst",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Amethyst));
	public static final RegistryObject<GemstoneItem> perfect_amethyst = GEMSTONE.register("perfect_amethyst",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Amethyst));
	
	public static final RegistryObject<GemstoneItem> rough_jasper = GEMSTONE.register("rough_jasper",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Jasper));
	public static final RegistryObject<GemstoneItem> flawed_jasper = GEMSTONE.register("flawed_jasper",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Jasper));
	public static final RegistryObject<GemstoneItem> fine_jasper = GEMSTONE.register("fine_jasper",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Jasper));
	public static final RegistryObject<GemstoneItem> flawless_jasper = GEMSTONE.register("flawless_jasper",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Jasper));
	public static final RegistryObject<GemstoneItem> perfect_jasper = GEMSTONE.register("perfect_jasper",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Jasper));
	
	public static final RegistryObject<GemstoneItem> rough_ruby = GEMSTONE.register("rough_ruby",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Ruby));
	public static final RegistryObject<GemstoneItem> flawed_ruby = GEMSTONE.register("flawed_ruby",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Ruby));
	public static final RegistryObject<GemstoneItem> fine_ruby = GEMSTONE.register("fine_ruby",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Ruby));
	public static final RegistryObject<GemstoneItem> flawless_ruby = GEMSTONE.register("flawless_ruby",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Ruby));
	public static final RegistryObject<GemstoneItem> perfect_ruby = GEMSTONE.register("perfect_ruby",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Ruby));
	
	public static final RegistryObject<GemstoneItem> rough_jade = GEMSTONE.register("rough_jade",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Jade));
	public static final RegistryObject<GemstoneItem> flawed_jade = GEMSTONE.register("flawed_jade",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Jade));
	public static final RegistryObject<GemstoneItem> fine_jade = GEMSTONE.register("fine_jade",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Jade));
	public static final RegistryObject<GemstoneItem> flawless_jade = GEMSTONE.register("flawless_jade",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Jade));
	public static final RegistryObject<GemstoneItem> perfect_jade = GEMSTONE.register("perfect_jade",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Jade));
	
	public static final RegistryObject<GemstoneItem> rough_opal = GEMSTONE.register("rough_opal",
			() -> new GemstoneItem(GemstoneTier.Rough, GemstoneType.Opal));
	public static final RegistryObject<GemstoneItem> flawed_opal = GEMSTONE.register("flawed_opal",
			() -> new GemstoneItem(GemstoneTier.Flawed, GemstoneType.Opal));
	public static final RegistryObject<GemstoneItem> fine_opal = GEMSTONE.register("fine_opal",
			() -> new GemstoneItem(GemstoneTier.Fine, GemstoneType.Opal));
	public static final RegistryObject<GemstoneItem> flawless_opal = GEMSTONE.register("flawless_opal",
			() -> new GemstoneItem(GemstoneTier.Flawless, GemstoneType.Opal));
	public static final RegistryObject<GemstoneItem> perfect_opal = GEMSTONE.register("perfect_opal",
			() -> new GemstoneItem(GemstoneTier.Perfect, GemstoneType.Opal));
}
