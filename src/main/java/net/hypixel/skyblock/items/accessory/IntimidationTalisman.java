package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that ensures that Monsters under level 1 will no longer
 * target the player.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Intimidation_Talisman">Intimidation
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class IntimidationTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.intimidation", 1);

	public IntimidationTalisman() {
		super(ItemProperties.combat_1, Rarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}