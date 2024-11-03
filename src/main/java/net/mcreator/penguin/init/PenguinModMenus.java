
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.penguin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.penguin.world.inventory.QieMenu;
import net.mcreator.penguin.PenguinMod;

public class PenguinModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PenguinMod.MODID);
	public static final RegistryObject<MenuType<QieMenu>> QIE = REGISTRY.register("qie", () -> IForgeMenuType.create(QieMenu::new));
}
