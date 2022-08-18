package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that reduces the damage taken from {@link Spider} and
 * {@link CaveSpider}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Spider_Talisman">Spider
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class SpiderTalisman extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.spider", "5%")
			.withStyle(ChatFormatting.GRAY);

	public SpiderTalisman() {
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
}