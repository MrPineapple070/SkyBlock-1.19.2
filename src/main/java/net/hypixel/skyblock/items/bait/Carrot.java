package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class Carrot extends Bait {
	private static final Component info = Component.translatable("bait.carrot").withStyle(ChatFormatting.GRAY);

	public Carrot() {
		super(Rarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}
