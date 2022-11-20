
package net.picsounium.creativetab;

import net.picsounium.block.BlockLightblock;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsPicsounium.ModElement.Tag
public class TabCreativeItem extends ElementsPicsounium.ModElement {
	public TabCreativeItem(ElementsPicsounium instance) {
		super(instance, 179);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcreativeitem") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockLightblock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
