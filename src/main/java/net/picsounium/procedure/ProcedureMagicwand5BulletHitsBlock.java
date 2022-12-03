package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureMagicwand5BulletHitsBlock extends ElementsPicsounium.ModElement {
	public ProcedureMagicwand5BulletHitsBlock(ElementsPicsounium instance) {
		super(instance, 222);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Magicwand5BulletHitsBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.motionX = (entity.motionX);
		entity.motionY = 0.7;
		entity.motionZ = (entity.motionZ);
	}
}
