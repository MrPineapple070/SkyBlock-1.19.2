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
 * An {@link AccessoryItem} that increases Crit Damage by 3%.<br>
 * <a href="https://wiki.hypixel.net/Red_Claw_Ring">Red Claw Ring</a>
 *
 * @author MrPineapple070
 * @version 10 October 2019
 * @since 10 October 2019
 */
public class RedClawRing extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.red_claw", StatString.crit_damage, "3%")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public RedClawRing() {
		super(ItemProperties.combat_1, Rarity.Rare);
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
		return new ItemStack(AccessoryInit.red_claw_artifact.get());
	}
}