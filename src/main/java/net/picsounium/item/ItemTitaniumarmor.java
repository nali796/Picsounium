
package net.picsounium.item;

import net.picsounium.procedure.ProcedureTitanium_boots_tick_update;
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
public class ItemTitaniumarmor extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:titaniumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("picsounium:titaniumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("picsounium:titaniumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("picsounium:titaniumarmorboots")
	public static final Item boots = null;
	public ItemTitaniumarmor(ElementsPicsounium instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TITANIUMARMOR", "picsounium:titanium_armor_", 23, new int[]{4, 6, 7, 3}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titaniumarmorhelmet")
				.setRegistryName("titaniumarmorhelmet").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titaniumarmorbody")
				.setRegistryName("titaniumarmorbody").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titaniumarmorlegs")
				.setRegistryName("titaniumarmorlegs").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTitanium_boots_tick_update.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("titaniumarmorboots").setRegistryName("titaniumarmorboots").setCreativeTab(TabPicsouniumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("picsounium:titaniumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("picsounium:titaniumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("picsounium:titaniumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("picsounium:titaniumarmorboots", "inventory"));
	}
}
