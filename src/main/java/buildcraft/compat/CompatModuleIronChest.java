package buildcraft.compat;

import buildcraft.api.blueprints.Schematic;
import buildcraft.compat.ironchests.SchematicIronChest;
import cpw.mods.fml.common.Loader;

public class CompatModuleIronChest extends CompatModuleBase {

    @Override
    public String name() {
        return "IronChest";
    }

    @Override
    public boolean canLoad() {
        return super.canLoad() && Loader.isModLoaded("BuildCraft|Builders");
    }

    @Override
    public void init() {
        CompatUtils.registerSchematic(
                "IronChest:BlockIronChest",
                (Class<? extends Schematic>) SchematicIronChest.class,
                new Object[0]);
    }
}
