package net.hypixel.skyblock.items.sword;

import java.util.Arrays;
import java.util.List;

import net.hypixel.skyblock.items.Rarity;
import net.hypixel.skyblock.util.ItemProperties;
import net.hypixel.skyblock.util.StatString;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class AspectOfTheVoid extends ModSwordItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(Component.translatable("sword.aotv")).withStyle(ChatFormatting.GOLD),
			Component.translatable("sword.aotv.0", StatString.speed).withStyle(ChatFormatting.GRAY));

	public AspectOfTheVoid() {
		super(ModSwordTier.AOTV, ItemProperties.combat_1, Rarity.Epic);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(AspectOfTheVoid.tooltip);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		final ItemStack held = player.getItemInHand(hand);
		if (!level.isClientSide)
			return InteractionResultHolder.pass(held);

		final double yaw = player.yHeadRot * Math.PI / 180d, pitch = player.getXRot() * Math.PI / 180d;
		final double cos = Math.cos(pitch);
		final boolean crouch = player.isCrouching();
		final Vec3 player_pos = player.position();
		final Vec3 facing = new Vec3(-1 * Math.sin(yaw) * cos, -1 * Math.sin(pitch), Math.cos(yaw) * cos);
		final Vec3 teleport = facing.scale(crouch ? 64d : 8d).add(player_pos);

		player.moveTo(teleport.x, teleport.y, teleport.z, player.getYRot(), player.getXRot());
		level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDERMAN_TELEPORT,
				SoundSource.PLAYERS, 1f, 1f);

		return InteractionResultHolder.success(held);
	}
}
