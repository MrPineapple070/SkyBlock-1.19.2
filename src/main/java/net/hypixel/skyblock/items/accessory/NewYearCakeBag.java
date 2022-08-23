package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that grants +1 Health for each unique NewYearCake<br>
 * <a href="https://wiki.hypixel.net/New_Year_Cake_Bag">New Year Cake Bag.</a>
 *
 * @author MrPineapple070
 * @version 17 December 2019
 * @since 27 October 2019
 */
public class NewYearCakeBag extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.new", StatString.speed)
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Inventory
	 */
	protected final NonNullList<ItemStack> contents = NonNullList.withSize(54, ItemStack.EMPTY);

	/**
	 * Constructor
	 */
	public NewYearCakeBag() {
		super(ItemProperties.combat_1, Rarity.Uncommon);
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