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
 * An {@link Accessory} that causes coins to drop when Monsters are killed.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Scavenger_Talisman">Scavenger
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class ScavengerTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.scavenger");

	public ScavengerTalisman() {
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