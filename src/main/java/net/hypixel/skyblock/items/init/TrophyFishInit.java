package net.hypixel.skyblock.items.init;

import net.hypixel.skyblock.SkyblockMod;
import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.trophy_fish.Tier;
import net.hypixel.skyblock.items.trophy_fish.TrophyFishItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TrophyFishInit {
	public static final DeferredRegister<Item> FISH = DeferredRegister.create(ForgeRegistries.ITEMS, SkyblockMod.MODID);

	public static final RegistryObject<TrophyFishItem> blobfish_bronze = FISH.register("blobfish_bronze",
			() -> new TrophyFishItem(Rarity.Common, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> blobfish_diamond = FISH.register("blobfish_diamond",
			() -> new TrophyFishItem(Rarity.Common, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> blobfish_gold = FISH.register("blobfish_gold",
			() -> new TrophyFishItem(Rarity.Common, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> blobfish_silver = FISH.register("blobfish_silver",
			() -> new TrophyFishItem(Rarity.Common, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> flyfish_bronze = FISH.register("flyfish_bronze",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> flyfish_diamond = FISH.register("flyfish_diamond",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> flyfish_gold = FISH.register("flyfish_gold",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> flyfish_silver = FISH.register("flyfish_silver",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> golden_fish_bronze = FISH.register("golden_fish_bronze",
			() -> new TrophyFishItem(Rarity.Legendary, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> golden_fish_diamond = FISH.register("golden_fish_diamond",
			() -> new TrophyFishItem(Rarity.Legendary, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> golden_fish_gold = FISH.register("golden_fish_gold",
			() -> new TrophyFishItem(Rarity.Legendary, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> golden_fish_silver = FISH.register("golden_fish_silver",
			() -> new TrophyFishItem(Rarity.Legendary, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> gusher_bronze = FISH.register("gusher_bronze",
			() -> new TrophyFishItem(Rarity.Common, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> gusher_diamond = FISH.register("gusher_diamond",
			() -> new TrophyFishItem(Rarity.Common, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> gusher_gold = FISH.register("gusher_gold",
			() -> new TrophyFishItem(Rarity.Common, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> gusher_silver = FISH.register("gusher_silver",
			() -> new TrophyFishItem(Rarity.Common, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> karate_fish_bronze = FISH.register("karate_fish_bronze",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> karate_fish_diamond = FISH.register("karate_fish_diamond",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> karate_fish_gold = FISH.register("karate_fish_gold",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> karate_fish_silver = FISH.register("karate_fish_silver",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> lavahorse_bronze = FISH.register("lavahorse_bronze",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> lavahorse_diamond = FISH.register("lavahorse_diamond",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> lavahorse_gold = FISH.register("lavahorse_gold",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> lavahorse_silver = FISH.register("lavahorse_silver",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> mana_ray_bronze = FISH.register("mana_ray_bronze",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> mana_ray_diamond = FISH.register("mana_ray_diamond",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> mana_ray_gold = FISH.register("mana_ray_gold",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> mana_ray_silver = FISH.register("mana_ray_silver",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> moldfish_bronze = FISH.register("moldfish_bronze",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> moldfish_diamond = FISH.register("moldfish_diamond",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> moldfish_gold = FISH.register("moldfish_gold",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> moldfish_silver = FISH.register("moldfish_silver",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> obfuscated_1_bronze = FISH.register("obfuscated_1_bronze",
			() -> new TrophyFishItem(Rarity.Common, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> obfuscated_1_diamond = FISH.register("obfuscated_1_diamond",
			() -> new TrophyFishItem(Rarity.Common, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> obfuscated_1_gold = FISH.register("obfuscated_1_gold",
			() -> new TrophyFishItem(Rarity.Common, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> obfuscated_1_silver = FISH.register("obfuscated_1_silver",
			() -> new TrophyFishItem(Rarity.Common, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> obfuscated_2_bronze = FISH.register("obfuscated_2_bronze",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> obfuscated_2_diamond = FISH.register("obfuscated_2_diamond",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> obfuscated_2_gold = FISH.register("obfuscated_2_gold",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> obfuscated_2_silver = FISH.register("obfuscated_2_silver",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> obfuscated_3_bronze = FISH.register("obfuscated_3_bronze",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> obfuscated_3_diamond = FISH.register("obfuscated_3_diamond",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> obfuscated_3_gold = FISH.register("obfuscated_3_gold",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> obfuscated_3_silver = FISH.register("obfuscated_3_silver",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> skeleton_fish_bronze = FISH.register("skeleton_fish_bronze",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> skeleton_fish_diamond = FISH.register("skeleton_fish_diamond",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> skeleton_fish_gold = FISH.register("skeleton_fish_gold",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> skeleton_fish_silver = FISH.register("skeleton_fish_silver",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> slugfish_bronze = FISH.register("slugfish_bronze",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> slugfish_diamond = FISH.register("slugfish_diamond",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> slugfish_gold = FISH.register("slugfish_gold",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> slugfish_silver = FISH.register("slugfish_silver",
			() -> new TrophyFishItem(Rarity.Uncommon, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> soul_fish_bronze = FISH.register("soul_fish_bronze",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> soul_fish_diamond = FISH.register("soul_fish_diamond",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> soul_fish_gold = FISH.register("soul_fish_gold",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> soul_fish_silver = FISH.register("soul_fish_silver",
			() -> new TrophyFishItem(Rarity.Epic, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> steaming_hot_flounder_bronze = FISH
			.register("steaming_hot_flounder_bronze", () -> new TrophyFishItem(Rarity.Common, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> steaming_hot_flounder_diamond = FISH
			.register("steaming_hot_flounder_diamond", () -> new TrophyFishItem(Rarity.Common, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> steaming_hot_flounder_gold = FISH
			.register("steaming_hot_flounder_gold", () -> new TrophyFishItem(Rarity.Common, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> steaming_hot_flounder_silver = FISH
			.register("steaming_hot_flounder_silver", () -> new TrophyFishItem(Rarity.Common, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> sulphur_skitter_bronze = FISH.register("sulphur_skitter_bronze",
			() -> new TrophyFishItem(Rarity.Common, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> sulphur_skitter_diamond = FISH
			.register("sulphur_skitter_diamond", () -> new TrophyFishItem(Rarity.Common, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> sulphur_skitter_gold = FISH.register("sulphur_skitter_gold",
			() -> new TrophyFishItem(Rarity.Common, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> sulphur_skitter_silver = FISH.register("sulphur_skitter_silver",
			() -> new TrophyFishItem(Rarity.Common, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> vanille_bronze = FISH.register("vanille_bronze",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> vanille_diamond = FISH.register("vanille_diamond",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> vanille_gold = FISH.register("vanille_gold",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> vanille_silver = FISH.register("vanille_silver",
			() -> new TrophyFishItem(Rarity.Rare, Tier.Silver));

	public static final RegistryObject<TrophyFishItem> volcanic_stonefish_bronze = FISH
			.register("volcanic_stonefish_bronze", () -> new TrophyFishItem(Rarity.Rare, Tier.Bronze));
	public static final RegistryObject<TrophyFishItem> volcanic_stonefish_diamond = FISH
			.register("volcanic_stonefish_diamond", () -> new TrophyFishItem(Rarity.Rare, Tier.Diamond));
	public static final RegistryObject<TrophyFishItem> volcanic_stonefish_gold = FISH
			.register("volcanic_stonefish_gold", () -> new TrophyFishItem(Rarity.Rare, Tier.Gold));
	public static final RegistryObject<TrophyFishItem> volcanic_stonefish_silver = FISH
			.register("volcanic_stonefish_silver", () -> new TrophyFishItem(Rarity.Rare, Tier.Silver));
}
