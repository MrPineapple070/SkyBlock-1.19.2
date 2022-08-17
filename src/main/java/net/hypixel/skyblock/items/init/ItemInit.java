package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.SkyblockMod;
import net.hypixel.skyblock.items.ModItem;
import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SkyblockMod.MODID);

	public static final RegistryObject<Item> common = ITEMS.register("common",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Common));
	public static final RegistryObject<Item> uncommon = ITEMS.register("uncommon",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Uncommon));
	public static final RegistryObject<Item> rare = ITEMS.register("rare",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Rare));
	public static final RegistryObject<Item> epic = ITEMS.register("epic",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Epic));
	public static final RegistryObject<Item> legendary = ITEMS.register("legendary",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Legendary));
	public static final RegistryObject<Item> mythic = ITEMS.register("mythic",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Mythic));
	public static final RegistryObject<Item> divine = ITEMS.register("divine",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Divine));
	public static final RegistryObject<Item> special = ITEMS.register("special",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Special));
	public static final RegistryObject<Item> very_special = ITEMS.register("very_special",
			() -> new ModItem(ItemProperties.boss_64, Rarity.Very_Special));
}
