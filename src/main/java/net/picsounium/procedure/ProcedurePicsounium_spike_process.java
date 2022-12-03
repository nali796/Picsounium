package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedurePicsounium_spike_process extends ElementsPicsounium.ModElement {
	public ProcedurePicsounium_spike_process(ElementsPicsounium instance) {
		super(instance, 108);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Picsounium_spike_process!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
	}
}
