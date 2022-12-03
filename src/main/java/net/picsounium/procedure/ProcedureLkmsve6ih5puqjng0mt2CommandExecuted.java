package net.picsounium.procedure;

import net.picsounium.item.ItemNaligator_Hat;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureLkmsve6ih5puqjng0mt2CommandExecuted extends ElementsPicsounium.ModElement {
	public ProcedureLkmsve6ih5puqjng0mt2CommandExecuted(ElementsPicsounium instance) {
		super(instance, 270);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Lkmsve6ih5puqjng0mt2CommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemNaligator_Hat.helmet, (int) (1)).getItem(), -1, (int) 600, null);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemNaligator_Hat.helmet, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
