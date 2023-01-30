package buildcraft.compat;

import net.minecraft.nbt.NBTTagCompound;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;

public class CompatModuleAquaTweaks extends CompatModuleBase {

    @Override
    public String name() {
        return "AquaTweaks";
    }

    @Override
    public boolean canLoad() {
        return super.canLoad();
    }

    private void register(String modid, String name, int meta) {
        if (Loader.isModLoaded(modid)) {
            NBTTagCompound cpt = new NBTTagCompound();
            cpt.setString("modid", modid);
            cpt.setString("block", name);
            if (meta >= 0) {
                cpt.setInteger("meta", meta);
            }
            FMLInterModComms.sendMessage("AquaTweaks", "registerAquaConnectable", cpt);
        }
    }

    @Override
    public void init() {
        register("BuildCraft|Core", "engineBlock", -1);
        register("BuildCraft|Transport", "pipeBlock", -1);
        register("BuildCraft|Factory", "blockHopper", -1);
        register("BuildCraft|Factory", "refineryBlock", -1);
        register("BuildCraft|Factory", "plainPipeBlock", -1);
        register("BuildCraft|Builders", "markerBlock", -1);
        register("BuildCraft|Builders", "pathMarkerBlock", -1);
        register("BuildCraft|Builders", "constructionMarkerBlock", -1);
        register("BuildCraft|Builders", "frameBlock", -1);
        register("BuildCraft|Silicon", "laserBlock", -1);
        register("BuildCraft|Silicon", "laserTableBlock", -1);
    }
}
