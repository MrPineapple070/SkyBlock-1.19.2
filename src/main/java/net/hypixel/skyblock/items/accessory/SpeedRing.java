package net.hypixel.skyblock.items.accessory;

import java.util.List;

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
 * An {@link Accessory} that gives +3% speed.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Speed_Ring">Speed Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SpeedRing extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.speed", "3%", StatString.speed)
			.withStyle(ChatFormatting.GRAY);

	public SpeedRing() {
		super(ItemProperties.farm_1, Rarity.Uncommon);
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
}