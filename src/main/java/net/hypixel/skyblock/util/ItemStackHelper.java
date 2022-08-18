package net.hypixel.skyblock.util;

import java.util.List;
import java.util.function.Predicate;

import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;

/**
 * {@link ItemStack} helper
 *
 * @author MrPineapple070
 * @since 11 June 2019
 * @version 17 August 2022
 */
public class ItemStackHelper {
	/**
	 * Clears or Counts Matching {@link ItemStack} in a {@link Container}
	 *
	 * @param container {@link Container}
	 * @param predicate {@link Predicate} testing for matching {@link ItemStack}
	 * @param min       minimum amount of items in the stack
	 * @param isCount   force {@link ItemStack#getCount()}
	 * @return
	 */
	public static int clearOrCountMatchingItems(final Container container, final Predicate<ItemStack> predicate,
			final int min, final boolean isCount) {
		int count = 0;

		for (int j = 0; j < container.getContainerSize(); ++j) {
			final ItemStack stack = container.getItem(j);
			final int k = clearOrCountMatchingItems(stack, predicate, min - count, isCount);
			if (k > 0 && !isCount && stack.isEmpty())
				container.setItem(j, ItemStack.EMPTY);
			count += k;
		}

		return count;
	}

	/**
	 * Clears or Counts matching {@link ItemStack}
	 *
	 * @param stack     {@link ItemStack} to check
	 * @param predicate {@link Predicate} testing for matching {@link ItemStack}
	 * @param min       the minimum number of items in the stack
	 * @param isCount   force {@link ItemStack#getCount()}
	 * @return amount of items cleared
	 */
	public static int clearOrCountMatchingItems(final ItemStack stack, final Predicate<ItemStack> predicate,
			final int min, final boolean isCount) {
		if (!stack.isEmpty() && predicate.test(stack)) {
			if (isCount)
				return stack.getCount();

			final int count = min < 0 ? stack.getCount() : Math.min(min, stack.getCount());
			stack.shrink(count);
			return count;
		}
		return 0;
	}

	/**
	 * Load items from {@link CompoundTag} to a {@link NonNullList} of
	 * {@link ItemStack}
	 *
	 * @param tag  {@link CompoundTag} to load from
	 * @param list {@link NonNullList} of {@link ItemStack} to load to
	 */
	public static void loadAllItems(final CompoundTag tag, final NonNullList<ItemStack> list) {
		final ListTag l_tag = tag.getList("Items", 10);

		for (int i = 0; i < l_tag.size(); ++i) {
			final CompoundTag c_tag = l_tag.getCompound(i);
			final int j = c_tag.getByte("Slot") & 255;
			if (j >= 0 && j < list.size())
				list.set(j, ItemStack.of(c_tag));
		}
	}

	/**
	 * Decrease the size of an {@link ItemStack} from a {@link List} at index by
	 * count
	 *
	 * @param list  {@link List} of {@link ItemStack} to edit
	 * @param index index of {@link ItemStack}
	 * @param count amount to reduce
	 * @return {@link ItemStack} removed or {@link ItemStack#EMPTY}
	 */
	public static ItemStack removeItem(final List<ItemStack> list, final int index, final int count) {
		return index >= 0 && index < list.size() && !list.get(index).isEmpty() && count > 0
				? list.get(index).split(count)
				: ItemStack.EMPTY;
	}

	/**
	 * Saves a {@link NonNullList} of {@link ItemStack} to {@link CompoundTag}
	 *
	 * @param tag  {@link CompoundTag} to save to.
	 * @param list {@link NonNullList} of {@link ItemStack} to save
	 * @return {@link CompoundTag} of list saved
	 */
	public static CompoundTag saveAllItems(final CompoundTag tag, final NonNullList<ItemStack> list) {
		return saveAllItems(tag, list, true);
	}

	/**
	 * Saves a {@link NonNullList} of {@link ItemStack} to a {@link CompoundTag}
	 *
	 * @param tag       {@link CompoundTag} to save to
	 * @param list      {@link NonNullList} of {@link ItemStack} to save
	 * @param saveItems force save of Items regardless of list size
	 * @return {@link CompoundTag} of list saved.
	 */
	public static CompoundTag saveAllItems(final CompoundTag tag, final NonNullList<ItemStack> list,
			final boolean saveItems) {
		final ListTag listnbt = new ListTag();

		for (int i = 0; i < list.size(); ++i) {
			final ItemStack stack = list.get(i);
			if (!stack.isEmpty()) {
				final CompoundTag compoundnbt = new CompoundTag();
				compoundnbt.putByte("Slot", (byte) i);
				stack.save(compoundnbt);
				listnbt.add(compoundnbt);
			}
		}

		if (!listnbt.isEmpty() || saveItems)
			tag.put("Items", listnbt);

		return tag;
	}

	/**
	 * Completely removes an {@link ItemStack} from a {@link List} at index
	 *
	 * @param list  {@link List} of {@link ItemStack} to remove from
	 * @param index index to remove at
	 * @return {@link ItemStack} removed or {@link ItemStack#EMPTY}
	 */
	public static ItemStack takeItem(final List<ItemStack> list, final int index) {
		return index >= 0 && index < list.size() ? list.set(index, ItemStack.EMPTY) : ItemStack.EMPTY;
	}
}