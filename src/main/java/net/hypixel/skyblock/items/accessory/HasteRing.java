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
 * An {@link Accessory} that gives Haste I for 15 seconds when breaking any
 * block.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class HasteRing extends AccessoryItem {
	private static final Component info = Component
			.translatable("accessory.haste",
					Component.translatable(MobEffects.DIG_SPEED.getDescriptionId())
							.setStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.DIG_SPEED.getColor()))))
			.withStyle(ChatFormatting.GRAY);

	public HasteRing() {
		super(ItemProperties.mine_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}