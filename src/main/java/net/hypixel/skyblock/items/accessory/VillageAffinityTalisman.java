package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;

/**
 * An {@link Accessory} that gives +10% speed while in certain
 * {@link Biome}.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Village_Affinity_Talisman">Village
 * Affinity Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class VillageAffinityTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.village", StatString.speed);

	public VillageAffinityTalisman() {
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