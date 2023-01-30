package buildcraft.compat.forbiddenmagic;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import buildcraft.compat.CompatModuleForbiddenMagic;
import buildcraft.core.crops.CropHandlerPlantable;

public class CropHandlerFMInkFlower extends CropHandlerPlantable {

    @Override
    public boolean isMature(IBlockAccess blockAccess, Block block, int meta, int x, int y, int z) {
        return block != null && block == CompatModuleForbiddenMagic.inkFlower;
    }

    @Override
    public boolean harvestCrop(World world, int x, int y, int z, List<ItemStack> list) {
        if (!world.isRemote) {
            Block b = world.getBlock(x, y, z);
            if (b != null && b == CompatModuleForbiddenMagic.inkFlower) {
                return super.harvestCrop(world, x, y, z, list);
            }
        }
        return false;
    }
}
