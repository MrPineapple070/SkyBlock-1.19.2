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
 * An {@link Accessory} that adds buffs.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Bat_Artifact">Bat
 * Artifact</a>.<br>
 * <a href=
 * "http://textures.minecraft.net/texture/382fc3f71b41769376a9e92fe3adbaac3772b999b219c9d6b4680ba9983e527">Texture</a>.
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class BatArtifact extends AccessoryItem {
	private static final Component info = Component
			.translatable("accessory.bat_artifact", StatString.health, StatString.speed, StatString.intelligence)
			.withStyle(ChatFormatting.GRAY);

	public BatArtifact() {
		super(ItemProperties.combat_1, Rarity.Legendary);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
	}
}