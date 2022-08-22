package net.hypixel.skyblock.items.trophy_fish;

import java.util.List;

import net.hypixel.skyblock.items.ModItem;
import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * {@link Item} class for <a href="https://wiki.hypixel.net/Trophy_Fish>Trophy
 * Fish</a>.
 *
 * @author MrPineapple070
 * @version 2022 April 29
 * @since 2022 April 20
 */
public class TrophyFishItem extends ModItem {
	/**
	 * {@link Tier} of this Trophy Fish
	 */
	public final Tier tier;

	public TrophyFishItem(final Rarity rarity, final Tier tier) {
		super(ItemProperties.fish_64, rarity);
		this.tier = tier;
	}

	@Override
	public Component getName(final ItemStack stack) {
		return Component.translatable(this.getDescriptionId()).append(Component.literal(" "))
				.append(this.tier.getName());
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
	}
}
