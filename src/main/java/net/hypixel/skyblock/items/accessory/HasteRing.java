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
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that gives {@link MobEffects#DIG_SPEED} for 15 seconds
 * when breaking any block.
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class HasteRing extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component
			.translatable("accessory.haste",
					Component.translatable(MobEffects.DIG_SPEED.getDescriptionId())
							.setStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.DIG_SPEED.getColor()))))
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public HasteRing() {
		super(ItemProperties.mine_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide())
			return;
		if (!(entity instanceof final Player player))
			return;
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}