
package net.picsounium.creativetab;

import net.picsounium.block.BlockPicsounium;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsPicsounium.ModElement.Tag
public class TabPicsouniumtab extends ElementsPicsounium.ModElement {
	public TabPicsouniumtab(ElementsPicsounium instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabpicsouniumtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockPicsounium.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
