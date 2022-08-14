package net.hypixel.skyblock.items.gemstone;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;

import com.google.errorprone.annotations.Immutable;

import net.hypixel.skyblock.items.ModItem;
import net.hypixel.skyblock.util.ItemProperties;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

@Immutable
public class GemstoneItem extends ModItem {
	private static final Component rough = Component
			.translatable("gemstone.rough",
					Component.translatable("dimention.crystal_hollows").withStyle(ChatFormatting.DARK_PURPLE))
			.withStyle(ChatFormatting.GRAY);

	private static final Component harness = Component.translatable("gemstone.harness")
			.withStyle(ChatFormatting.YELLOW);

	@Nonnull
	public final GemstoneTier tier;

	@Nonnull
	public final GemstoneType type;

	public GemstoneItem(@Nonnull GemstoneTier tier, @Nonnull GemstoneType type) {
		super(ItemProperties.mine_64, tier.rarity);
		this.tier = Objects.requireNonNull(tier, "GemstoneTier cannot be null");
		this.type = Objects.requireNonNull(type, "GemstoneType cannot be null");
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		switch (this.tier) {
		case Fine:
			tooltip.add(Component.translatable("gemstone.fine", Component
					.translatable("gemstone." + this.type.name().toLowerCase()).withStyle(this.type.stat.getStyle()))
					.withStyle(ChatFormatting.GRAY));
			break;
		case Flawed:
			tooltip.add(Component.translatable("gemstone.flawed", Component
					.translatable("gemstone." + this.type.name().toLowerCase()).withStyle(this.type.stat.getStyle()))
					.withStyle(ChatFormatting.GRAY));
			break;
		case Flawless:
			tooltip.add(Component.translatable("gemstone.flawless", Component
					.translatable("gemstone." + this.type.name().toLowerCase()).withStyle(this.type.stat.getStyle()))
					.withStyle(ChatFormatting.GRAY));
			break;
		case Perfect:
			tooltip.add(Component.translatable("gemstone.perfect", Component
					.translatable("gemstone." + this.type.name().toLowerCase()).withStyle(this.type.stat.getStyle()))
					.withStyle(ChatFormatting.GRAY));
			break;
		case Rough:
			tooltip.add(rough);
			break;
		default:
			throw new IllegalStateException("Illegal GemstoneTier:\t" + this.tier);
		}
		tooltip.add(Component.literal("\n"));
		tooltip.add(Component.translatable("gemstone.generic", harness, this.type.stat).withStyle(ChatFormatting.GRAY));
	}
}
