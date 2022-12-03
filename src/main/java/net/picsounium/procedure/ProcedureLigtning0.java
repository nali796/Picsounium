package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;

@ElementsPicsounium.ModElement.Tag
public class ProcedureLigtning0 extends ElementsPicsounium.ModElement {
	public ProcedureLigtning0(ElementsPicsounium instance) {
		super(instance, 225);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Ligtning0!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Ligtning0!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Ligtning0!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Ligtning0!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 1), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 1), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 1), (int) y, (int) (z + 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 1), (int) y, (int) (z - 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 1), (int) y, (int) (z - 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 1), (int) y, (int) (z + 1), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 2), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 2), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 2), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 2), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 2), (int) y, (int) (z + 2), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 2), (int) y, (int) (z - 2), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 2), (int) y, (int) (z - 2), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 2), (int) y, (int) (z + 2), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 4), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 4), (int) y, (int) z, false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 4), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 4), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 4), (int) y, (int) (z + 4), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 4), (int) y, (int) (z - 4), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 4), (int) y, (int) (z - 4), false));
		world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - 4), (int) y, (int) (z + 4), false));
	}
}
