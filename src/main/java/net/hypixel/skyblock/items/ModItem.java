package net.hypixel.skyblock.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModItem extends Item {
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
	public Component getName(final ItemStack stack) {
		return Component.translatable(this.getDescriptionId()).withStyle(this.rarity.color);
	}
}
