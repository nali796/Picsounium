
package net.picsounium.item.crafting;

import net.picsounium.item.ItemOriumnugget;
import net.picsounium.block.BlockOriumOre;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsPicsounium.ModElement.Tag
public class RecipeOriumorerecipenoglitch extends ElementsPicsounium.ModElement {
	public RecipeOriumorerecipenoglitch(ElementsPicsounium instance) {
		super(instance, 119);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockOriumOre.block, (int) (1)), new ItemStack(ItemOriumnugget.block, (int) (1)), 1F);
	}
}
