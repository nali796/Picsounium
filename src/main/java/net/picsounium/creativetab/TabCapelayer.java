
package net.picsounium.creativetab;

import net.picsounium.item.ItemCosmetiqueoverlay;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsPicsounium.ModElement.Tag
public class TabCapelayer extends ElementsPicsounium.ModElement {
	public TabCapelayer(ElementsPicsounium instance) {
		super(instance, 203);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcapelayer") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCosmetiqueoverlay.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
