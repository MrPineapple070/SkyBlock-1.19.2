package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that increases the player's speed by 10% while in <br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Mine_Affinity_Talisman">Mine
 * Affinity Talisman</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class MineAffinityTalisman extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.mine", StatString.speed).withStyle(ChatFormatting.GRAY);

	public MineAffinityTalisman() {
		super(ItemProperties.mine_1, Rarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}