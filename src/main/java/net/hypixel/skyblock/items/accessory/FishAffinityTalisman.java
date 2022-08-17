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

/**
 * An {@link Accessory} that decreases fish catching by 5%.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Fish_Affinity_Talisman">Fish
 * Affinity Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class FishAffinityTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.fish_affinity",
			StatString.fishing_speed);

	public FishAffinityTalisman() {
		super(ItemProperties.fish_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}