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

public class AspectOfTheEnd extends ModSwordItem {
	private static final List<Component> tooltip = Arrays.asList(
			item_ability.copy().append(Component.translatable("sword.aote")).withStyle(ChatFormatting.GOLD),
			Component.translatable("sword.aote.0", StatString.speed.getString()));

	public AspectOfTheEnd() {
		super(ModSwordTier.AOTE, ItemProperties.combat_1, Rarity.Rare);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.addAll(AspectOfTheEnd.tooltip);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		final ItemStack held = player.getItemInHand(hand);
		if (!level.isClientSide)
			return InteractionResultHolder.pass(held);
		
		logger.info(StatString.complete);
		logger.info(StatString.day);
		logger.info(StatString.dungeon_star_1);
		logger.info(StatString.dungeon_star_2);
		logger.info(StatString.dungeon_star_3);
		logger.info(StatString.dungeon_star_4);
		logger.info(StatString.dungeon_star_5);
		logger.info(StatString.incomplete);
		logger.info(StatString.level_up);
		logger.info(StatString.night);
		logger.info(StatString.powder);
		logger.info(StatString.reqirement_slayer);
		logger.info(StatString.requirement);
		logger.info(StatString.ticker);
		logger.info(StatString.ability_damage.getString());
		logger.info(StatString.attack_speed.getString());
		logger.info(StatString.breaking_power.getString());
		logger.info(StatString.crit_chance.getString());
		logger.info(StatString.crit_damage.getString());
		logger.info(StatString.defense.getString());
		logger.info(StatString.farming_fortune.getString());
		logger.info(StatString.health.getString());
		logger.info(StatString.intelligence.getString());
		logger.info(StatString.magic_find.getString());
		logger.info(StatString.mana.getString());
		logger.info(StatString.mining_fortune.getString());
		logger.info(StatString.mining_speed.getString());
		logger.info(StatString.pet_luck.getString());
		logger.info(StatString.sea_creature_chance.getString());
		logger.info(StatString.speed.getString());
		logger.info(StatString.strength.getString());
		logger.info(StatString.true_def.getString());

		final double yaw = player.yHeadRot * Math.PI / 180d, pitch = player.getXRot() * Math.PI / 180d;
		final double cos = Math.cos(pitch);
		final Vec3 player_pos = player.position();
		final Vec3 pos = new Vec3(-1 * Math.sin(yaw) * cos, -1 * Math.sin(pitch), Math.cos(yaw) * cos).scale(8d)
				.add(player_pos);

		player.moveTo(pos.x, pos.y, pos.z, player.getYRot(), player.getXRot());
		level.playSound(player, player.blockPosition(), SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1f, 1f);

		return InteractionResultHolder.success(held);
	}
}
