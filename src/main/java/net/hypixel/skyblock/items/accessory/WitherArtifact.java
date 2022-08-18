package net.hypixel.skyblock.items.accessory;

import java.util.List;

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
 * An {@link Accessory} that reduces the damage taken from {@link WitherBoss} by
 * 20%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Wither_Artifact">Wither
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class WitherArtifact extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.wither").withStyle(ChatFormatting.GRAY);

	public WitherArtifact() {
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