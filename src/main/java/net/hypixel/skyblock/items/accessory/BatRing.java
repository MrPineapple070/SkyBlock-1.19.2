package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.init.AccessoryInit;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that buffs.<br>
 * <a href="https://wiki.hypixel.net/Bat_Ring">Bat Ring</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/93c8aa3fde295fa9f9c27f734bdbab11d33a2e43e855accd7465352377413b">Texture</a>.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class BatRing extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component
			.translatable("accessory.bat_ring", StatString.health, StatString.speed, StatString.intelligence)
			.withStyle(ChatFormatting.GRAY);
	
	/**
	 * Constructor
	 */
	public BatRing() {
		super(ItemProperties.combat_1, Rarity.Epic);
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
		return new ItemStack(AccessoryInit.bat_artifact.get());
	}
}