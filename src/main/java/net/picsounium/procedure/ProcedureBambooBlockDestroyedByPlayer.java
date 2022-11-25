package net.picsounium.procedure;

import net.picsounium.block.BlockBamboo;
import net.picsounium.ElementsPicsounium;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;

@ElementsPicsounium.ModElement.Tag
public class ProcedureBambooBlockDestroyedByPlayer extends ElementsPicsounium.ModElement {
	public ProcedureBambooBlockDestroyedByPlayer(ElementsPicsounium instance) {
		super(instance, 297);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BambooBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BambooBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BambooBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BambooBlockDestroyedByPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockBamboo.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(BlockBamboo.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 1), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock(), true);
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 2), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)).getBlock(), true);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == BlockBamboo.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 2), z, new ItemStack(BlockBamboo.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 3), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z)).getBlock(), true);
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 4), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z)).getBlock(), true);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock() == BlockBamboo.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 3), z, new ItemStack(BlockBamboo.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 4), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z)).getBlock(), true);
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 5), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z)).getBlock(), true);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == BlockBamboo.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 4), z, new ItemStack(BlockBamboo.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 6), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z)).getBlock(), true);
			world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 7), (int) z),
					world.getBlockState(new BlockPos((int) x, (int) (y + 7), (int) z)).getBlock(), true);
		}
	}
}
