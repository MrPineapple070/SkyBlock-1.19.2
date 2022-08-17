package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that ensures that every 10th hit on the same
 * {@link Entity} will do 10% more damage.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Tarantula_Talisman">Tarantula
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class TarantulaTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.tarantula").withStyle(ChatFormatting.GRAY);

	public TarantulaTalisman() {
		super(ItemProperties.combat_1, Rarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}