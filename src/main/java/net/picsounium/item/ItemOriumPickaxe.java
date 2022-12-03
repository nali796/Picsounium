
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
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsPicsounium.ModElement.Tag
public class ItemOriumPickaxe extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:oriumpickaxe")
	public static final Item block = null;
	public ItemOriumPickaxe(ElementsPicsounium instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("ORIUMPICKAXE", 16, 1330, 16f, 10f, 46)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 16);
				return ret.keySet();
			}
		}.setUnlocalizedName("oriumpickaxe").setRegistryName("oriumpickaxe").setCreativeTab(TabPicsouniumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("picsounium:oriumpickaxe", "inventory"));
	}
}
