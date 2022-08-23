package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that saves the players held coins when dying.<br>
 * <a href="https://wiki.hypixel.net/Piggy_Bank">Piggy Bank</a>
 *
 * @author MrPineapple070
 * @version 4 December 2019
 * @since 11 June 2019
 */
public class PiggyBank extends AccessoryItem {
	/**
	 * The State of the piggy bank
	 * 
	 * @author MrPineapple070
	 * @version 4 December 2019
	 * @since 11 June 2019
	 */
	public enum State {
		@Deprecated
		Broken, Cracked, Normal;
	}

	/**
	 * Component holding how much a {@link State#Normal} will save
	 */
	private static final Component percent0 = Component.translatable("accessory.piggy.0")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Component holding how much a {@link State#Cracked} will save
	 */
	private static final Component percent1 = Component.translatable("accessory.piggy.1")
			.withStyle(ChatFormatting.GRAY);

	/**
	 * Component holding how much a {@link State#Broken} will save
	 */
	@Deprecated
	private static final Component percent2 = Component.translatable("accessory.piggy.2")
			.withStyle(ChatFormatting.GRAY);

	private State state;

	public PiggyBank() {
		super(ItemProperties.mine_1, Rarity.Uncommon);
		this.state = State.Normal;
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		Component percent;
		switch (this.state) {
		case Normal:
			percent = percent0;
			break;
		case Cracked:
			percent = percent1;
			break;
		case Broken:
			percent = percent2;
			break;
		default:
			return;
		}
		tooltip.add(Component.translatable("accessory.piggy", percent));
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
	}

	/**
	 * Sets {@link #state} to {@link State#Normal}
	 */
	public void repair() {
		this.state = State.Normal;
	}

	/**
	 * Advances {@link #state} to the next one
	 */
	public void use() {
		switch (this.state) {
		case Normal:
			this.state = State.Cracked;
			return;
		case Cracked:
			this.state = State.Broken;
			return;
		default:
		}
	}

	@Override
	protected ItemStack getUpgrade() {
		return ItemStack.EMPTY;
	}
}