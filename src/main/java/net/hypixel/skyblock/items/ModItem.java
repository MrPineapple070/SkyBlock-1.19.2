package net.hypixel.skyblock.items;

import java.util.List;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;

/**
 * Base {@link Item} class for {@link SkyblockMod}.<br>
 * Adds a {@link Rarity} to each item that effects {@link #getName(ItemStack)}
 * 
 * @author MrPineapple070
 * @version 11 June 2019
 * @since 11 June 2019
 */
public abstract class ModItem extends Item {
	/**
	 * {@link Rarity} rarity of this
	 */
	public final Rarity rarity;

	/**
	 * Constructor
	 *
	 * @param properties {@link Properties} of this
	 * @param rarity     {@link Rarity} of this
	 */
	public ModItem(final Item.Properties properties, final Rarity rarity) {
		super(properties);
		this.rarity = rarity;
	}

	@Override
	public abstract void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag);

	@Override
	public boolean canApplyAtEnchantingTable(final ItemStack stack, final Enchantment enchantment) {
		return false;
	}

	@Override
	public Component getName(final ItemStack stack) {
		return Component.translatable(this.getDescriptionId()).withStyle(this.rarity.color);
	}
}
