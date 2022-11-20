
package net.picsounium.item;

import net.picsounium.procedure.ProcedureOriumBootsTickEvent;
import net.picsounium.creativetab.TabPicsouniumtab;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsPicsounium.ModElement.Tag
public class ItemOrium extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:oriumhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("picsounium:oriumbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("picsounium:oriumlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("picsounium:oriumboots")
	public static final Item boots = null;
	public ItemOrium(ElementsPicsounium instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ORIUM", "picsounium:orium_", 29, new int[]{4, 8, 9, 5}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("oriumhelmet").setRegistryName("oriumhelmet")
				.setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("oriumbody").setRegistryName("oriumbody")
				.setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("oriumlegs").setRegistryName("oriumlegs")
				.setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureOriumBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("oriumboots").setRegistryName("oriumboots").setCreativeTab(TabPicsouniumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("picsounium:oriumhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("picsounium:oriumbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("picsounium:oriumlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("picsounium:oriumboots", "inventory"));
	}
}
