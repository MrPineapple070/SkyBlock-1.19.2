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
 * The <a href="https://hypixel-skyblock.fandom.com/wiki/Treasure_Ring">Treasure
 * Ring</a>.
 *
 * @author MrPineapple070
 * @version 19 August 2020
 * @since 19 August 2020
 */
public class TreasureRing extends AccessoryItem{
	public static final Component info = Component.translatable("accessory.treasure", 2);

	public TreasureRing() {
		super(ItemProperties.boss_1, Rarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}