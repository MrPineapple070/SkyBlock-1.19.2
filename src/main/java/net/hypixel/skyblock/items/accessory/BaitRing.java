package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.bait.Bait;
import net.hypixel.skyblock.items.init.AccessoryInit;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that have a 5% chance to not consume
 * {@link Bait}.<br>
 * <a href="https://wiki.hypixel.net/Bait_Ring">Bait Ring</a>.
 *
 * @author MrPineapple070
 * @version 02 July 2019
 * @since 02 July 2019
 */
public class BaitRing extends AccessoryItem {
	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component.translatable("accessory.bait_ring").withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public BaitRing() {
		super(ItemProperties.fish_1, Rarity.Rare);
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
		this.active = this.hasUpgrade(player);
		if (!this.active)
			return;
		if (player.fishing == null)
			return;
		if (level.getRandom().nextInt(100) >= 5)
			logger.debug("Bait consume");
	}

	@Override
	protected ItemStack getUpgrade() {
		return new ItemStack(AccessoryInit.spiked_atrocity.get());
	}
}