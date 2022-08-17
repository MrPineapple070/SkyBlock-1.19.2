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
 * An {@link Accessory} that saves the players held coins when dying.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Piggy_Bank">Piggy Bank</a>
 *
 * @author MrPineapple070
 * @version 28 July 2020
 */
public class PiggyBank extends AccessoryItem{
	public static enum State {
		Broken, Cracked, Normal;
	}

	private static final Component percent0 = Component.translatable("accessory.piggy.0").withStyle(ChatFormatting.GRAY);
	private static final Component percent1 = Component.translatable("accessory.piggy.1").withStyle(ChatFormatting.GRAY);
	private static final Component percent2 = Component.translatable("accessory.piggy.2").withStyle(ChatFormatting.GRAY);

	private State state;

	public PiggyBank() {
		super(ItemProperties.mine_1, Rarity.Uncommon);
		this.state = State.Normal;
	}

	public void repair() {
		this.state = State.Normal;
	}

	public void use() {
		switch (this.state) {
		case Normal:
			this.state = State.Cracked;
			return;
		case Cracked:
			this.state = State.Broken;
			return;
		default:
			return;
		}
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
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
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}