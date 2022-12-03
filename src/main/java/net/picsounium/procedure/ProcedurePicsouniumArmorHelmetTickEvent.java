package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedurePicsouniumArmorHelmetTickEvent extends ElementsPicsounium.ModElement {
	public ProcedurePicsouniumArmorHelmetTickEvent(ElementsPicsounium instance) {
		super(instance, 115);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PicsouniumArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 260, (int) 1, (false), (false)));
	}
}
