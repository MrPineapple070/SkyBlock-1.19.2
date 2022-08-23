package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that reduces damage taken from
 * {@link WitherBoss}.<br>
 * <a href="https://wiki.hypixel.net/Wither_Relic>Wither Relic</a>.
 * 
 * @author MrPineapple070
 * @version 30 MArch 2021
 * @since 17 November 2020
 */
public class WitherRelic extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	protected static final Component info = Component.translatable("accessory.wither_relic")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public WitherRelic() {
		super(ItemProperties.combat_1, Rarity.Legendary);
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
