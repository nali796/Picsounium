package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureTitaniumBlockEntityWalksOnTheBlock extends ElementsPicsounium.ModElement {
	public ProcedureTitaniumBlockEntityWalksOnTheBlock(ElementsPicsounium instance) {
		super(instance, 107);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TitaniumBlockEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
	}
}
