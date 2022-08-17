package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.bait.Bait;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that have a 5% chance to not consume {@link Bait}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bait_Ring">Bait
 * Ring</a>.<br>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class BaitRing extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.bait_ring");

	public BaitRing() {
		super(ItemProperties.fish_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		final Player player = (Player) entity;
		if (player.fishing == null)
			return;
		if (level.getRandom().nextInt(100) >= 5)
			logger.debug("Bait consume");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return InteractionResultHolder.pass(player.getItemInHand(hand));
	}
}