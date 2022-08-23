package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.init.AccessoryInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that increases the duration of potions by 25%.<br>
 * <a href= "https://wiki.hypixel.net/Potion_Affinity_Ring">Potion Affinity
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class PotionAffinityRing extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.potion", "25%")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public PotionAffinityRing() {
		super(new Properties().stacksTo(1).tab(CreativeModeTab.TAB_BREWING), Rarity.Uncommon);
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
		return new ItemStack(AccessoryInit.potion_affinity_artifact.get());
	}
}