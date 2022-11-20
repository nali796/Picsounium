
package net.picsounium.item.crafting;

import net.picsounium.item.ItemNitium;
import net.picsounium.block.BlockNitiumOre;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsPicsounium.ModElement.Tag
public class RecipeNitiumrecipe extends ElementsPicsounium.ModElement {
	public RecipeNitiumrecipe(ElementsPicsounium instance) {
		super(instance, 288);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNitiumOre.block, (int) (1)), new ItemStack(ItemNitium.block, (int) (1)), 1F);
	}
}
