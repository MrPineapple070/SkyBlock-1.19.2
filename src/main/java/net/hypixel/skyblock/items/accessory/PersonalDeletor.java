package net.hypixel.skyblock.items.accessory;

import java.util.List;

import javax.annotation.Nonnull;

import org.openjdk.nashorn.internal.ir.annotations.Immutable;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.init.AccessoryInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that will automatically delete any {@link Item} a
 * {@link Player} picks up.
 * 
 * @author MrPineapple070
 * @version 9 March 2020
 * @since 9 March 2020
 */
public abstract class PersonalDeletor extends PersonalAccessory {
	/**
	 * <a href="https://wiki.hypixel.net/Personal_Deletor_4000">Personal Deletor
	 * 4000</a>
	 * 
	 * @author MrPineapple070
	 * @version 9 March 2020
	 * @since 9 March 2020
	 */
	public static final class PersonalDel4000 extends PersonalDeletor {
		public PersonalDel4000() {
			super(Rarity.Uncommon, Type.Type4);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.personal_deletor_5000.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Personal_Deletor_5000">Personal Deletor
	 * 5000</a>
	 * 
	 * @author MrPineapple070
	 * @version 9 March 2020
	 * @since 9 March 2020
	 */
	public static final class PersonalDel5000 extends PersonalDeletor {
		public PersonalDel5000() {
			super(Rarity.Rare, Type.Type5);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.personal_deletor_6000.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Personal_Deletor_6000">Personal Deletor
	 * 6000</a>
	 * 
	 * @author MrPineapple070
	 * @version 9 March 2020
	 * @since 9 March 2020
	 */
	public static final class PersonalDel6000 extends PersonalDeletor {
		public PersonalDel6000() {
			super(Rarity.Epic, Type.Type6);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.personal_deletor_7000.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Personal_Deletor_7000">Personal Deletor
	 * 7000</a>
	 * 
	 * @author MrPineapple070
	 * @version 9 March 2020
	 * @since 9 March 2020
	 */
	public static final class PersonalDel7000 extends PersonalDeletor {
		public PersonalDel7000() {
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
	protected static final Component info = Component.translatable("accessory.del").withStyle(ChatFormatting.GRAY);

	/**
	 * Constructor
	 * 
	 * @param rarity {@link Rarity}
	 * @param type   {@link Type}
	 */
	public PersonalDeletor(final Rarity rarity, final Type type) {
		super(rarity, type);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof final Player player))
			return;
		for (final ItemStack s : this.items) {
			if (stack.isEmpty())
				continue;
			player.getInventory().removeItem(s);
		}
	}
}