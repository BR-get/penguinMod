
package net.mcreator.penguin.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.penguin.procedures.PenguinShouHuXiaoGuoChiXuShiMeiKeFaShengProcedure;
import net.mcreator.penguin.procedures.PenguinShouHuDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;

import java.util.List;
import java.util.ArrayList;

public class PenguinShouHuMobEffect extends MobEffect {
	public PenguinShouHuMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		PenguinShouHuDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PenguinShouHuXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
