package net.hypixel.skyblock.items.crafting;

import net.hypixel.skyblock.SkyblockMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeSerializerInit {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZER = DeferredRegister
			.create(ForgeRegistries.RECIPE_SERIALIZERS, SkyblockMod.MODID);
	
	//public static final RegistryObject<RecipeSerializer<?>> backpack_color_seralizer = SERIALIZER
	//		.register("crafting_special_backpackcoloring", () -> new SimpleRecipeSerializer<>(BackpackColoring::new));
	public static final RegistryObject<RecipeSerializer<?>> enchanted_item_serializer = SERIALIZER.register("enchanted_item",
			EnchantedItemRecipe.Serializer::new);
	//public static final RegistryObject<RecipeSerializer<?>> enchantment_serializer = SERIALIZER.register("enchantment",
	//		EnchantmentRecipe.Serializer::new);
	//public static final RegistryObject<RecipeSerializer<?>> forge_serializer = SERIALIZER.register("forge",
	//		ForgeRecipe.Serializer::new);
	//public static final RegistryObject<RecipeSerializer<?>> pet_item_serializer = SERIALIZER.register("pet_item",
	//		PetItemRecipe.Serializer::new);
	//public static final RegistryObject<RecipeSerializer<?>> shaped_seralizer = SERIALIZER.register("shaped",
	//		ModShapedRecipe.Serializer::new);
}
