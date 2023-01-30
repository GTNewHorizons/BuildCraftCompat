package buildcraft.compat;

import buildcraft.api.crops.CropManager;
import buildcraft.compat.agricraft.CropHandlerAgriCraft;
import cpw.mods.fml.common.Loader;

public class CompatModuleAgriCraft extends CompatModuleBase {

    @Override
    public String name() {
        return "AgriCraft";
    }

    @Override
    public boolean canLoad() {
        return Loader.isModLoaded("AgriCraft");
    }

    @Override
    public void init() {
        CropManager.registerHandler(new CropHandlerAgriCraft());
    }
}
