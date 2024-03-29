
package net.picsounium.item;

import net.picsounium.creativetab.TabPicsouniumtab;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsPicsounium.ModElement.Tag
public class ItemTitanium_shovel extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:titanium_shovel")
	public static final Item block = null;
	public ItemTitanium_shovel(ElementsPicsounium instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("TITANIUM_SHOVEL", 4, 631, 7.5f, 2.9f, 25)) {
			{
				this.attackSpeed = -3.1f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("titanium_shovel").setRegistryName("titanium_shovel").setCreativeTab(TabPicsouniumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("picsounium:titanium_shovel", "inventory"));
	}
}
