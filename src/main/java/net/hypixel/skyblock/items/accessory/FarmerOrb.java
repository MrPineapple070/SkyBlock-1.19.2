package net.hypixel.skyblock.items.accessory;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

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
 * An {@link Accessory} that increases the regrowth rate of nearby crops.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Farmer_Orb">Farmer Orb</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class FarmerOrb extends AccessoryItem{
	private static final ImmutableList<Integer> dx = ImmutableList
			.copyOf(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7));
	private static final ImmutableList<Integer> dy = ImmutableList
			.copyOf(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7));
	private static final ImmutableList<Integer> dz = ImmutableList
			.copyOf(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7));

	private static final Component info = Component.translatable("accessory.farmer_orb").withStyle(ChatFormatting.GRAY);

	private final BlockPos[][][] nearby = new BlockPos[16][16][16];
	
	@Nonnull
	private BlockPos pos;

	public FarmerOrb() {
		super(ItemProperties.farm_1, Rarity.Uncommon);
		this.pos = BlockPos.ZERO;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (!(level instanceof ServerLevel))
			return;
		if (!(entity instanceof Player))
			return;
		Player player = (Player) entity;
		if (! player.blockPosition().equals(this.pos))
			this.setNearby(player);
		
		for (final BlockPos[][] y : this.nearby)
			for (final BlockPos[] x: y)
				for (final BlockPos pos : x) {
					if (level.isInWorldBounds(pos))
						continue;
					final BlockState state = level.getBlockState(pos);
					final Block block = state.getBlock();
					if (state.isAir())
						continue;
					if (block instanceof BonemealableBlock)
						((BonemealableBlock) block).performBonemeal((ServerLevel) level, level.random, pos, state);
				}
	}

	private void setNearby(Player player) {
		this.pos = player.blockPosition();
		for (int i = 0; i < this.nearby.length; i++)
			for (int j = 0; j < this.nearby[i].length; j++)
				for (int k = 0; k < this.nearby[i][j].length; k++)
					this.nearby[i][j][k] = new BlockPos(pos.getX() + dx.get(j), pos.getY() + dy.get(i),
							pos.getZ() + dz.get(k));
	}
}