
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.penguin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.penguin.item.QePhotoItem;
import net.mcreator.penguin.item.PinguItem;
import net.mcreator.penguin.item.PenguinHeadItem;
import net.mcreator.penguin.item.PenguinBeakItem;
import net.mcreator.penguin.PenguinMod;

public class PenguinModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PenguinMod.MODID);
	public static final RegistryObject<Item> PENGUIN_BEAK = REGISTRY.register("penguin_beak", () -> new PenguinBeakItem());
	public static final RegistryObject<Item> PENGUIN_HEAD_HELMET = REGISTRY.register("penguin_head_helmet", () -> new PenguinHeadItem.Helmet());
	public static final RegistryObject<Item> PENGUIN_SPAWN_EGG = REGISTRY.register("penguin_spawn_egg", () -> new ForgeSpawnEggItem(PenguinModEntities.PENGUIN, -1, -26317, new Item.Properties()));
	public static final RegistryObject<Item> PINGU = REGISTRY.register("pingu", () -> new PinguItem());
	public static final RegistryObject<Item> QE_PHOTO = REGISTRY.register("qe_photo", () -> new QePhotoItem());
	// Start of user code block custom items
	// End of user code block custom items
}
