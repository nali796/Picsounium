
package net.picsounium.block;

import net.picsounium.creativetab.TabPicsouniumtab;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsPicsounium.ModElement.Tag
public class BlockPicsounium extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:picsounium")
	public static final Block block = null;
	public BlockPicsounium(ElementsPicsounium instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("picsounium"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("picsounium:picsounium", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("picsounium");
			setSoundType(SoundType.METAL);
			setHardness(6.25F);
			setResistance(4.5F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabPicsouniumtab.tab);
		}

		@Override
		public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
			return true;
		}
	}
}
