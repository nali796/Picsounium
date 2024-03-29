package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;

@ElementsPicsounium.ModElement.Tag
public class ProcedureBadMagicWandWhileBulletFlyingTick extends ElementsPicsounium.ModElement {
	public ProcedureBadMagicWandWhileBulletFlyingTick(ElementsPicsounium instance) {
		super(instance, 226);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BadMagicWandWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BadMagicWandWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BadMagicWandWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BadMagicWandWhileBulletFlyingTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, (int) 455, 0, 0, 0, 0.1, new int[0]);
	}
}
