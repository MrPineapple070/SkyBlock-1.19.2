package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.init.AccessoryInit;
import net.hypixel.skyblock.util.ItemMap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * These {@link AccessoryItem} automatically turns certain materials in the
 * player's inventory into their enchanted form.<br>
 * The base for Personal Compactors.<br>
 *
 * @author MrPineapple070
 * @version 3 December 2020
 * @since 7 July 2020
 */
public abstract class PersonalCompactor extends PersonalAccessory {
	/**
	 * <a href="https://wiki.hypixel.net/Personal_Compactor_4000">Personal Compactor
	 * 4000</a><br>
	 * 
	 * @author MrPineapple070
	 * @version 7 July 2020
	 * @since 7 July 2020
	 */
	public static class PersonalComp4000 extends PersonalCompactor {
		public PersonalComp4000() {
			super(Rarity.Uncommon, Type.Type4);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.personal_compactor_5000.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Personal_Compactor_5000">Personal Compactor
	 * 5000</a><br>
	 * 
	 * @author MrPineapple070
	 * @version 7 July 2020
	 * @since 7 July 2020
	 */
	public static class PersonalComp5000 extends PersonalCompactor {
		public PersonalComp5000() {
			super(Rarity.Rare, Type.Type5);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.personal_compactor_6000.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Personal_Compactor_7000">Personal Compactor
	 * 7000</a><br>
	 * 
	 * @author MrPineapple070
	 * @version 7 July 2020
	 * @since 7 July 2020
	 */
	public static class PersonalComp6000 extends PersonalCompactor {
		public PersonalComp6000() {
			super(Rarity.Epic, Type.Type6);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.personal_compactor_7000.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Personal_Compactor_5000">Personal Compactor
	 * 7000</a><br>
	 * 
	 * @author MrPineapple070
	 * @version 3 December 2020
	 * @since 3 December 2020
	 */
	public static class PersonalComp7000 extends PersonalCompactor {
		public PersonalComp7000() {
			super(Rarity.Legendary, Type.Type7);
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
	private static final Component info = Component.translatable("accessory.comp").withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 * 
	 * @param rarity {@link Rarity}
	 * @param type   {@link Type}
	 */
	protected PersonalCompactor(final Rarity rarity, final Type type) {
		super(rarity, type);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	/**
	 * Determines indexes to super compact
	 * 
	 * @param item {@link Item} to find
	 * @return indexes found
	 */
	protected int[] getSuperCompIndex(final Item item) {
		logger.info("Finding super compactor indexes for: " + item.getDescriptionId());
		final int[] indexs = new int[3];
		int index = 0;
		boolean half = false;
		for (int i = this.items.size() - 1; i > -1; i--) {
			final ItemStack stack = this.items.get(i);
			if (stack.getItem().equals(item))
				switch (stack.getCount()) {
				case 32:
					if (!half) {
						indexs[index] = i;
						index++;
						half = true;
					}
					break;
				case 64:
					indexs[index] = i;
					index++;
					break;
				default:
					continue;
				}
			else
				continue;
		}
		return indexs;
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide || !(entity instanceof Player player))
			return;
		for (final ItemStack st : this.items) {
			final Item item = st.getItem();
			final Integer count = ItemMap.enchReqMap.get(item);
			if (count == null)
				continue;
			if (player.getInventory().countItem(item) >= count.intValue())
				for (final int index : this.getSuperCompIndex(item)) {
					final ItemStack s = this.items.get(index);
					if (s.getCount() < s.getMaxStackSize())
						this.decrStackSize(index, stack.getCount());
					else
						this.removeStackFromSlot(index);
				}
		}
	}
}