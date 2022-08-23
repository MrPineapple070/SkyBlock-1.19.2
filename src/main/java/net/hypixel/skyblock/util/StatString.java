package net.hypixel.skyblock.util;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

/**
 * Holds commonly used {@link String} and {@link TranslatableComponent}
 *
 * @author MrPineapple070
 * @version 12 March 2021
 * @since 11 July 2019
 */
@Immutable
public final class StatString {
	@Nonnull
	public static final MutableComponent ability_damage = Component.translatable("stat.ability_damage")
			.withStyle(ChatFormatting.RED);

	@Nonnull
	public static final MutableComponent attack_speed = Component.translatable("stat.attack_speed")
			.withStyle(ChatFormatting.YELLOW);

	@Nonnull
	public static final MutableComponent breaking_power = Component.translatable("stat.breaking_power")
			.withStyle(ChatFormatting.GRAY);

	@Nonnull
	public static final MutableComponent complete = Component.literal(String.valueOf(SpecialCharacters.complete))
			.withStyle(ChatFormatting.GREEN);

	@Nonnull
	public static final MutableComponent crit_chance = Component.translatable("stat.crit_chance")
			.withStyle(ChatFormatting.BLUE);

	@Nonnull
	public static final MutableComponent crit_damage = Component.translatable("stat.crit_damage")
			.withStyle(ChatFormatting.BLUE);

	@Nonnull
	public static final MutableComponent day = Component.literal(String.valueOf(SpecialCharacters.day))
			.withStyle(ChatFormatting.YELLOW);

	@Nonnull
	public static final MutableComponent defense = Component.translatable("stat.defense")
			.withStyle(ChatFormatting.GREEN);

	@Nonnull
	public static final MutableComponent farming_fortune = Component.translatable("stat.farming_fortune")
			.withStyle(ChatFormatting.GOLD);

	@Nonnull
	public static final MutableComponent ferocity = Component.translatable("stat.ferocity")
			.withStyle(ChatFormatting.RED);

	@Nonnull
	public static final MutableComponent fishing_speed = Component.translatable("stat.fishing_speed")
			.withStyle(ChatFormatting.GREEN);

	@Nonnull
	public static final MutableComponent foraging_fortune = Component.translatable("stat.foraging_fortune")
			.withStyle(ChatFormatting.GOLD);

	@Nonnull
	public static final MutableComponent health = Component.translatable("stat.health").withStyle(ChatFormatting.RED);

	@Nonnull
	public static final MutableComponent incomplete = Component.literal(String.valueOf(SpecialCharacters.incomplete))
			.withStyle(ChatFormatting.RED);

	@Nonnull
	public static final MutableComponent intelligence = Component.translatable("stat.intelligence")
			.withStyle(ChatFormatting.AQUA);

	@Nonnull
	public static final MutableComponent level_up = Component.translatable(String.valueOf(SpecialCharacters.level_up))
			.withStyle(ChatFormatting.DARK_GRAY);

	@Nonnull
	public static final MutableComponent magic_find = Component.translatable("stat.magic_find")
			.withStyle(ChatFormatting.AQUA);

	@Nonnull
	public static final MutableComponent mana = Component.translatable("stat.mana").withStyle(ChatFormatting.AQUA);

	@Nonnull
	public static final MutableComponent mining_fortune = Component.translatable("stat.mining_fortune")
			.withStyle(ChatFormatting.GOLD);

	@Nonnull
	public static final MutableComponent mining_speed = Component.translatable("stat.mining_speed")
			.withStyle(ChatFormatting.YELLOW);

	@Nonnull
	public static final MutableComponent night = Component.literal(String.valueOf(SpecialCharacters.night))
			.withStyle(ChatFormatting.AQUA);

	@Nonnull
	public static final MutableComponent pet_luck = Component.translatable("stat.pet_luck")
			.withStyle(ChatFormatting.LIGHT_PURPLE);

	@Nonnull
	public static final MutableComponent pristine = Component.translatable("stat.pristine")
			.withStyle(ChatFormatting.DARK_PURPLE);

	@Nonnull
	public static final MutableComponent requirement_slayer = Component
			.literal(SpecialCharacters.requirement_slayer + " Required").withStyle(ChatFormatting.DARK_RED);

	@Nonnull
	public static final MutableComponent requirment = Component.literal(SpecialCharacters.requirement + " Required")
			.withStyle(ChatFormatting.DARK_RED);

	@Nonnull
	public static final MutableComponent sea_creature_chance = Component.translatable("stat.sea_creature_chance")
			.withStyle(ChatFormatting.DARK_AQUA);

	@Nonnull
	public static final MutableComponent speed = Component.translatable("stat.speed").withStyle(ChatFormatting.WHITE);

	@Nonnull
	public static final MutableComponent strength = Component.translatable("stat.strength")
			.withStyle(ChatFormatting.RED);

	@Nonnull
	public static final MutableComponent true_def = Component.translatable("stat.true_defense")
			.withStyle(ChatFormatting.WHITE);

	public static final MutableComponent vitality = Component.translatable("stat.vitality")
			.withStyle(ChatFormatting.DARK_RED);

	/**
	 * Constructs a {@link Component} to append using
	 * {@link Item#getName(net.minecraft.world.item.ItemStack)}
	 * 
	 * @param value how many times an {@link Item} has been upgraded
	 * @return constructed {@link Component}
	 */
	public static Component dungeon(final int value) {
		if (value < 0 || value > 14)
			throw new IllegalArgumentException("Illegal essence value:\t" + value);

		String gold_star = "", blue_star = "", purple_star = "";
		if (0 <= value && value <= 4)
			for (int i = 0; i < value; ++i)
				gold_star += SpecialCharacters.dungeon_star;
		else if (5 <= value && value <= 9)
			for (int i = 5; i < value; ++i)
				purple_star += SpecialCharacters.dungeon_star;
		else
			for (int i = 10; i < value; ++i)
				blue_star += SpecialCharacters.dungeon_star;

		return Component.literal(blue_star).withStyle(ChatFormatting.AQUA)
				.append(Component.literal(purple_star).withStyle(ChatFormatting.DARK_PURPLE))
				.append(Component.literal(gold_star).withStyle(ChatFormatting.GOLD));
	}

	/**
	 * Constructs a {@link Component} indicated how much Mithril or Crystal Powder a
	 * {@link Player} has
	 * 
	 * @param powder  the amount of powder a {@link Player} has
	 * @param mithril determine if mithril or crystal powder is being constructed
	 * @return constructed {@link Component}
	 */
	public static Component powder(final int powder, final boolean mithril) {
		return Component.literal(String.format("\u1808 %d", powder))
				.withStyle(mithril ? ChatFormatting.GREEN : ChatFormatting.LIGHT_PURPLE);
	}

	/**
	 * Constructs a {@link Component} to display how many tickers an {@link Item}
	 * has
	 * 
	 * @param ticker amount of tickers
	 * @return constructed {@link Component}
	 */
	public static Component ticker(final int ticker) {
		return Component.literal(String.format("%d " + SpecialCharacters.ticker, ticker))
				.withStyle(ChatFormatting.YELLOW);
	}
}