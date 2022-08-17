package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that increases the duration of potions by 25%.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Potion_Affinity_Ring">Potion
 * Affinity Ring</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class PotionAffinityRing extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.potion", "25%");

	public PotionAffinityRing() {
		super(new Properties().stacksTo(1).tab(CreativeModeTab.TAB_BREWING), Rarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}