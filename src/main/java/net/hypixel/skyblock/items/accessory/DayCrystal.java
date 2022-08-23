package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

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
 * An {@link AccessoryItem} that empowers the {@link Player} during the day.<br>
 * <a href="https://wiki.hypixel.net/Day_Crystal">Day Crystal</a>
 *
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public class DayCrystal extends AccessoryItem {
	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ATTACK_DAMAGE}
	 * by 10.
	 */
	private static final AttributeModifier attack_mod = new AttributeModifier(
			Attributes.ATTACK_DAMAGE.getDescriptionId(), 0xA, Operation.ADDITION);

	/**
	 * An {@link AttributeModifier} that increases {@link Attributes#ARMOR} by 10.
	 */
	private static final AttributeModifier defense_mod = new AttributeModifier(Attributes.ARMOR.getDescriptionId(), 0xA,
			Operation.ADDITION);

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component info = Component
			.translatable("accessory.day_crystal", StatString.strength, StatString.defense)
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 */
	public DayCrystal() {
		super(ItemProperties.mine_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide)
			return;
		if (level.isNight())
			return;
		if (entity instanceof Player player) {
			final AttributeInstance atk_dmg = player.getAttribute(Attributes.ATTACK_DAMAGE);
			final AttributeInstance def = player.getAttribute(Attributes.ARMOR);
			atk_dmg.addTransientModifier(attack_mod);
			def.addTransientModifier(defense_mod);
		}
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}