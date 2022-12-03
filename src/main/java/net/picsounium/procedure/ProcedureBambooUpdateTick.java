package net.picsounium.procedure;

import net.picsounium.block.BlockBamboo;
import net.picsounium.ElementsPicsounium;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

@ElementsPicsounium.ModElement.Tag
public class ProcedureBambooUpdateTick extends ElementsPicsounium.ModElement {
	public ProcedureBambooUpdateTick(ElementsPicsounium instance) {
		super(instance, 296);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BambooUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BambooUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BambooUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BambooUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockBamboo.block.getDefaultState()
						.getBlock()))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
					&& (!((world.getBlockState(new BlockPos((int) x, (int) (y - 15), (int) z))).getBlock() == BlockBamboo.block.getDefaultState()
							.getBlock())))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockBamboo.block.getDefaultState(), 3);
			}
		}
	}
}
