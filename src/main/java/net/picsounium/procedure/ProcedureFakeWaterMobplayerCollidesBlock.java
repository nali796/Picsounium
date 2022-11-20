package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureFakeWaterMobplayerCollidesBlock extends ElementsPicsounium.ModElement {
	public ProcedureFakeWaterMobplayerCollidesBlock(ElementsPicsounium instance) {
		super(instance, 146);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FakeWaterMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
	}
}
