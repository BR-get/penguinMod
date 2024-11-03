
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.penguin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.penguin.potion.PenguinShouHuMobEffect;
import net.mcreator.penguin.PenguinMod;

public class PenguinModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PenguinMod.MODID);
	public static final RegistryObject<MobEffect> PENGUIN_SHOU_HU = REGISTRY.register("penguin_shou_hu", () -> new PenguinShouHuMobEffect());
}
