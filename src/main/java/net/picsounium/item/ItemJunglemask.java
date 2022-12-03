
package net.picsounium.item;

import net.picsounium.procedure.ProcedurePicsouniumArmorHelmetTickEvent;
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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

@ElementsPicsounium.ModElement.Tag
public class ItemJunglemask extends ElementsPicsounium.ModElement {
	@GameRegistry.ObjectHolder("picsounium:junglemaskhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("picsounium:junglemaskbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("picsounium:junglemasklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("picsounium:junglemaskboots")
	public static final Item boots = null;
	public ItemJunglemask(ElementsPicsounium instance) {
		super(instance, 306);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("JUNGLEMASK", "picsounium:atricium__", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedHead = new Modeljunglemask().mask;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "picsounium:textures/junglemask.png";
			}

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
		}.setUnlocalizedName("junglemaskhelmet").setRegistryName("junglemaskhelmet").setCreativeTab(null));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("picsounium:junglemaskhelmet", "inventory"));
	}
	public static class Modeljunglemask extends ModelBase {
		private final ModelRenderer mask;
		private final ModelRenderer bone;
		public Modeljunglemask() {
			textureWidth = 64;
			textureHeight = 32;
			mask = new ModelRenderer(this);
			mask.setRotationPoint(0.0F, 0.0F, 0.0F);
			mask.cubeList.add(new ModelBox(mask, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, true));
			mask.cubeList.add(new ModelBox(mask, 49, 24, -4.0F, -17.0F, -3.0F, 8, 8, 0, 0.5F, true));
			mask.cubeList.add(new ModelBox(mask, 24, 0, -1.0F, -2.0F, -8.0F, 2, 2, 4, 0.0F, false));
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			mask.addChild(bone);
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			mask.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
