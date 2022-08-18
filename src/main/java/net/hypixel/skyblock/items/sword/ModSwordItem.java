package net.hypixel.skyblock.items.sword;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.hypixel.skyblock.items.Rarity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public abstract class ModSwordItem extends SwordItem {
	protected static final MutableComponent item_ability = Component.translatable("sword.ability");

	/**
	 * {@link Logger}
	 */
	protected static final Logger logger = LogManager.getLogger();

	/**
	 * {@link Rarity} of this
	 */
	@Nonnull
	private final Rarity rarity;

	public ModSwordItem(final Tier tier, final Properties properties, final Rarity rarity) {
		super(tier, 0, Float.POSITIVE_INFINITY, properties);
		this.rarity = Objects.requireNonNull(rarity, "Rarity cannot be null");
	}

	@Override
	public abstract void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag);

	@Override
	public boolean canBeDepleted() {
		return false;
	}

	@Override
	public Component getName(final ItemStack stack) {
		return Component.translatable(this.getDescriptionId()).withStyle(this.rarity.color);
	}

	public Rarity getRarity() {
		return this.rarity;
	}

	@Override
	public void inventoryTick(final ItemStack stack, final Level level, final Entity user, final int slot,
			final boolean held) {
	}

	@Override
	public boolean isEnchantable(final ItemStack stack) {
		return true;
	}

	@Override
	public abstract InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand);
}
