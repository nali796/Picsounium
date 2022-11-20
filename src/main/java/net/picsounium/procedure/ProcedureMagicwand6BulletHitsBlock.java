package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;

@ElementsPicsounium.ModElement.Tag
public class ProcedureMagicwand6BulletHitsBlock extends ElementsPicsounium.ModElement {
	public ProcedureMagicwand6BulletHitsBlock(ElementsPicsounium instance) {
		super(instance, 226);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Magicwand6BulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Magicwand6BulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Magicwand6BulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Magicwand6BulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.SPELL_WITCH, x, y, z, (int) 250, 3, 3, 3, 0.1, new int[0]);
	}
}
