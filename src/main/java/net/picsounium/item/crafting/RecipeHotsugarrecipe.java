
package net.picsounium.item.crafting;

import net.picsounium.item.ItemSucrecuit;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@ElementsPicsounium.ModElement.Tag
public class RecipeHotsugarrecipe extends ElementsPicsounium.ModElement {
	public RecipeHotsugarrecipe(ElementsPicsounium instance) {
		super(instance, 291);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.SUGAR, (int) (1)), new ItemStack(ItemSucrecuit.block, (int) (1)), 1F);
	}
}
