package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.world.World;

@ElementsPicsounium.ModElement.Tag
public class ProcedureExplodingBubblesBulletHitsBlock extends ElementsPicsounium.ModElement {
	public ProcedureExplodingBubblesBulletHitsBlock(ElementsPicsounium instance) {
		super(instance, 106);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ExplodingBubblesBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ExplodingBubblesBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ExplodingBubblesBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ExplodingBubblesBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 5, true);
		}
	}
}
