package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.bait.Bait;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that grants a 10% chance to not consume {@link Bait}
 * 
 * @author MrPineapple070
 * @version 16 April 2021
 * @since 16 April 2021
 */
public class SpikedAtrocity extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	protected static final Component info = Component.translatable("accessory.spiked_atrocity")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public SpikedAtrocity() {
		super(ItemProperties.fish_1, Rarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}
