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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public abstract class AccessoryItem extends ModItem {
	/**
	 * Directly reference a slf4j {@link Logger}
	 */
	@Nonnull
	protected static final Logger logger = LogManager.getLogger();

	public AccessoryItem(final Properties properties, final Rarity rarity) {
		super(properties, rarity);
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
