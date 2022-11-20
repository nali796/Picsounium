package net.picsounium.procedure;

import net.picsounium.item.ItemXpbubbles;
import net.picsounium.item.ItemWandparticule;
import net.picsounium.item.ItemTitanium_shovel;
import net.picsounium.item.ItemTitanium_pickaxe;
import net.picsounium.item.ItemTitanium;
import net.picsounium.item.ItemPicsouniumingot;
import net.picsounium.item.ItemPicsouniumapple;
import net.picsounium.item.ItemPicsounium_hammer;
import net.picsounium.item.ItemPicsouniumDynamite;
import net.picsounium.item.ItemNitium;
import net.picsounium.item.ItemMoney;
import net.picsounium.item.ItemLucky_Hat;
import net.picsounium.item.ItemHammerTierI;
import net.picsounium.item.ItemHAMmer;
import net.picsounium.item.ItemDestructor_tier_iv;
import net.picsounium.item.ItemBadBoomerang;
import net.picsounium.item.ItemAtriciumNugget;
import net.picsounium.block.BlockTrophee;
import net.picsounium.block.BlockTitaniumLuckyblock;
import net.picsounium.block.BlockSpecial_Lucky_Block;
import net.picsounium.block.BlockSablingsplingeul;
import net.picsounium.block.BlockPicsounium_Luckyblock;
import net.picsounium.block.BlockOrium_Lucky_Block;
import net.picsounium.block.BlockCaveGlass;
import net.picsounium.block.BlockAtricium_lucky_block;
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
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@ElementsPicsounium.ModElement.Tag
public class ProcedureLuckyblockprocess extends ElementsPicsounium.ModElement {
	public ProcedureLuckyblockprocess(ElementsPicsounium instance) {
		super(instance, 236);
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
								((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Orium Lucky Block"), (true));
							}
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
										new ItemStack(BlockOrium_Lucky_Block.block, (int) (1)));
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
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockOrium_Lucky_Block.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
			if ((Math.random() < 0.85)) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.5)) {
						if ((Math.random() < 0.5)) {
							if ((Math.random() < 0.45)) {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.5)) {
										if ((Math.random() < 0.4)) {
											if ((Math.random() < 0.35)) {
												if ((Math.random() < 0.45)) {
													if ((Math.random() < 0.5)) {
														if (world instanceof WorldServer)
															((WorldServer) world).spawnParticle(EnumParticleTypes.WATER_BUBBLE, x, y, z, (int) 5, 3,
																	3, 3, 1, new int[0]);
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, y, z,
																	new ItemStack(ItemTitanium_pickaxe.block, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
													} else {
														if (world instanceof WorldServer)
															((WorldServer) world).spawnParticle(EnumParticleTypes.CLOUD, x, y, z, (int) 5, 3, 3, 3, 1,
																	new int[0]);
														if (!world.isRemote) {
															EntityItem entityToSpawn = new EntityItem(world, x, y, z,
																	new ItemStack(Items.SPECTRAL_ARROW, (int) (1)));
															entityToSpawn.setPickupDelay(10);
															world.spawnEntity(entityToSpawn);
														}
													}
												} else {
													if (entity instanceof EntityPlayer) {
														ItemStack _setstack = new ItemStack(ItemPicsouniumingot.block, (int) (1));
														_setstack.setCount(1);
														ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
													}
												}
											} else {
												if (entity instanceof EntityPlayer) {
													ItemStack _setstack = new ItemStack(ItemBadBoomerang.block, (int) (1));
													_setstack.setCount(1);
													ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
												}
											}
										} else {
											if (entity instanceof EntityPlayer) {
												ItemStack _setstack = new ItemStack(ItemPicsouniumapple.block, (int) (1));
												_setstack.setCount(1);
												ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
											}
										}
									} else {
										if (entity instanceof EntityPlayer) {
											ItemStack _setstack = new ItemStack(ItemMoney.block, (int) (1));
											_setstack.setCount(3);
											ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
										}
									}
								} else {
									if (!world.isRemote) {
										Entity entityToSpawn = new EntityCreeper(world);
										if (entityToSpawn != null) {
											entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
											world.spawnEntity(entityToSpawn);
										}
									}
									if (!world.isRemote) {
										Entity entityToSpawn = new EntityCreeper(world);
										if (entityToSpawn != null) {
											entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
											world.spawnEntity(entityToSpawn);
										}
									}
									if (!world.isRemote) {
										Entity entityToSpawn = new EntityCreeper(world);
										if (entityToSpawn != null) {
											entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
											world.spawnEntity(entityToSpawn);
										}
									}
								}
							} else {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
											new ItemStack(BlockSablingsplingeul.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
							}
						} else {
							if (entity instanceof EntityPlayer && !world.isRemote) {
								((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Atricium Lucky block"), (true));
							}
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z,
										new ItemStack(BlockAtricium_lucky_block.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
						}
					} else {
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("money money"), (true));
						}
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemMoney.block, (int) (1));
							_setstack.setCount(2);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					}
				} else {
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("One more chance"), (true));
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(BlockOrium_Lucky_Block.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Giant"), (true));
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityGiantZombie(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, x, y, z, (int) 2569, 3, 3, 3, 1, new int[0]);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockAtricium_lucky_block.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
			if ((Math.random() < 0.8)) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.5)) {
						if ((Math.random() < 0.5)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.25)) {
									if ((Math.random() < 0.13)) {
										if ((Math.random() < 0.1)) {
											if (!world.isRemote) {
												EntityItem entityToSpawn = new EntityItem(world, x, y, z,
														new ItemStack(ItemAtriciumNugget.block, (int) (1)));
												entityToSpawn.setPickupDelay(10);
												world.spawnEntity(entityToSpawn);
											}
											if (!world.isRemote) {
												world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 15));
											}
										} else {
											if (!world.isRemote) {
												world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 8));
											}
											if (!world.isRemote) {
												EntityItem entityToSpawn = new EntityItem(world, x, y, z,
														new ItemStack(ItemDestructor_tier_iv.block, (int) (1)));
												entityToSpawn.setPickupDelay(10);
												world.spawnEntity(entityToSpawn);
											}
										}
									} else {
										if (!world.isRemote) {
											EntityItem entityToSpawn = new EntityItem(world, x, y, z,
													new ItemStack(BlockAtricium_lucky_block.block, (int) (1)));
											entityToSpawn.setPickupDelay(10);
											world.spawnEntity(entityToSpawn);
										}
										if (!world.isRemote) {
											world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 6));
										}
									}
								} else {
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMoney.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMoney.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMoney.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMoney.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
									}
								}
							} else {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, y, z,
											new ItemStack(BlockSpecial_Lucky_Block.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
								}
							}
						} else {
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemWandparticule.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
							if (!world.isRemote) {
								world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
							}
						}
					} else {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemXpbubbles.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemXpbubbles.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemXpbubbles.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
						}
					}
				} else {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNitium.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNitium.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNitium.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
					}
				}
			} else {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(BlockOrium_Lucky_Block.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (!world.isRemote) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
				}
			}
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, x, y, z, (int) 2569, 3, 3, 3, 1, new int[0]);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockSpecial_Lucky_Block.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
			if ((Math.random() < 0.8)) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.67)) {
						if ((Math.random() < 0.52)) {
							if ((Math.random() < 0.34)) {
								if ((Math.random() < 0.2)) {
									if ((Math.random() < 0.13)) {
										if ((Math.random() < 0.1)) {
											if (!world.isRemote) {
												EntityItem entityToSpawn = new EntityItem(world, x, y, z,
														new ItemStack(ItemLucky_Hat.helmet, (int) (1)));
												entityToSpawn.setPickupDelay(10);
												world.spawnEntity(entityToSpawn);
											}
											if (!world.isRemote) {
												world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
											}
										} else {
											world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
											if (!world.isRemote) {
												EntityItem entityToSpawn = new EntityItem(world, x, y, z,
														new ItemStack(BlockTrophee.block, (int) (1)));
												entityToSpawn.setPickupDelay(10);
												world.spawnEntity(entityToSpawn);
											}
											if (!world.isRemote) {
												world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
											}
										}
									} else {
										if (!world.isRemote) {
											EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemHAMmer.block, (int) (1)));
											entityToSpawn.setPickupDelay(10);
											world.spawnEntity(entityToSpawn);
										}
										if (!world.isRemote) {
											world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
										}
									}
								} else {
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMoney.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMoney.block, (int) (1)));
										entityToSpawn.setPickupDelay(10);
										world.spawnEntity(entityToSpawn);
									}
									if (!world.isRemote) {
										world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
									}
								}
							} else {
								if (!world.isRemote) {
									EntityItem entityToSpawn = new EntityItem(world, x, y, z,
											new ItemStack(BlockSpecial_Lucky_Block.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									world.spawnEntity(entityToSpawn);
								}
								if (!world.isRemote) {
									world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
								}
							}
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), BlockOrium_Lucky_Block.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), BlockPicsounium_Luckyblock.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockTitaniumLuckyblock.block.getDefaultState(), 3);
							if (!world.isRemote) {
								world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 5));
							}
						}
					} else {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPicsouniumDynamite.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPicsouniumDynamite.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPicsouniumDynamite.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						if (!world.isRemote) {
							world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 4));
						}
					}
				} else {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(BlockCaveGlass.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(BlockCaveGlass.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(BlockCaveGlass.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					if (!world.isRemote) {
						world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 3));
					}
				}
			} else {
				if (!world.isRemote) {
					world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
				}
			}
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, x, y, z, (int) 2569, 3, 3, 3, 1, new int[0]);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
