package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public class BlockFence extends Block {

    public static final BlockStateBoolean NORTH = null;

    public static final BlockStateBoolean EAST = null;

    public static final BlockStateBoolean SOUTH = null;

    public static final BlockStateBoolean WEST = null;

    protected static final AxisAlignedBB[] e = null;

    public static final AxisAlignedBB f = null;

    public static final AxisAlignedBB g = null;

    public static final AxisAlignedBB B = null;

    public static final AxisAlignedBB C = null;

    public static final AxisAlignedBB D = null;

    public BlockFence(Material material, MaterialMapColor materialmapcolor) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    private static int i(IBlockData iblockdata) {
        return 0;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean c(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static {
        }
    }
}
