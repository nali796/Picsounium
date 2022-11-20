
package net.picsounium.item.crafting;

import net.picsounium.item.ItemAtriciumNugget;
import net.picsounium.block.BlockAtriciumOre;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsPicsounium.ModElement.Tag
public class RecipeAtriciumnugetrecipe0 extends ElementsPicsounium.ModElement {
	public RecipeAtriciumnugetrecipe0(ElementsPicsounium instance) {
		super(instance, 244);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAtriciumOre.block, (int) (1)), new ItemStack(ItemAtriciumNugget.block, (int) (1)), 1F);
	}
}
