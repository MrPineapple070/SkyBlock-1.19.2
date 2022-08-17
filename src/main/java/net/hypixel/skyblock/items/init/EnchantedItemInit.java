package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.SkyblockMod;
import net.hypixel.skyblock.items.EnchantedItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantedItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SkyblockMod.MODID);

	public static final RegistryObject<Item> enchanted_acacia_log = ITEMS.register("enchanted_acacia_log",
			() -> new EnchantedItem(ItemProperties.forage_64));
	public static final RegistryObject<Item> enchanted_ancient_claw = ITEMS.register("enchanted_ancient_claw",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_baked_potato = ITEMS.register("enchanted_baked_potato",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_birch_log = ITEMS.register("enchanted_birch_log",
			() -> new EnchantedItem(ItemProperties.forage_64));
	public static final RegistryObject<Item> enchanted_blaze_powder = ITEMS.register("enchanted_blaze_powder",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_blaze_rod = ITEMS.register("enchanted_blaze_rod",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_bone = ITEMS.register("enchanted_bone",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_bone_meal = ITEMS.register("enchanted_bone_meal",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_bookshelf = ITEMS.register("enchanted_bookshelf",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_borwn_mushroom_block = ITEMS
			.register("enchanted_brown_mushroom_block", () -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_bread = ITEMS.register("enchanted_bread",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_brown_mushroom = ITEMS.register("enchanted_brown_mushroom",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_cactus = ITEMS.register("enchanted_cactus",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_cake = ITEMS.register("enchanted_cake",
			() -> new EnchantedItem(ItemProperties.farm_1));
	public static final RegistryObject<Item> enchanted_carrot = ITEMS.register("enchanted_carrot",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_charcoal = ITEMS.register("enchanted_charcoal",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_chicken = ITEMS.register("enchanted_chicken",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_clay = ITEMS.register("enchanted_clay",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_clownfish = ITEMS.register("enchanted_clownfish",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_coal = ITEMS.register("enchanted_coal",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_coal_block = ITEMS.register("enchanted_coal_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_cobblestone = ITEMS.register("enchanted_cobblestone",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_cocoa_beans = ITEMS.register("enchanted_cocoa_beans",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_cooked_fish = ITEMS.register("enchanted_cooked_fish",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_cooked_mutton = ITEMS.register("enchanted_cooked_mutton",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_cooked_salmon = ITEMS.register("enchanted_cooked_salmon",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_cookie = ITEMS.register("enchanted_cookie",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_dandelion = ITEMS.register("enchanted_dandelion",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_dark_oak_log = ITEMS.register("enchanted_dark_oak_log",
			() -> new EnchantedItem(ItemProperties.forage_64));
	public static final RegistryObject<Item> enchanted_diamond = ITEMS.register("enchanted_diamond",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_diamond_block = ITEMS.register("enchanted_diamond_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_egg = ITEMS.register("enchanted_egg",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_emerald = ITEMS.register("enchanted_emerald",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_emerald_block = ITEMS.register("enchanted_emerald_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_end_stone = ITEMS.register("enchanted_end_stone",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_ender_eye = ITEMS.register("enchanted_ender_eye",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_ender_pearl = ITEMS.register("enchanted_ender_pearl",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_feather = ITEMS.register("enchanted_feather",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_fermented_spider_eye = ITEMS
			.register("enchanted_fermented_spider_eye", () -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_firework_rocket = ITEMS.register("enchanted_firework_rocket",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_fish = ITEMS.register("enchanted_fish",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_flint = ITEMS.register("enchanted_flint",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_ghast_tear = ITEMS.register("enchanted_ghast_tear",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_glistering_melon_slice = ITEMS
			.register("enchanted_glistering_melon_slice", () -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_glowstone = ITEMS.register("enchanted_glowstone",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_glowstone_dust = ITEMS.register("enchanted_glowstone_dust",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_gold_block = ITEMS.register("enchanted_gold_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_gold_ingot = ITEMS.register("enchanted_gold_ingot",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_green_dye = ITEMS.register("enchanted_green_dye",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_hay_bale = ITEMS.register("enchanted_hay_bale",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_hopper = ITEMS.register("enchanted_hopper",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_ice = ITEMS.register("enchanted_ice",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_ink_sac = ITEMS.register("enchanted_ink_sac",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_iron_block = ITEMS.register("enchanted_iron_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_iron_ingot = ITEMS.register("enchanted_iron_ingot",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_jungle_log = ITEMS.register("enchanted_jungle_log",
			() -> new EnchantedItem(ItemProperties.forage_64));
	public static final RegistryObject<Item> enchanted_lapis_block = ITEMS.register("enchanted_lapis_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_lapis_lazuli = ITEMS.register("enchanted_lapis_lazuli",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_lava_bucket = ITEMS.register("enchanted_lava_bucket",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_melon_slice = ITEMS.register("enchanted_melon_slice",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_mutton = ITEMS.register("enchanted_mutton",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_nether_wart = ITEMS.register("enchanted_nether_wart",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_oak_log = ITEMS.register("enchanted_oak_log",
			() -> new EnchantedItem(ItemProperties.forage_64));
	public static final RegistryObject<Item> enchanted_obsidian = ITEMS.register("enchanted_obsidian",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_packed_ice = ITEMS.register("enchanted_packed_ice",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_paper = ITEMS.register("enchanted_paper",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_poisonous_potato = ITEMS.register("enchanted_poisonous_potato",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_prismarine_crystal = ITEMS
			.register("enchanted_prismarine_crystal", () -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_prismarine_shard = ITEMS.register("enchanted_prismarine_shard",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_pumpkin = ITEMS.register("enchanted_pumpkin",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_quartz = ITEMS.register("enchanted_quartz",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_quartz_block = ITEMS.register("enchanted_quartz_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_rabbit = ITEMS.register("enchanted_rabbit",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_rabbit_foot = ITEMS.register("enchanted_rabbit_foot",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_red_mushroom = ITEMS.register("enchanted_red_mushroom",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_red_mushroom_block = ITEMS
			.register("enchanted_red_mushroom_block", () -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_redstone = ITEMS.register("enchanted_redstone",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_redstone_block = ITEMS.register("enchanted_redstone_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_redstone_lamp = ITEMS.register("enchanted_redstone_lamp",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_rotten_flesh = ITEMS.register("enchanted_rotten_flesh",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_salmon = ITEMS.register("enchanted_salmon",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_sand = ITEMS.register("enchanted_sand",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_snow_block = ITEMS.register("enchanted_snow_block",
			() -> new EnchantedItem(ItemProperties.mine_64));
	public static final RegistryObject<Item> enchanted_spider_eye = ITEMS.register("enchanted_spider_eye",
			() -> new EnchantedItem(ItemProperties.combat_64));
	public static final RegistryObject<Item> enchanted_sponge = ITEMS.register("enchanted_sponge",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_spruce_log = ITEMS.register("enchanted_spruce_log",
			() -> new EnchantedItem(ItemProperties.forage_64));
	public static final RegistryObject<Item> enchanted_sugar = ITEMS.register("enchanted_sugar",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_sugar_cane = ITEMS.register("enchanted_sugar_cane",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_wet_sponge = ITEMS.register("enchanted_wet_sponge",
			() -> new EnchantedItem(ItemProperties.fish_64));
	public static final RegistryObject<Item> enchanted_wheat = ITEMS.register("enchanted_wheat",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_wheat_seeds = ITEMS.register("enchanted_wheat_seeds",
			() -> new EnchantedItem(ItemProperties.farm_64));
	public static final RegistryObject<Item> enchanted_wool = ITEMS.register("enchanted_wool",
			() -> new EnchantedItem(ItemProperties.farm_64));
}
