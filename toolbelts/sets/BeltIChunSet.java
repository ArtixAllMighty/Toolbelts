package toolbelts.sets;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderPlayerEvent.SetArmorModel;

public class BeltIChunSet extends BeltBase{

	public BeltIChunSet(SetArmorModel evt) {
		super(evt);
	}

	@Override
	public void renderDefault(SetArmorModel evt) {
		
		ItemStack itemstack = new ItemStack(Blocks.wool, 1 ,12);
		renderBelt(itemstack, evt.entityPlayer);
		renderShoulderBelt(itemstack, evt.entityPlayer);
		
		renderHeldPickaxe(heldItem, evt.entityPlayer);
		renderHeldSword(heldItem, evt.entityPlayer);

		renderHeldTool(heldItem, evt.entityPlayer);
	}

}
