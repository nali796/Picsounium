
package net.picsounium.item.crafting;

import net.picsounium.item.ItemTitanium;
import net.picsounium.block.BlockTitaniumOre;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsPicsounium.ModElement.Tag
public class RecipeTitaniumIngotrecipe extends ElementsPicsounium.ModElement {
	public RecipeTitaniumIngotrecipe(ElementsPicsounium instance) {
		super(instance, 108);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaniumOre.block, (int) (1)), new ItemStack(ItemTitanium.block, (int) (1)), 1F);
	}
}
