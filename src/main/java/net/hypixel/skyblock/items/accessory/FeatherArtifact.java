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
 * An {@link Accessory} that increases distance for fall damage by 10 blocks and
 * reduces fall damage by 15%.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Feather_Artifact">Feather
 * Artifact</a>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class FeatherArtifact extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.feather_artifact");

	public FeatherArtifact() {
		super(ItemProperties.farm_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}