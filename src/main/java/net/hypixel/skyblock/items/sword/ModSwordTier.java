package net.hypixel.skyblock.items.sword;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModSwordTier implements Tier {
	Adaptive_Blade(170), AOTD(225), AOTE(100), AOTJ(1), Bonzo_Staff(160), Cleaver(40), Crypt_Witherlord_Sword(62),
	Daedalus_Axe(0), Dreadlord_Sword(52), Edible_Mace(125), Ember_Rod(80), Emerald_Blade(130), End_Stone_Sword(120),
	End_Sword(35), Fancy_Sword(20), Flaming_Sword(50), Frozen_Scythe(80), Golem_Sword(80), Hunter_Knife(80),
	Hyper_Cleaver(145), Ink_Wand(130), Leaping_Sword(150), Midas_Sword(150), Ornate_Zombie_Sword(110),
	Pigman_Sword(110), Pooch_Sword(120), Prismarine_Blade(50), Raider_Axe(80), Reaper_Falchion(120), Reaper_Scythe(333),
	Recluse_Fang(120), Revenant_Falchion(90), Rogue_Sword(20), Scorpion_Foil(100), Shaman_Sword(100), Silent_Death(85),
	Silk_Edge_Sword(175), Silver_Fang(100), Spider_Sword(30), Spirit_Sceptre(180), Spirit_Sword(210), Super_Cleaver(85),
	Tactician_Sword(50), Thick_AOTJ(1), Thick_Scorpion_Foil(100), Thick_Tactician_Sword(50), Undead_Sword(30),
	Yeti_Sowrd(150), Zombie_Commander_Whip(65), Zombie_Knight_Sword(82), Zombie_Soldier_Cutlass(52), Zombie_Sword(100);

	private float damage;

	private ModSwordTier(float damage) {
		this.damage = damage / 5f;
	}

	@Override
	public int getUses() {
		return Integer.MAX_VALUE;
	}

	@Override
	public float getSpeed() {
		return Float.POSITIVE_INFINITY;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.damage;
	}

	@Override
	public int getLevel() {
		return -1;
	}

	@Override
	public int getEnchantmentValue() {
		return 25;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.EMPTY;
	}
}
