package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that grants {@link MobEffects#NIGHT_VISION}.<br>
 * <a href="https://wiki.hypixel.net/Night_Vision_Charm">Night Vision Charm</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class NightVisionCharm extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component
			.translatable("accessory.night_vision",
					Component.translatable(MobEffects.NIGHT_VISION.getDescriptionId())
							.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.NIGHT_VISION.getColor()))))
			.withStyle(ChatFormatting.GRAY);

	/**
	 * {@link MobEffectInstance} giving {@link Player}
	 * {@link MobEffects#NIGHT_VISION}
	 */
	@Nonnull
	@Immutable
	private static final MobEffectInstance night_vision = new MobEffectInstance(MobEffects.NIGHT_VISION, 1, 1);

	/**
	 * Constructor
	 */
	public NightVisionCharm() {
		super(ItemProperties.farm_1, Rarity.Common);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof final Player player))
			return;
		player.addEffect(night_vision);
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}