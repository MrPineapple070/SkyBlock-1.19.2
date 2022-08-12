package net.hypixel.skyblock.util;

import net.hypixel.skyblock.items.ItemTab;
import net.minecraft.world.item.Item;

public class ItemProperties {
	public static final Item.Properties farm_64 = new Item.Properties().tab(ItemTab.farm).fireResistant().stacksTo(64);
	public static final Item.Properties mine_64 = new Item.Properties().tab(ItemTab.mine).fireResistant().stacksTo(64);
	public static final Item.Properties combat_64 = new Item.Properties().tab(ItemTab.combat).fireResistant()
			.stacksTo(64);
	public static final Item.Properties forage_64 = new Item.Properties().tab(ItemTab.forage).fireResistant()
			.stacksTo(64);
	public static final Item.Properties fish_64 = new Item.Properties().tab(ItemTab.fish).fireResistant().stacksTo(64);
	public static final Item.Properties boss_64 = new Item.Properties().tab(ItemTab.boss).fireResistant().stacksTo(64);

	public static final Item.Properties farm_1 = new Item.Properties().tab(ItemTab.farm).fireResistant().stacksTo(1);
	public static final Item.Properties mine_1 = new Item.Properties().tab(ItemTab.mine).fireResistant().stacksTo(1);
	public static final Item.Properties combat_1 = new Item.Properties().tab(ItemTab.combat).fireResistant()
			.stacksTo(1);
	public static final Item.Properties forage_1 = new Item.Properties().tab(ItemTab.forage).fireResistant()
			.stacksTo(1);
	public static final Item.Properties fish_1 = new Item.Properties().tab(ItemTab.fish).fireResistant().stacksTo(1);
	public static final Item.Properties boss_1 = new Item.Properties().tab(ItemTab.boss).fireResistant().stacksTo(1);
}
