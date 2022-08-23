package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that gives +5% speed.<br>
 * <a href="https://wiki.hypixel.net/Speed_Artifact">Speed Artifact</a>
 *
 * @author MrPineapple070
 * @version 21 May 2020
 * @since 11 June 2019
 */
public class SpeedArtifact extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.speed", "5%", StatString.speed)
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public SpeedArtifact() {
		super(ItemProperties.farm_1, Rarity.Rare);
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
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}