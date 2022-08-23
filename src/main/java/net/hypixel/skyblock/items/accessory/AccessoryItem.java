package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.items.ModItem;
import net.hypixel.skyblock.items.Rarity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/**
 * An Accessory is a type of item that provides the player with buffs to their
 * <a href="https://wiki.hypixel.net/Stats">Stats</a> and grants extra utility
 * when held in the {@link Player} {@link Inventory} or Accessory Bag. Many
 * accessories are upgradable; they typically follow the path of Talisman to
 * Ring to Artifact to Relic. Only the highest tier of each accessory type will
 * be active at any given time.
 * 
 * @author MrPineapple070
 * @version 22 August 2022
 * @since 11 June 2019
 */
public abstract class AccessoryItem extends ModItem {
	/**
	 * Directly reference a slf4j {@link Logger}
	 */
	@Nonnull
	protected static final Logger logger = LogManager.getLogger();

	/**
	 * Determine if this accessory will have any effect.
	 */
	protected boolean active;

	/**
	 * {@link AccessoryItem} that this will upgrade to.
	 */
	protected final ItemStack upgrade;

	/**
	 * Constructor
	 * 
	 * @param properties {@link Properties}
	 * @param rarity     {@link Rarity}
	 */
	public AccessoryItem(final Properties properties, final Rarity rarity) {
		super(properties, rarity);
		this.active = false;
		this.upgrade = this.getUpgrade();
	}

	@Override
	public abstract void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag);

	@Override
	public boolean canApplyAtEnchantingTable(final ItemStack stack, final Enchantment enchantment) {
		return false;
	}

	@Override
	public boolean canAttackBlock(final BlockState state, final Level level, final BlockPos pos, final Player player) {
		return false;
	}

	@Override
	public boolean canBeDepleted() {
		return false;
	}

	@Override
	public int getBurnTime(final ItemStack stack, final RecipeType<?> recipeType) {
		return 0;
	}

	/**
	 * Returns {@link #upgrade}
	 * 
	 * @return {@link #upgrade}
	 */
	protected abstract ItemStack getUpgrade();

	/**
	 * Determines if a {@link Player} has {@link #upgrade} within its
	 * {@link Inventory}
	 * 
	 * @param player {@link Player} to find
	 * @return {@code true} if found<br>
	 *         {@code false} otherwise
	 */
	protected boolean hasUpgrade(Player player) {
		if (this.upgrade.isEmpty())
			return false;
		return player.getInventory().contains(this.upgrade);
	}

	@Override
	public abstract void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected);

	@Override
	public boolean isBookEnchantable(final ItemStack stack, final ItemStack book) {
		return false;
	}

	@Override
	public boolean isEnchantable(final ItemStack stack) {
		return false;
	}
}
