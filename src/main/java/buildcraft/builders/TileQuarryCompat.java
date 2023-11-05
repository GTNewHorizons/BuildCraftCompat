package buildcraft.builders;

import net.minecraftforge.common.util.ForgeDirection;

import com.bluepowermod.api.tube.ITubeConnection;
import com.bluepowermod.part.tube.TubeStack;

import cofh.api.inventory.IInventoryConnection;
import cpw.mods.fml.common.Optional;

@Optional.InterfaceList({
        @Optional.Interface(iface = "com.bluepowermod.api.tube.ITubeConnection", modid = "bluepowerAPI") })
public class TileQuarryCompat extends TileQuarry implements IInventoryConnection, ITubeConnection {

    @Override
    public ConnectionType canConnectInventory(ForgeDirection from) {
        return ConnectionType.FORCE;
    }

    @Override
    @Optional.Method(modid = "bluepower")
    public boolean isConnectedTo(ForgeDirection from) {
        return true;
    }

    @Override
    @Optional.Method(modid = "bluepower")
    public TubeStack acceptItemFromTube(TubeStack tubeStack, ForgeDirection side, boolean simulate) {
        return tubeStack;
    }
}
