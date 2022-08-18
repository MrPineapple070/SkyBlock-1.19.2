package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that grants +6 Intelligence.<Br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Melody%27s_Hair"></a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class MelodyHair extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.melody", StatString.intelligence)
			.withStyle(ChatFormatting.GRAY);

	private int currentPitch;

	public MelodyHair() {
		super(ItemProperties.combat_1, Rarity.Epic);
		this.currentPitch = -12;
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
	}

	@Override
	public boolean onBlockStartBreak(final ItemStack itemstack, final BlockPos pos, final Player player) {
		if (player.level.isClientSide)
			return false;
		if (++this.currentPitch == 13)
			this.currentPitch = -12;
		return false;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(final Level level, final Player player, final InteractionHand hand) {
		level.playSound(player, player.blockPosition(), SoundEvents.NOTE_BLOCK_HARP, SoundSource.MUSIC,
				(float) Math.pow(2, this.currentPitch / 12), 1f);
		return InteractionResultHolder.success(player.getItemInHand(hand));
	}

	// FIXME Figure out left click behavior
}