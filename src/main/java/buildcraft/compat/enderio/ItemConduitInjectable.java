package buildcraft.compat.enderio;

import net.minecraftforge.common.util.ForgeDirection;

import buildcraft.compat.cofh.ItemDuctInjectable;
import cofh.api.transport.IItemDuct;
import crazypants.enderio.conduit.item.IItemConduit;

public class ItemConduitInjectable extends ItemDuctInjectable {

    public ItemConduitInjectable(IItemDuct duct) {
        super(duct);
    }

    @Override
    public boolean canInjectItems(ForgeDirection forgeDirection) {
        return ((IItemConduit) duct).isConnectedTo(forgeDirection);
    }
}
