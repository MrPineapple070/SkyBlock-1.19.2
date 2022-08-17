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
 * An {@link Accessory} that heals .1 when killing a monster.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Devour_Ring">Devour
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class DevourRing extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.devour_ring", StatString.health);

	public DevourRing() {
		super(ItemProperties.combat_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}