package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that ensures that every 10th hit on the same
 * {@link Entity} will do 10% more damage.<br>
 * <a href= "https://wiki.hypixel.net/Tarantula_Talisman">Tarantula Talisman</a>
 *
 * @author MrPineapple070
 * @version 10 October 2019
 * @since 10 October 2019
 */
public class TarantulaTalisman extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.tarantula").withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public TarantulaTalisman() {
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
		return ItemStack.EMPTY;
	}
}