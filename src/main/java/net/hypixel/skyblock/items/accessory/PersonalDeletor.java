package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
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

	protected static final Component disc = Component.translatable("accessory.del");

	public PersonalDeletor(Rarity rarity, Type type) {
		super(ItemProperties.mine_1, rarity, type);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
		if (level.isClientSide)
			return;
		if (!(entity instanceof Player))
			return;
		Player player = (Player) entity;
		for (ItemStack s : this.items) {
			if (stack.isEmpty())
				continue;
			player.getInventory().removeItem(s);
		}
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(disc);
	}
}