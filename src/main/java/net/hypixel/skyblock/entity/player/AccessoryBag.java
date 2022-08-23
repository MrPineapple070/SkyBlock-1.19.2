package net.hypixel.skyblock.entity.player;

import java.util.Objects;

import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.Nameable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class AccessoryBag implements Container, Nameable {
	protected static final Component NAME = Component.translatable("container.accessory_bag");

	protected final NonNullList<ItemStack> contents = NonNullList.withSize(267, ItemStack.EMPTY);
	public final Player player;

	public AccessoryBag(Player player) {
		this.player = Objects.requireNonNull(player, "Player cannot be null");
	}

	@Override
	public void clearContent() {
		this.contents.clear();
	}

	@Override
	public Component getName() {
		return NAME;
	}

	@Override
	public int getContainerSize() {
		return this.contents.size();
	}

	@Override
	public boolean isEmpty() {
		for (final ItemStack stack : this.contents)
			if (!stack.isEmpty())
				return false;

		return true;
	}

	@Override
	public ItemStack getItem(int index) {
		return this.contents.get(index);
	}

	@Override
	public ItemStack removeItem(int index, int amount) {
		return !this.contents.get(index).isEmpty() ? ContainerHelper.removeItem(this.contents, index, amount)
				: ItemStack.EMPTY;
	}

	@Override
	public ItemStack removeItemNoUpdate(int index) {
		final ItemStack stack = this.contents.get(index);
		if (!stack.isEmpty()) {
			this.contents.set(index, ItemStack.EMPTY);
			return stack;
		}
		return ItemStack.EMPTY;
	}

	@Override
	public void setItem(int index, ItemStack stack) {
		this.contents.set(index, stack);
	}

	@Override
	public void setChanged() {
	}

	@Override
	public boolean stillValid(Player player) {
		return this.player.isRemoved() ? false : player.distanceToSqr(this.player) <= 64d;
	}

	public boolean contains(Item item) {
		for (final ItemStack stack : this.contents)
			if (stack.is(item))
				return true;
		return false;
	}

	public void tick() {
		for (final ItemStack stack : this.contents)
			if (!stack.isEmpty())
				stack.inventoryTick(this.player.level, this.player, 0, false);
	}
}
