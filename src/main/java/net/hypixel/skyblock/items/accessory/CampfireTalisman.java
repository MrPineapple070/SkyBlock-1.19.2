package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * These {@link Accessory} heal the Player while it is on fire.<br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Initiate_Badge">Initiate</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Adept_Badge">Adept</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Cultist_Badge">Cultist</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_Scion_Badge">Scion</a><br>
 * <a href=
 * "https://hypixel-skyblock.fandom.com/wiki/Campfire_God_Badge">Godly</a><br>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public class CampfireTalisman extends AccessoryItem {
	/**
	 * A {@link ImmutableList} of {@link Float} for {@link #heal} based on
	 * {@link #level}
	 */
	@Nonnull
	private static final ImmutableList<Float> health = ImmutableList.of(.8f, 1.2f, 1.6f, 2f, 2.4f, 2.8f, 3.2f, 3.6f, 4f,
			4.4f, 4.8f, 5.2f, 5.6f, 6f, 6.4f, 6.8f, 7.2f, 7.6f, 8f, 8.4f, 8.8f, 9.2f, 9.6f, 10f, 10.4f, 10.8f, 11.2f,
			11.6f, 12f);

	@Nonnull
	private static final Component level_0 = Component.translatable("campfire_talisman.0")
			.withStyle(Rarity.Common.color);

	@Nonnull
	private static final Component level_1 = Component.translatable("campfire_talisman.1")
			.withStyle(Rarity.Uncommon.color);

	@Nonnull
	private static final Component level_2 = Component.translatable("campfire_talisman.2").withStyle(Rarity.Rare.color);

	@Nonnull
	private static final Component level_3 = Component.translatable("campfire_talisman.3").withStyle(Rarity.Epic.color);

	@Nonnull
	private static final Component level_4 = Component.translatable("campfire_talisman.4")
			.withStyle(Rarity.Legendary.color);

	public static class CampfireTalisman0 extends CampfireTalisman {
		public CampfireTalisman0() {
			super(Rarity.Common, 0);
		}
	}

	public static class CampfireTalisman1 extends CampfireTalisman {
		public CampfireTalisman1() {
			super(Rarity.Uncommon, 4);
		}
	}

	public static class CampfireTalisman2 extends CampfireTalisman {
		public CampfireTalisman2() {
			super(Rarity.Rare, 8);
		}
	}

	public static class CampfireTalisman3 extends CampfireTalisman {
		public CampfireTalisman3() {
			super(Rarity.Epic, 13);
		}
	}

	public static class CampfireTalisman4 extends CampfireTalisman {
		public CampfireTalisman4() {
			super(Rarity.Legendary, 21);
		}
	}

	/**
	 * The amount of health points this heals per second.<br>
	 * This number must be positive.
	 */
	@Nonnegative
	private final float heal;

	/**
	 * The level of this.<br>
	 * This number must be between 0 and 29 (inclusive)
	 */
	@Nonnegative
	private final int level;

	/**
	 * Current tick
	 */
	private int tick;

	public CampfireTalisman(Rarity rarity, int level) {
		super(ItemProperties.combat_1, rarity);
		this.level = level;
		this.heal = health.get(this.level);
		this.tick = 0;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(Component.translatable("accessory.campfire", this.heal, StatString.health).withStyle(ChatFormatting.GRAY));
		tooltip.add(Component.literal(String.valueOf(this.level)).withStyle(ChatFormatting.GRAY));
	}

	/**
	 * @return {@link #level}
	 */
	public int getLevel() {
		return this.level;
	}

	@Override
	public Component getName(ItemStack stack) {
		if (this.level < 4)
			return level_0;
		else if (this.level < 8)
			return level_1;
		else if (this.level < 13)
			return level_2;
		else if (this.level < 21)
			return level_3;
		return level_4;
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		final Player player = (Player) entity;
		this.tick = ++this.tick % 20;
		if (this.tick != 0)
			return;
		if (player.isOnFire())
			player.heal(this.heal);
	}
}