
package net.picsounium.item;

import net.picsounium.procedure.ProcedurePicsouniumArmorHelmetTickEvent;
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
public class ItemPicsouniumArmor extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:picsouniumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("picsounium:picsouniumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("picsounium:picsouniumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("picsounium:picsouniumarmorboots")
	public static final Item boots = null;
	public ItemPicsouniumArmor(ElementsPicsounium instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PICSOUNIUMARMOR", "picsounium:icsounium_", 26, new int[]{5, 7, 8, 4}, 2,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedurePicsouniumArmorHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("picsouniumarmorhelmet").setRegistryName("picsouniumarmorhelmet").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("picsouniumarmorbody")
				.setRegistryName("picsouniumarmorbody").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("picsouniumarmorlegs")
				.setRegistryName("picsouniumarmorlegs").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("picsouniumarmorboots")
				.setRegistryName("picsouniumarmorboots").setCreativeTab(TabPicsouniumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("picsounium:picsouniumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("picsounium:picsouniumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("picsounium:picsouniumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("picsounium:picsouniumarmorboots", "inventory"));
	}
}
