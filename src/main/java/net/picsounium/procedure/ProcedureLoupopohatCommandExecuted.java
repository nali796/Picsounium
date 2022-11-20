package net.picsounium.procedure;

import net.picsounium.item.ItemLoupopo_hat_censored;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureLoupopohatCommandExecuted extends ElementsPicsounium.ModElement {
	public ProcedureLoupopohatCommandExecuted(ElementsPicsounium instance) {
		super(instance, 277);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LoupopohatCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLoupopo_hat_censored.helmet, (int) (1)).getItem(), -1, (int) 600,
					null);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemLoupopo_hat_censored.helmet, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
