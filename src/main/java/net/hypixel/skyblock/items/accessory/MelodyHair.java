package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
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
 * An {@link AccessoryItem} that grants +6 Intelligence.<Br>
 * <a href="https://wiki.hypixel.net/Melody%27s_Hair"></a>
 *
 * @author MrPineapple070
 * @version 25 April 2022
 * @since 12 November 2019
 */
public class MelodyHair extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.melody", StatString.intelligence)
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Current pitch of the note to play
	 */
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
	public InteractionResultHolder<ItemStack> use(final Level level, final Player player, final InteractionHand hand) {
		final ItemStack held = player.getItemInHand(hand);
		if (level.isClientSide)
			return InteractionResultHolder.fail(held);
		if (player.isCrouching()) {
			if (++this.currentPitch == 13)
				this.currentPitch = -12;
		} else {
			level.playSound(player, player.blockPosition(), SoundEvents.NOTE_BLOCK_HARP, SoundSource.PLAYERS,
					(float) Math.pow(2, this.currentPitch / 12d), 1f);
		}
		return InteractionResultHolder.success(held);
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}