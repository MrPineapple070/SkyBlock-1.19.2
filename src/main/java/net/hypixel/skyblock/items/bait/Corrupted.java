package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ModDimentions;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class Corrupted extends Bait {
	public static final Component info = Component.translatable("bait.corrupted", StatString.fishing_speed,
			ModDimentions.nether.withStyle(ChatFormatting.DARK_RED)).withStyle(ChatFormatting.GRAY);

	public Corrupted() {
		super(Rarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}
}
