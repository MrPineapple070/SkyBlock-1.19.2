package net.hypixel.skyblock.init;

import net.hypixel.skyblock.SkyblockMod;
import net.hypixel.skyblock.items.sword.AspectOfTheEnd;
import net.hypixel.skyblock.items.sword.AspectOfTheVoid;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SwordInit {
	public static final DeferredRegister<Item> SWORDS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SkyblockMod.MODID);

	public static final RegistryObject<Item> aote = SWORDS.register("aspect_of_the_end", AspectOfTheEnd::new);
	public static final RegistryObject<Item> aotv = SWORDS.register("aspect_of_the_void", AspectOfTheVoid::new);
}
