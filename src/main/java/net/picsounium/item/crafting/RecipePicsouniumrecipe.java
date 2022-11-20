
package net.picsounium.item.crafting;

import net.picsounium.item.ItemPicsouniumingot;
import net.picsounium.block.BlockPicsouniumOre;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsPicsounium.ModElement.Tag
public class RecipePicsouniumrecipe extends ElementsPicsounium.ModElement {
	public RecipePicsouniumrecipe(ElementsPicsounium instance) {
		super(instance, 106);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPicsouniumOre.block, (int) (1)), new ItemStack(ItemPicsouniumingot.block, (int) (1)), 3F);
	}
}
