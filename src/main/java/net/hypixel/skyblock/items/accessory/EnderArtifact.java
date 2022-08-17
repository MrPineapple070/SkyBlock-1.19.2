package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that reduces the amount of damage taken from
 * {@link EnderDragon}, {@link Endermite} and {@link EnderMan}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Ender_Artifact">Ender
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class EnderArtifact extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.ender_artifact").withStyle(ChatFormatting.GRAY);

	public EnderArtifact() {
		super(ItemProperties.combat_1, Rarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}