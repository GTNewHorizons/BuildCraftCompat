package buildcraft.compat;

import buildcraft.compat.remaininmotion.SchematicRIMCarriage;
import cpw.mods.fml.common.Loader;

public class CompatModuleRemainInMotion extends CompatModuleBase {

    @Override
    public String name() {
        return "RemainInMotion";
    }

    @Override
    public boolean canLoad() {
        return Loader.isModLoaded("JAKJ_RedstoneInMotion") && Loader.isModLoaded("BuildCraft|Builders");
    }

    @Override
    public void init() {
        CompatUtils.registerSchematic(
                "JAKJ_RedstoneInMotion:tile.JAKJ_RedstoneInMotion_Carriage",
                0,
                5,
                SchematicRIMCarriage.class);
    }
}
