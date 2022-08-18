package net.hypixel.skyblock.items.bait;

import java.util.List;

import net.hypixel.skyblock.items.ModItem;
import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public abstract class Bait extends ModItem {
	public Bait(final Rarity rarity) {
		super(ItemProperties.fish_64, rarity);
	}

	@Override
	public abstract void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag);
	
	@Override
	public Component getName(ItemStack stack) {
		return Component.translatable(this.getDescriptionId()).withStyle(rarity.color);
	}
}
