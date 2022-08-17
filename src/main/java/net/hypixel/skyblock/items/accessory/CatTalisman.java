package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that increases the Player's speed.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Cat_Talisman">Cat
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class CatTalisman extends AccessoryItem{
	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#MOVEMENT_SPEED}
	 * by 1%
	 */
	public static final AttributeModifier speed_mod = new AttributeModifier(
			Attributes.MOVEMENT_SPEED.getDescriptionId(), .001, Operation.ADDITION);

	private static final Component info = Component.translatable("accessory.cat_talisman", StatString.speed).withStyle(ChatFormatting.GRAY);

	public CatTalisman() {
		super(ItemProperties.combat_1, Rarity.Uncommon);
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
		final Player player = (Player) entity;
		final AttributeInstance spd = player.getAttribute(Attributes.MOVEMENT_SPEED);
		spd.addTransientModifier(speed_mod);
	}
}