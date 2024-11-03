
package net.mcreator.penguin.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class PinguItem extends RecordItem {
	public PinguItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("penguin:pingu")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 4300);
	}
}
