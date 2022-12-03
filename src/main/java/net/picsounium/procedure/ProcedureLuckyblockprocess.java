package net.picsounium.procedure;

import net.picsounium.item.ItemXpbubbles;
import net.picsounium.item.ItemTitanium_shovel;
import net.picsounium.item.ItemTitanium;
import net.picsounium.item.ItemPicsounium_hammer;
import net.picsounium.item.ItemHammerTierI;
import net.picsounium.block.BlockTitaniumLuckyblock;
import net.picsounium.block.BlockPicsounium_Luckyblock;
import net.picsounium.block.BlockBambooCrate;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureLuckyblockprocess extends ElementsPicsounium.ModElement {
	public ProcedureLuckyblockprocess(ElementsPicsounium instance) {
		super(instance, 238);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Luckyblockprocess!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Luckyblockprocess!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Luckyblockprocess!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Luckyblockprocess!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Luckyblockprocess!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockTitaniumLuckyblock.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
			if ((Math.random() < 0.8)) {
				if ((Math.random() < 0.6)) {
					if ((Math.random() < 0.5)) {
						if ((Math.random() < 0.55)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.5)) {
										if ((Math.random() < 0.75)) {
											if (entity instanceof EntityPlayer && !world.isRemote) {
												((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Flash!!"), (true));
											}
											if (entity instanceof EntityLivingBase)
												((EntityLivingBase) entity)
														.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 120, (int) 1));
										} else {
											if (entity instanceof EntityPlayer && !world.isRemote) {
												((EntityPlayer) entity).sendStatusMessage(new TextComponentString("destructor"), (true));
											}
										}
									} else {
										if (entity instanceof EntityPlayer && !world.isRemote) {
											((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Full Food"), (true));
										}
										if (entity instanceof EntityPlayer)
											((EntityPlayer) entity).getFoodStats().setFoodLevel((int) 6);
									}
								} else {
									if (entity instanceof EntityPlayer && !world.isRemote) {
										((EntityPlayer) entity).sendStatusMessage(new TextComponentString("No Food"), (true));
									}
									if (entity instanceof EntityPlayer)
										((EntityPlayer) entity).getFoodStats().setFoodLevel((int) 0);
								}
							} else {
								if (entity instanceof EntityPlayer && !world.isRemote) {
									((EntityPlayer) entity).sendStatusMessage(new TextComponentString("XP"), (true));
								}
								if (entity instanceof EntityPlayer)
									((EntityPlayer) entity).addExperience((int) 15);
							}
						} else {
							if (entity instanceof EntityPlayer && !world.isRemote) {
								((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Picsounium Lucky Block"), (true));
							}
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
										new ItemStack(BlockPicsounium_Luckyblock.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
						}
					} else {
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("hop"), (true));
						}
						entity.setPositionAndUpdate(x, (y + 1), z);
						entity.setPositionAndUpdate(x, (y + 2), z);
						entity.setPositionAndUpdate(x, (y + 3), z);
					}
				} else {
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("One more chance"), (true));
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(BlockTitaniumLuckyblock.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("PIG??!!"), (true));
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityPig(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, x, y, z, (int) 2569, 3, 3, 3, 1, new int[0]);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockPicsounium_Luckyblock.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
			if ((Math.random() < 0.8)) {
				if ((Math.random() < 0.8)) {
					if ((Math.random() < 0.6)) {
						if ((Math.random() < 0.8)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.76)) {
										if ((Math.random() < 0.5)) {
											if ((Math.random() < 0.5)) {
												if ((Math.random() < 0.5)) {
													if ((Math.random() < 0.5)) {
														if (world instanceof WorldServer)
															((WorldServer) world).spawnParticle(EnumParticleTypes.WATER_BUBBLE, x, y, z, (int) 5, 3,
																	3, 3, 1, new int[0]);
													} else {
														if (world instanceof WorldServer)
															((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, (int) 5,
																	3, 3, 3, 1, new int[0]);
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
																	new ItemStack(ItemTitanium.block, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
																	new ItemStack(ItemTitanium.block, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
																	new ItemStack(ItemTitanium.block, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
																	new ItemStack(ItemTitanium.block, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
																	new ItemStack(ItemTitanium.block, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
													}
												} else {
													if (!world.isRemote) {
														EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
																new ItemStack(ItemXpbubbles.block, (int) (1)));
														entityToSpawn.setPickupDelay(10);
														world.spawnEntity(entityToSpawn);
													}
												}
											} else {
												if (!world.isRemote) {
													EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
															new ItemStack(ItemTitanium_shovel.block, (int) (1)));
													entityToSpawn.setPickupDelay(10);
													world.spawnEntity(entityToSpawn);
												}
											}
										} else {
											if (!world.isRemote) {
												EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
														new ItemStack(ItemHammerTierI.block, (int) (1)));
												entityToSpawn.setPickupDelay(10);
												world.spawnEntity(entityToSpawn);
											}
										}
									} else {
										if (!world.isRemote) {
											EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
													new ItemStack(ItemPicsounium_hammer.block, (int) (1)));
											entityToSpawn.setPickupDelay(10);
											world.spawnEntity(entityToSpawn);
										}
									}
								} else {
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.STICK, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.STICK, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.STICK, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.STICK, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
								}
							} else {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(Items.BONE, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
							}
						} else {
							if (entity instanceof EntityPlayer && !world.isRemote) {
								((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Bamboo"), (true));
							}
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(BlockBambooCrate.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
						}
					} else {
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Cobweb"), (true));
						}
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(Blocks.WEB, (int) (1));
							_setstack.setCount(25);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					}
				} else {
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("One more chance"), (true));
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(BlockPicsounium_Luckyblock.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Blaze"), (true));
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityBlaze(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, x, y, z, (int) 2569, 3, 3, 3, 1, new int[0]);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
