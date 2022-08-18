package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class PersonalDeletor extends PersonalAccessory {
	public static final class PersonalDel4000 extends PersonalDeletor {
		public PersonalDel4000() {
			super(Rarity.Uncommon, Type.Type4);
		}
	}

	public static final class PersonalDel5000 extends PersonalDeletor {
		public PersonalDel5000() {
			super(Rarity.Rare, Type.Type5);
		}
	}

	public static final class PersonalDel6000 extends PersonalDeletor {
		public PersonalDel6000() {
			super(Rarity.Epic, Type.Type6);
		}
	}

	public static final class PersonalDel7000 extends PersonalDeletor {
		public PersonalDel7000() {
			super(Rarity.Legendary, Type.Type7);
		}
	}

	protected static final Component info = Component.translatable("accessory.del").withStyle(ChatFormatting.GRAY);

	public PersonalDeletor(final Rarity rarity, final Type type) {
		super(ItemProperties.mine_1, rarity, type);
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(info);
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
		if (level.isClientSide || !(entity instanceof Player player))
			return;
		for (final ItemStack s : this.items) {
			if (stack.isEmpty())
				continue;
			player.getInventory().removeItem(s);
		}
	}
}