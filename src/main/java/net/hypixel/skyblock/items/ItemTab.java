package net.hypixel.skyblock.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ItemTab {
	public static final CreativeModeTab farm = new CreativeModeTab(CreativeModeTab.TABS.length, "farm") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.GOLDEN_HOE);
		}
	};

	public static final CreativeModeTab mine = new CreativeModeTab(CreativeModeTab.TABS.length, "mine") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.STONE_PICKAXE);
		}

	};

	public static final CreativeModeTab combat = new CreativeModeTab(CreativeModeTab.TABS.length, "combat") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.STONE_SWORD);
		}
	};

	public static final CreativeModeTab forage = new CreativeModeTab(CreativeModeTab.TABS.length, "forage") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.DARK_OAK_SAPLING);
		}
	};

	public static final CreativeModeTab fish = new CreativeModeTab(CreativeModeTab.TABS.length, "fish") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.FISHING_ROD);
		}
	};

	public static final CreativeModeTab boss = new CreativeModeTab(CreativeModeTab.TABS.length, "boss") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.WITHER_SKELETON_SKULL);
		}
	};
}
