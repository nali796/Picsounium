package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureAtriciumswordToolInHandTick extends ElementsPicsounium.ModElement {
	public ProcedureAtriciumswordToolInHandTick(ElementsPicsounium instance) {
		super(instance, 265);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AtriciumswordToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).setHealth((float) 2);
	}
}
