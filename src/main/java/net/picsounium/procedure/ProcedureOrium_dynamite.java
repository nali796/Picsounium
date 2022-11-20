package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.world.World;

@ElementsPicsounium.ModElement.Tag
public class ProcedureOrium_dynamite extends ElementsPicsounium.ModElement {
	public ProcedureOrium_dynamite(ElementsPicsounium instance) {
		super(instance, 140);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Orium_dynamite!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Orium_dynamite!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Orium_dynamite!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Orium_dynamite!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 7, true);
		}
	}
}
