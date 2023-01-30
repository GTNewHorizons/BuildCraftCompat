package buildcraft.compat;

import buildcraft.api.crops.CropManager;
import buildcraft.compat.witchery.CropHandlerWitchery;
import cpw.mods.fml.common.Loader;

public class CompatModuleWitchery extends CompatModuleBase {

    @Override
    public String name() {
        return "Witchery";
    }

    @Override
    public boolean canLoad() {
        return Loader.isModLoaded("witchery");
    }

    @Override
    public void init() {
        CropManager.registerHandler(new CropHandlerWitchery());
    }
}
