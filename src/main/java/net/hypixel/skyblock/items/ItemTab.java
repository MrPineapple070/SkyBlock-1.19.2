package net.hypixel.skyblock.items;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/**
 * This class holds {@link CreativeModeTab} for {@link SkyblockMod}
 * 
 * @author MrPineapple070
 * @version 07 July 2020
 * @since 11 June 2019
 */
@Immutable
public class ItemTab {
	/**
	 * Holds all {@link Item} that would be held in the
	 * <a href="https://wiki.hypixel.net/Boss_Collection">Boss Collection</a>.
	 */
	@Nonnull
	@Immutable
	public static final CreativeModeTab boss = new CreativeModeTab(CreativeModeTab.TABS.length + 5, "boss") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.WITHER_SKELETON_SKULL);
		}
	};

	/**
	 * Holds all {@link Item} that would be held in the
	 * <a href="https://wiki.hypixel.net/Combat_Collection">Combat Collection</a>.
	 */
	@Nonnull
	@Immutable
	public static final CreativeModeTab combat = new CreativeModeTab(CreativeModeTab.TABS.length + 2, "combat") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.STONE_SWORD);
		}
	};

	/**
	 * Holds all {@link Item} that would be held in the
	 * <a href="https://wiki.hypixel.net/Farming_Collection">Farming Collection</a>.
	 */
	@Nonnull
	@Immutable
	public static final CreativeModeTab farm = new CreativeModeTab(CreativeModeTab.TABS.length, "farm") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.GOLDEN_HOE);
		}
	};

	/**
	 * Holds all {@link Item} that would be held in the
	 * <a href="https://wiki.hypixel.net/Fishing_Collection">Fishing Collection</a>.
	 */
	@Nonnull
	@Immutable
	public static final CreativeModeTab fish = new CreativeModeTab(CreativeModeTab.TABS.length + 4, "fish") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.FISHING_ROD);
		}
	};

	/**
	 * Holds all {@link Item} that would be held in the
	 * <a href="https://wiki.hypixel.net/Foraging_Collection">Foraging
	 * Collection</a>.
	 */
	@Nonnull
	@Immutable
	public static final CreativeModeTab forage = new CreativeModeTab(CreativeModeTab.TABS.length + 3, "forage") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.DARK_OAK_SAPLING);
		}
	};

	/**
	 * Holds all {@link Item} that would be held in the
	 * <a href="https://wiki.hypixel.net/Mining_Collection">Combat Collection</a>.
	 */
	@Nonnull
	@Immutable
	public static final CreativeModeTab mine = new CreativeModeTab(CreativeModeTab.TABS.length + 1, "mine") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.STONE_PICKAXE);
		}

	};
}
