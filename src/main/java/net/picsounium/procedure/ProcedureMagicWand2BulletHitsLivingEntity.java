package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.world.World;

@ElementsPicsounium.ModElement.Tag
public class ProcedureMagicWand2BulletHitsLivingEntity extends ElementsPicsounium.ModElement {
	public ProcedureMagicWand2BulletHitsLivingEntity(ElementsPicsounium instance) {
		super(instance, 218);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MagicWand2BulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MagicWand2BulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MagicWand2BulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MagicWand2BulletHitsLivingEntity!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) (x));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) (z));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x + 6)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) (z));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x - 6)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) (z));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) (x));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z + 6)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) (x));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z - 6)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x + 6)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z + 6)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x + 6)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z - 6)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x - 6)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z - 6)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x - 6)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z + 6)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x + 8)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) (z));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x - 8)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) (z));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) (x));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z + 8)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) (x));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z - 8)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x + 8)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z + 8)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x + 8)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z - 8)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x - 8)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z - 8)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", (int) ((x - 8)));
			$_dependencies.put("y", (int) (y));
			$_dependencies.put("z", (int) ((z + 8)));
			ProcedureLigtning0.executeProcedure($_dependencies);
		}
	}
}
