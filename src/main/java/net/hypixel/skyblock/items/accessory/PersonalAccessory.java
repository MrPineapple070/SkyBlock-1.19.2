package net.hypixel.skyblock.items.accessory;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.ItemStackHelper;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

public abstract class PersonalAccessory extends AccessoryItem {
	/**
	 * How many items these {@link AccessoryItem} will interact with
	 * 
	 * @author MrPineapple070
	 * @version 3 December 2020
	 * @since 7 June 2020
	 */
	public enum Type {
		Type4, Type5, Type6, Type7;
	}

	/**
	 * The list of {@link ItemStack}
	 */
	@Nonnull
	public final NonNullList<ItemStack> items;

	/**
	 * {@link Type} to distinguish between different types
	 */
	@Nonnull
	protected final Type type;

	/**
	 * Constructor
	 * 
	 * @param rarity {@link Rarity}
	 * @param type   {@link Type}
	 */
	public PersonalAccessory(final Rarity rarity, final Type type) {
		super(ItemProperties.mine_1, rarity);
		this.type = Objects.requireNonNull(type, "PersonalAccessory.Type cannot be null");
		switch (this.type) {
		case Type4:
			this.items = NonNullList.withSize(1, ItemStack.EMPTY);
			break;
		case Type5:
			this.items = NonNullList.withSize(3, ItemStack.EMPTY);
			break;
		case Type6:
			this.items = NonNullList.withSize(7, ItemStack.EMPTY);
			break;
		case Type7:
			this.items = NonNullList.withSize(12, ItemStack.EMPTY);
			break;
		default:
			throw new IllegalArgumentException("Illegal Personal Compactor type:\t" + this.type.name());
		}
	}

	/**
	 * Decreases {@link ItemStack} in indicated index by count. Edits {@link #items}
	 *
	 * @param index index to decrease
	 * @param count amount to decrease by
	 * @return {@link ItemStackHelper#removeItem(List, int, int)}
	 */
	public ItemStack decrStackSize(final int index, final int count) {
		return ItemStackHelper.removeItem(this.items, index, count);
	}

	/**
	 * Removed {@link ItemStack} in indecated index. Edits {@link #items}
	 *
	 * @param index index to remove
	 * @return removed {@link ItemStack}
	 */
	public ItemStack removeStackFromSlot(final int index) {
		return ItemStackHelper.takeItem(this.items, index);
	}
}