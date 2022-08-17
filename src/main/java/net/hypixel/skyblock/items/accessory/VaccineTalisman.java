package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that provides immunity to {@link Effects#POISON}.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Vaccine_Talisman">Vaccine
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 29 July 2020
 */
public class VaccineTalisman extends AccessoryItem {
	private static final Component info = Component
			.translatable("accessory.vaccine",
					Component.translatable(MobEffects.POISON.getDescriptionId())
							.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.POISON.getColor()))))
			.withStyle(ChatFormatting.GRAY);

	public VaccineTalisman() {
		super(ItemProperties.farm_1, Rarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}