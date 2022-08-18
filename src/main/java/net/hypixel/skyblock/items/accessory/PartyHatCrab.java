package net.hypixel.skyblock.items.accessory;

import java.util.List;
import java.util.Objects;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that grants +1
 * <font style="color:#55FFFF">Intelligence</font> per in-game year played.<Br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Crab_Hat_of_Celebration">Crab Hat
 * of Celebration</a>
 *
 * @author MrPineapple070
 * @version 27 July 2020
 */
public class PartyHatCrab extends AccessoryItem {
	private static final Component info = Component.translatable("accessory.party_hat", StatString.intelligence)
			.withStyle(ChatFormatting.GRAY);

	/**
	 * The {@link DyeColor} of this.
	 */
	private final DyeColor color;

	/**
	 * @param color {@link DyeColor} for this.
	 */
	public PartyHatCrab(final DyeColor color) {
		super(ItemProperties.combat_1, Rarity.Common);
		switch (Objects.requireNonNull(color, "Must have a color.")) {
		case RED:
		case ORANGE:
		case YELLOW:
		case LIME:
		case GREEN:
		case LIGHT_BLUE:
		case PURPLE:
		case PINK:
		case BLACK:
			this.color = color;
			break;
		default:
			throw new IllegalArgumentException("Illegal color: " + color);
		}
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	/**
	 * @return {@link #color}
	 */
	public DyeColor getColor() {
		return this.color;
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
	}
}