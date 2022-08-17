package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that grants Night Vision I.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Night_Vision_Charm">Night
 * Vision Charm</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class NightVisionCharm extends AccessoryItem{
	private static final Component info = Component.translatable("accessory.night_vision",
			((MutableComponent) MobEffects.NIGHT_VISION.getDisplayName())
			.withStyle(Style.EMPTY.withColor(TextColor.fromRgb(MobEffects.NIGHT_VISION.getColor()))));

	private static final MobEffectInstance night_vision = new MobEffectInstance(MobEffects.NIGHT_VISION, 1, 1);

	public NightVisionCharm() {
		super(ItemProperties.farm_1, Rarity.Common);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		((Player) entity).addEffect(night_vision);
	}
}