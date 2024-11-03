
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.penguin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.penguin.PenguinMod;

public class PenguinModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PenguinMod.MODID);
	public static final RegistryObject<SoundEvent> PINGU = REGISTRY.register("pingu", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("penguin", "pingu")));
}
