package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.init.AccessoryInit;
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
 * These {@link AccessoryItem} heal the Player while it is on fire.<br>
 * <a href=
 * "https://wiki.hypixel.net/Campfire_Initiate_Badge">Initiate</a><br>
 * <a href=
 * "https://wiki.hypixel.net/Campfire_Adept_Badge">Adept</a><br>
 * <a href=
 * "https://wiki.hypixel.net/Campfire_Cultist_Badge">Cultist</a><br>
 * <a href=
 * "https://wiki.hypixel.net/Campfire_Scion_Badge">Scion</a><br>
 * <a href=
 * "https://wiki.hypixel.net/Campfire_God_Badge">Godly</a><br>
 *
 * @author MrPineapple070
 * @version 25 July 2020
 */
public abstract class CampfireTalisman extends AccessoryItem {
	public static class CampfireTalisman0 extends CampfireTalisman {
		public CampfireTalisman0() {
			super(Rarity.Common, 0);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.campfire_talisman_1.get());
		}
	}

	public static class CampfireTalisman1 extends CampfireTalisman {
		public CampfireTalisman1() {
			super(Rarity.Uncommon, 4);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.campfire_talisman_2.get());
		}
	}

	public static class CampfireTalisman2 extends CampfireTalisman {
		public CampfireTalisman2() {
			super(Rarity.Rare, 8);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.campfire_talisman_3.get());
		}
	}

	public static class CampfireTalisman3 extends CampfireTalisman {
		public CampfireTalisman3() {
			super(Rarity.Epic, 13);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.campfire_talisman_4.get());
		}
	}

	public static class CampfireTalisman4 extends CampfireTalisman {
		public CampfireTalisman4() {
			super(Rarity.Legendary, 21);
		}

		@Override
		protected ItemStack getUpgrade() {
			return ItemStack.EMPTY;
		}
	}

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component level_0 = Component.translatable("campfire_talisman.0")
			.withStyle(Rarity.Common.color);

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component level_1 = Component.translatable("campfire_talisman.1")
			.withStyle(Rarity.Uncommon.color);

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component level_2 = Component.translatable("campfire_talisman.2").withStyle(Rarity.Rare.color);

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component level_3 = Component.translatable("campfire_talisman.3").withStyle(Rarity.Epic.color);

	/**
	 * {@link Component} to append using
	 * {@link #appendHoverText(ItemStack, Level, List, TooltipFlag)}
	 */
	@Nonnull
	@Immutable
	private static final Component level_4 = Component.translatable("campfire_talisman.4")
			.withStyle(Rarity.Legendary.color);

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

	/**
	 * Constructor
	 * 
	 * @param rarity {@link Rarity}
	 * @param level  amount this will heal
	 */
	public CampfireTalisman(final Rarity rarity, final int level) {
		super(ItemProperties.combat_1, rarity);
		this.level = level;
		this.heal = .8f + .4f * this.level;
		this.tick = 0;
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(Component.translatable("accessory.campfire", this.heal, StatString.health)
				.withStyle(ChatFormatting.GRAY));
		tooltip.add(Component.literal(String.valueOf(this.level)).withStyle(ChatFormatting.GRAY));
	}

	/**
	 * @return {@link #level}
	 */
	public int getLevel() {
		return this.level;
	}

	@Override
	public Component getName(final ItemStack stack) {
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
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof final Player player))
			return;
		this.tick = ++this.tick % 20;
		if (this.tick != 0)
			return;
		if (player.isOnFire())
			player.heal(this.heal);
	}
}