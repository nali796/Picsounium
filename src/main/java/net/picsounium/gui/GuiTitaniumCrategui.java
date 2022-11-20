
package net.picsounium.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.picsounium.Picsounium;
import net.picsounium.ElementsPicsounium;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import java.io.IOException;

@ElementsPicsounium.ModElement.Tag
public class GuiTitaniumCrategui extends ElementsPicsounium.ModElement {
	public static int GUIID = 3;
	public static HashMap guistate = new HashMap();
	public GuiTitaniumCrategui(ElementsPicsounium instance) {
		super(instance, 111);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
		elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
	}
	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		private IInventory internal;
		private World world;
		private EntityPlayer entity;
		private int x, y, z;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
			this.world = world;
			this.entity = player;
			this.x = x;
			this.y = y;
			this.z = z;
			this.internal = new InventoryBasic("", true, 52);
			TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
			if (ent instanceof IInventory)
				this.internal = (IInventory) ent;
			this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 7, 7) {
			}));
			this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 25, 7) {
			}));
			this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 43, 7) {
			}));
			this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 61, 7) {
			}));
			this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 79, 7) {
			}));
			this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 97, 7) {
			}));
			this.customSlots.put(6, this.addSlotToContainer(new Slot(internal, 6, 115, 7) {
			}));
			this.customSlots.put(7, this.addSlotToContainer(new Slot(internal, 7, 133, 7) {
			}));
			this.customSlots.put(8, this.addSlotToContainer(new Slot(internal, 8, 151, 7) {
			}));
			this.customSlots.put(9, this.addSlotToContainer(new Slot(internal, 9, 169, 7) {
			}));
			this.customSlots.put(10, this.addSlotToContainer(new Slot(internal, 10, 187, 7) {
			}));
			this.customSlots.put(11, this.addSlotToContainer(new Slot(internal, 11, 205, 7) {
			}));
			this.customSlots.put(12, this.addSlotToContainer(new Slot(internal, 12, 223, 7) {
			}));
			this.customSlots.put(13, this.addSlotToContainer(new Slot(internal, 13, 7, 25) {
			}));
			this.customSlots.put(14, this.addSlotToContainer(new Slot(internal, 14, 25, 25) {
			}));
			this.customSlots.put(15, this.addSlotToContainer(new Slot(internal, 15, 43, 25) {
			}));
			this.customSlots.put(16, this.addSlotToContainer(new Slot(internal, 16, 61, 25) {
			}));
			this.customSlots.put(17, this.addSlotToContainer(new Slot(internal, 17, 79, 25) {
			}));
			this.customSlots.put(18, this.addSlotToContainer(new Slot(internal, 18, 97, 25) {
			}));
			this.customSlots.put(19, this.addSlotToContainer(new Slot(internal, 19, 115, 25) {
			}));
			this.customSlots.put(20, this.addSlotToContainer(new Slot(internal, 20, 133, 25) {
			}));
			this.customSlots.put(21, this.addSlotToContainer(new Slot(internal, 21, 151, 25) {
			}));
			this.customSlots.put(22, this.addSlotToContainer(new Slot(internal, 22, 169, 25) {
			}));
			this.customSlots.put(23, this.addSlotToContainer(new Slot(internal, 23, 187, 25) {
			}));
			this.customSlots.put(24, this.addSlotToContainer(new Slot(internal, 24, 205, 25) {
			}));
			this.customSlots.put(25, this.addSlotToContainer(new Slot(internal, 25, 223, 25) {
			}));
			this.customSlots.put(26, this.addSlotToContainer(new Slot(internal, 26, 7, 43) {
			}));
			this.customSlots.put(27, this.addSlotToContainer(new Slot(internal, 27, 25, 43) {
			}));
			this.customSlots.put(28, this.addSlotToContainer(new Slot(internal, 28, 43, 43) {
			}));
			this.customSlots.put(29, this.addSlotToContainer(new Slot(internal, 29, 61, 43) {
			}));
			this.customSlots.put(30, this.addSlotToContainer(new Slot(internal, 30, 79, 43) {
			}));
			this.customSlots.put(31, this.addSlotToContainer(new Slot(internal, 31, 97, 43) {
			}));
			this.customSlots.put(32, this.addSlotToContainer(new Slot(internal, 32, 115, 43) {
			}));
			this.customSlots.put(33, this.addSlotToContainer(new Slot(internal, 33, 133, 43) {
			}));
			this.customSlots.put(34, this.addSlotToContainer(new Slot(internal, 34, 151, 43) {
			}));
			this.customSlots.put(35, this.addSlotToContainer(new Slot(internal, 35, 169, 43) {
			}));
			this.customSlots.put(36, this.addSlotToContainer(new Slot(internal, 36, 187, 43) {
			}));
			this.customSlots.put(37, this.addSlotToContainer(new Slot(internal, 37, 205, 43) {
			}));
			this.customSlots.put(38, this.addSlotToContainer(new Slot(internal, 38, 223, 43) {
			}));
			this.customSlots.put(39, this.addSlotToContainer(new Slot(internal, 39, 7, 61) {
			}));
			this.customSlots.put(40, this.addSlotToContainer(new Slot(internal, 40, 25, 61) {
			}));
			this.customSlots.put(41, this.addSlotToContainer(new Slot(internal, 41, 43, 61) {
			}));
			this.customSlots.put(42, this.addSlotToContainer(new Slot(internal, 42, 61, 61) {
			}));
			this.customSlots.put(43, this.addSlotToContainer(new Slot(internal, 43, 79, 61) {
			}));
			this.customSlots.put(44, this.addSlotToContainer(new Slot(internal, 44, 97, 61) {
			}));
			this.customSlots.put(45, this.addSlotToContainer(new Slot(internal, 45, 115, 61) {
			}));
			this.customSlots.put(46, this.addSlotToContainer(new Slot(internal, 46, 133, 61) {
			}));
			this.customSlots.put(47, this.addSlotToContainer(new Slot(internal, 47, 151, 61) {
			}));
			this.customSlots.put(48, this.addSlotToContainer(new Slot(internal, 48, 169, 61) {
			}));
			this.customSlots.put(49, this.addSlotToContainer(new Slot(internal, 49, 187, 61) {
			}));
			this.customSlots.put(50, this.addSlotToContainer(new Slot(internal, 50, 205, 61) {
			}));
			this.customSlots.put(51, this.addSlotToContainer(new Slot(internal, 51, 223, 61) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 35 + 8 + sj * 18, 13 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlotToContainer(new Slot(player.inventory, si, 35 + 8 + si * 18, 13 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(EntityPlayer player) {
			return internal.isUsableByPlayer(player);
		}

		@Override
		public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 52) {
					if (!this.mergeItemStack(itemstack1, 52, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 52, false)) {
					if (index < 52 + 27) {
						if (!this.mergeItemStack(itemstack1, 52 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 52, 52 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && itemstack.getItem() == stack.getItem()
							&& (!stack.getHasSubtypes() || stack.getMetadata() == itemstack.getMetadata())
							&& ItemStack.areItemStackTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.splitStack(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.splitStack(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(EntityPlayer playerIn) {
			super.onContainerClosed(playerIn);
			if ((internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
				this.clearContainer(playerIn, playerIn.world, internal);
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				Picsounium.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class GuiWindow extends GuiContainer {
		private World world;
		private int x, y, z;
		private EntityPlayer entity;
		public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
			super(new GuiContainerMod(world, x, y, z, entity));
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.entity = entity;
			this.xSize = 246;
			this.ySize = 192;
		}
		private static final ResourceLocation texture = new ResourceLocation("picsounium:textures/titaniumcrategui.png");
		@Override
		public void drawScreen(int mouseX, int mouseY, float partialTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
			zLevel = 100.0F;
		}

		@Override
		public void updateScreen() {
			super.updateScreen();
		}

		@Override
		protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
			super.mouseClicked(mouseX, mouseY, mouseButton);
		}

		@Override
		protected void keyTyped(char typedChar, int keyCode) throws IOException {
			super.keyTyped(typedChar, keyCode);
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		}

		@Override
		public void onGuiClosed() {
			super.onGuiClosed();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void initGui() {
			super.initGui();
			this.guiLeft = (this.width - 246) / 2;
			this.guiTop = (this.height - 192) / 2;
			Keyboard.enableRepeatEvents(true);
			this.buttonList.clear();
		}

		@Override
		protected void actionPerformed(GuiButton button) {
			Picsounium.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
			handleButtonAction(entity, button.id, x, y, z);
		}

		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
	}

	public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			return null;
		}
	}

	public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			return null;
		}
	}

	public static class GUIButtonPressedMessage implements IMessage {
		int buttonID, x, y, z;
		public GUIButtonPressedMessage() {
		}

		public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(buttonID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			buttonID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
		}
	}

	public static class GUISlotChangedMessage implements IMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage() {
		}

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(slotID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
			buf.writeInt(changeType);
			buf.writeInt(meta);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			slotID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
			changeType = buf.readInt();
			meta = buf.readInt();
		}
	}
	private static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}

	private static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}