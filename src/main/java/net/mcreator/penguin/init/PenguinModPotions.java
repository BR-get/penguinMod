
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.penguin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.penguin.PenguinMod;

public class PenguinModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PenguinMod.MODID);
	public static final RegistryObject<Potion> PENGUIN_WATER = REGISTRY.register("penguin_water", () -> new Potion(new MobEffectInstance(PenguinModMobEffects.PENGUIN_SHOU_HU.get(), 72000, 0, false, true)));
}
