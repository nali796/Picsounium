package net.picsounium.procedure;

import net.picsounium.ElementsPicsounium;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureBadPotionPotionStartedapplied extends ElementsPicsounium.ModElement {
	public ProcedureBadPotionPotionStartedapplied(ElementsPicsounium instance) {
		super(instance, 174);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BadPotionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.5)) {
			if ((Math.random() < 0.5)) {
				if ((Math.random() < 0.5)) {
					if ((Math.random() < 0.5)) {
						if ((Math.random() < 0.5)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.5)) {
										if ((Math.random() < 0.5)) {
											if ((Math.random() < 0.5)) {
												if ((Math.random() < 0.5)) {
													if ((Math.random() < 0.5)) {
														if (entity instanceof EntityLivingBase)
															((EntityLivingBase) entity).addPotionEffect(
																	new PotionEffect(MobEffects.BLINDNESS, (int) 500, (int) 3, (false), (false)));
													}
													if (entity instanceof EntityLivingBase)
														((EntityLivingBase) entity).addPotionEffect(
																new PotionEffect(MobEffects.MINING_FATIGUE, (int) 500, (int) 3, (false), (false)));
												}
												if (entity instanceof EntityLivingBase)
													((EntityLivingBase) entity).addPotionEffect(
															new PotionEffect(MobEffects.INSTANT_DAMAGE, (int) 500, (int) 3, (false), (false)));
											}
											if (entity instanceof EntityLivingBase)
												((EntityLivingBase) entity)
														.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, (int) 500, (int) 3, (false), (false)));
										}
										if (entity instanceof EntityLivingBase)
											((EntityLivingBase) entity)
													.addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 500, (int) 3, (false), (false)));
									}
									if (entity instanceof EntityLivingBase)
										((EntityLivingBase) entity)
												.addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 500, (int) 3, (false), (false)));
								}
								if (entity instanceof EntityLivingBase)
									((EntityLivingBase) entity)
											.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 500, (int) 3, (false), (false)));
							}
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity)
										.addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) 500, (int) 1, (false), (false)));
						}
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) 500, (int) 3, (false), (false)));
					}
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 500, (int) 3, (false), (false)));
				}
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 500, (int) 5, (false), (false)));
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 500, (int) 3, (false), (false)));
		}
	}
}
