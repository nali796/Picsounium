
package net.picsounium.item;

import net.picsounium.procedure.ProcedureTitanium_boots_tick_update;
import net.picsounium.procedure.ProcedurePicsouniumArmorHelmetTickEvent;
import net.picsounium.procedure.ProcedureOriumBodyTickEvent;
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
public class ItemAtriciumarmor extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:atriciumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("picsounium:atriciumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("picsounium:atriciumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("picsounium:atriciumarmorboots")
	public static final Item boots = null;
	public ItemAtriciumarmor(ElementsPicsounium instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ATRICIUMARMOR", "picsounium:atricium__", 29, new int[]{6, 8, 9, 5}, 7,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.6f);
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
		}.setUnlocalizedName("atriciumarmorhelmet").setRegistryName("atriciumarmorhelmet").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureOriumBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("atriciumarmorbody").setRegistryName("atriciumarmorbody").setCreativeTab(TabPicsouniumtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("atriciumarmorlegs")
				.setRegistryName("atriciumarmorlegs").setCreativeTab(TabPicsouniumtab.tab));
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
		}.setUnlocalizedName("atriciumarmorboots").setRegistryName("atriciumarmorboots").setCreativeTab(TabPicsouniumtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("picsounium:atriciumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("picsounium:atriciumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("picsounium:atriciumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("picsounium:atriciumarmorboots", "inventory"));
	}
}
