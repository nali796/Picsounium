package net.picsounium.procedure;

import net.picsounium.item.ItemOriginel_Hat;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureOriginelhatCommandExecuted extends ElementsPicsounium.ModElement {
	public ProcedureOriginelhatCommandExecuted(ElementsPicsounium instance) {
		super(instance, 276);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OriginelhatCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemOriginel_Hat.helmet, (int) (1)).getItem(), -1, (int) 600, null);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemOriginel_Hat.helmet, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
