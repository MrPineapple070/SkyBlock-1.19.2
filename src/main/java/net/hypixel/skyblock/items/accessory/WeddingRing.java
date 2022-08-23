package net.hypixel.skyblock.items.accessory;

import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.items.init.AccessoryInit;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * An {@link AccessoryItem} that grants a chance to deal double damage.<br>
 * <a href="https://wiki.hypixel.net/Ring_of_Love">Ring of Love</a>
 *
 * @author MrPineapple070
 * @version 25 April 2022
 * @since 19 November 2019
 */
public abstract class WeddingRing extends AccessoryItem {
	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 0</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing0 extends WeddingRing {
		public WeddingRing0() {
			super(Rarity.Common, 0xc);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_1.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 1</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing1 extends WeddingRing {
		public WeddingRing1() {
			super(Rarity.Common, 0xb);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_2.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 2</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing2 extends WeddingRing {
		public WeddingRing2() {
			super(Rarity.Uncommon, 0xa);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_3.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 3</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing3 extends WeddingRing {
		public WeddingRing3() {
			super(Rarity.Uncommon, 0x9);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_4.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 4</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing4 extends WeddingRing {
		public WeddingRing4() {
			super(Rarity.Rare, 0x7);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_5.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 5</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing5 extends WeddingRing {
		public WeddingRing5() {
			super(Rarity.Rare, 0x6);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_6.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 6</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing6 extends WeddingRing {
		public WeddingRing6() {
			super(Rarity.Rare, 0x5);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_7.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 7</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing7 extends WeddingRing {
		public WeddingRing7() {
			super(Rarity.Epic, 0x4);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_8.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 8</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing8 extends WeddingRing {
		public WeddingRing8() {
			super(Rarity.Epic, 0x3);
		}

		@Override
		protected ItemStack getUpgrade() {
			return new ItemStack(AccessoryInit.wedding_ring_9.get());
		}
	}

	/**
	 * <a href="https://wiki.hypixel.net/Ring_Of_Love">Level 9</a>
	 * 
	 * @author MrPineapple070
	 * @version 25 April 2022
	 * @since 19 November 2019
	 */
	public static class WeddingRing9 extends WeddingRing {
		public WeddingRing9() {
			super(Rarity.Legendary, 0x2);
		}

		@Override
		protected ItemStack getUpgrade() {
			return ItemStack.EMPTY;
		}
	}

	/**
	 * The chance to grant double damage.<br>
	 * The actual chance is 10<sup>chance</sup>.
	 */
	protected final int chance;

	/**
	 * Constructor
	 * 
	 * @param rarity {@link Rarity}
	 * @param chance the probability of doubling damage
	 */
	protected WeddingRing(final Rarity rarity, final int chance) {
		super(ItemProperties.combat_1, rarity);
		this.chance = chance;
	}

	@Override
	public void appendHoverText(final ItemStack stack, final Level level, final List<Component> tooltip,
			final TooltipFlag flag) {
		tooltip.add(Component.translatable("accessory.wedding", this.chance).withStyle(ChatFormatting.GRAY));
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
	public void inventoryTick(final ItemStack stack, final Level level, final Entity entity, final int slot,
			final boolean selected) {
	}
}