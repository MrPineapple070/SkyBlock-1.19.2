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
 * An {@link Accessory} that increases the Player's speed.
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Cheetah_Talisman">Cheetah
 * Talisman</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class CheetahTalisman extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.cheetah_talisman", StatString.speed)
			.withStyle(ChatFormatting.GRAY);

	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#MOVEMENT_SPEED}
	 * by 2%
	 */
	public static final AttributeModifier speed_mod = new AttributeModifier(
			Attributes.MOVEMENT_SPEED.getDescriptionId(), .002, Operation.ADDITION);

	public CheetahTalisman() {
		super(ItemProperties.combat_1, Rarity.Epic);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level worldIn, final Entity entityIn, final int slot,
			final boolean selected) {
		if (worldIn.isClientSide || !(entityIn instanceof Player player))
			return;
		final AttributeInstance spd = player.getAttribute(Attributes.MOVEMENT_SPEED);
		try {
			spd.addTransientModifier(speed_mod);
		} catch (final IllegalArgumentException iae) {
			return;
		}
	}
}