package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.LevelData;

/**
 * An {@link AccessoryItem} that increases
 * <font style="color:#e73c3c">Strength</font> and
 * <font style="color:#00d400">Defense</font> depending on the Player's
 * proximity to spawn.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class GravityTalisman extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component
			.translatable("accessory.gravity", StatString.strength, StatString.defense).withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public GravityTalisman() {
		super(ItemProperties.mine_1, Rarity.Uncommon);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide || !(entity instanceof Player))
			return;
		if (!(entity instanceof final Player player))
			return;
		final LevelData data = level.getLevelData();
		final BlockPos spawn = new BlockPos(data.getXSpawn(), data.getYSpawn(), data.getZSpawn());
		final double dist = spawn.distSqr(player.blockPosition());
		logger.info("Distance:\t" + dist);
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}