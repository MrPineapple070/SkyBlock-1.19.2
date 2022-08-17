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
 * An {@link Accessory} that increases Crit Damage by 3%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Red_Claw_Ring">Red Claw
 * Ring</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class RedClawRing extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.red_claw",
			StatString.crit_damage, "3%").withStyle(ChatFormatting.GRAY);

	public RedClawRing() {
		super(ItemProperties.combat_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}