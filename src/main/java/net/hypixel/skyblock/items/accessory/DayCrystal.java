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
 * An {@link Accessory} that empowers the {@link Player} during the
 * day.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Day_Crystal">Day
 * Crystal</a>
 *
 * @author MrPineapple070
 * @version 18 May 2020
 */
public class DayCrystal extends AccessoryItem{
	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ATTACK_DAMAGE}
	 * by 10.
	 */
	private static final AttributeModifier attack_mod = new AttributeModifier(
			Attributes.ATTACK_DAMAGE.getDescriptionId(), 0xA, Operation.ADDITION);

	private static final Component info = Component.translatable("accessory.day_crystal",
			StatString.strength, StatString.defense).withStyle(ChatFormatting.GRAY);

	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ARMOR} by 10.
	 */
	private static final AttributeModifier defense_mod = new AttributeModifier(Attributes.ARMOR.getDescriptionId(), 0xA,
			Operation.ADDITION);

	public DayCrystal() {
		super(ItemProperties.mine_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (worldIn.isClientSide)
			return;
		if (worldIn.isNight())
			return;
		if (entityIn instanceof Player) {
			final Player player = (Player) entityIn;
			final AttributeInstance atk_dmg = player.getAttribute(Attributes.ATTACK_DAMAGE);
			final AttributeInstance def = player.getAttribute(Attributes.ARMOR);
			atk_dmg.addTransientModifier(attack_mod);
			def.addTransientModifier(defense_mod);
		}
	}
}