package net.hypixel.skyblock.items.accessory;

import java.util.List;
import java.util.Random;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link Accessory} that grants a chance to deal double damage.<br>
 * <a href="https://hypixel-skyblock.fandom.com/wiki/Ring_of_Love">Ring of
 * Love</a>
 *
 * @author MrPineapple070
 * @version 26 July 2020
 */
public class WeddingRing extends AccessoryItem {
	public static class WeddingRing0 extends WeddingRing {
		public WeddingRing0() {
			super(Rarity.Common, 0xc);
		}
	}

	public static class WeddingRing1 extends WeddingRing {
		public WeddingRing1() {
			super(Rarity.Common, 0xb);
		}
	}

	public static class WeddingRing2 extends WeddingRing {
		public WeddingRing2() {
			super(Rarity.Uncommon, 0xa);
		}
	}

	public static class WeddingRing3 extends WeddingRing {
		public WeddingRing3() {
			super(Rarity.Uncommon, 0x9);
		}
	}

	public static class WeddingRing4 extends WeddingRing {
		public WeddingRing4() {
			super(Rarity.Rare, 0x7);
		}
	}

	public static class WeddingRing5 extends WeddingRing {
		public WeddingRing5() {
			super(Rarity.Rare, 0x6);
		}
	}

	public static class WeddingRing6 extends WeddingRing {
		public WeddingRing6() {
			super(Rarity.Rare, 0x5);
		}
	}

	public static class WeddingRing7 extends WeddingRing {
		public WeddingRing7() {
			super(Rarity.Epic, 0x4);
		}
	}

	public static class WeddingRing8 extends WeddingRing {
		public WeddingRing8() {
			super(Rarity.Epic, 0x3);
		}
	}

	public static class WeddingRing9 extends WeddingRing {
		public WeddingRing9() {
			super(Rarity.Legendary, 0x2);
		}
	}

	private static final Random rand = new Random();

	/**
	 * The chance to grant double damage.<br>
	 * The actual chance is 10<sup>chance</sup>.
	 */
	protected final int chance;

	protected WeddingRing(Rarity rarity, int chance) {
		super(ItemProperties.combat_1, rarity);
		this.chance = chance;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(Component.translatable("accessory.wedding", this.chance));
	}

	public boolean chanceSuccessful() {
		return WeddingRing.rand.nextInt(this.getActualChance()) == 1;
	}

	/**
	 * @return the real {@link #chance}
	 */
	public int getActualChance() {
		return (int) Math.pow(10, this.chance);
	}

	/**
	 * @return {@link #chance}
	 */
	public int getChance() {
		return this.chance;
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
	}
}