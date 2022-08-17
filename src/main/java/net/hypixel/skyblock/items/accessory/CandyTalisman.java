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
 * An {@link Accessory} that increases the chance for mobs to drop Candy by
 * 5%<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Candy_Talisman">Candy
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CandyTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.candy_talisman").withStyle(ChatFormatting.GRAY);

	public CandyTalisman() {
		super(ItemProperties.combat_1, Rarity.Uncommon);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}