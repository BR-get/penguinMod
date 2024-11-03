
package net.mcreator.penguin.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.penguin.procedures.PenguinBeakGongJuZaiShouShangShiMeiKeFaShengProcedure;

import java.util.List;

public class PenguinBeakItem extends ShovelItem {
	public PenguinBeakItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 100f;
			}

			public float getAttackDamageBonus() {
				return 99998f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.STRIPPED_OAK_WOOD), new ItemStack(Blocks.STRIPPED_SPRUCE_WOOD), new ItemStack(Blocks.STRIPPED_BIRCH_WOOD), new ItemStack(Blocks.STRIPPED_JUNGLE_WOOD),
						new ItemStack(Blocks.STRIPPED_ACACIA_WOOD), new ItemStack(Blocks.STRIPPED_DARK_OAK_WOOD), new ItemStack(Blocks.STRIPPED_MANGROVE_WOOD), new ItemStack(Blocks.STRIPPED_CHERRY_WOOD));
			}
		}, 1, -3.9f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u4F01\u9E45\u7684\u5634\uFF0C\u53EF\u4EE5\u5403\u6389\u4F60"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			PenguinBeakGongJuZaiShouShangShiMeiKeFaShengProcedure.execute(entity);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
