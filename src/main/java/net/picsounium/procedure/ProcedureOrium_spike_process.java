package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureOrium_spike_process extends ElementsPicsounium.ModElement {
	public ProcedureOrium_spike_process(ElementsPicsounium instance) {
		super(instance, 115);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Orium_spike_process!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
	}
}
