package net.hypixel.skyblock.items.accessory;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;

/**
 * An {@link AccessoryItem} that increases the regrowth rate of nearby crops.<br>
 * <a href="https://wiki.hypixel.net/Farmer_Orb">Farmer Orb</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class FarmerOrb extends AccessoryItem {
	/**
	 * {@link ImmutableList} of {@link Integer}
	 */
	private static final ImmutableList<Integer> offset = ImmutableList
			.copyOf(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7));

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.farmer_orb").withStyle(ChatFormatting.GRAY);

	/**
	 * 3d-array of {@link BlockPos} when centered at {@link Player}
	 */
	private final BlockPos[][][] nearby = new BlockPos[16][16][16];

	/**
	 * {@link BlockPos} of {@link Player#blockPosition()}
	 */
	@Nonnull
	private BlockPos pos;

	/**
	 * Constructor
	 */
	public FarmerOrb() {
		super(ItemProperties.farm_1, Rarity.Uncommon);
		this.pos = BlockPos.ZERO;
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (!(level instanceof final ServerLevel server))
			return;
		if (!(entity instanceof final Player player))
			return;
		if (!player.blockPosition().equals(this.pos))
			this.setNearby(player);

		for (final BlockPos[][] y : this.nearby)
			for (final BlockPos[] x : y)
				for (final BlockPos pos : x) {
					if (level.isInWorldBounds(pos))
						continue;
					final BlockState state = level.getBlockState(pos);
					final Block block = state.getBlock();
					if (state.isAir())
						continue;
					if (block instanceof final BonemealableBlock bone)
						bone.performBonemeal(server, level.random, pos, state);
				}
	}

	/**
	 * Modifies {@link #nearby}
	 * 
	 * @param player {@link Player}
	 */
	private void setNearby(final Player player) {
		this.pos = player.blockPosition();
		for (int i = 0; i < this.nearby.length; ++i)
			for (int j = 0; j < this.nearby[i].length; ++j)
				for (int k = 0; k < this.nearby[i][j].length; ++k)
					this.nearby[i][j][k] = this.pos.offset(offset.get(j), offset.get(i), offset.get(k));
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}