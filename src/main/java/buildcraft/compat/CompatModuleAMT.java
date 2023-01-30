package buildcraft.compat;

import buildcraft.api.crops.CropManager;
import buildcraft.compat.applemilktea2.CropHandlerAMT;
import cpw.mods.fml.common.Loader;

public class CompatModuleAMT extends CompatModuleBase {

    @Override
    public String name() {
        return "AppleMilkTea2";
    }

    @Override
    public boolean canLoad() {
        return Loader.isModLoaded("DCsAppleMilk");
    }

    @Override
    public void init() {
        CropManager.registerHandler(new CropHandlerAMT());
    }
}
