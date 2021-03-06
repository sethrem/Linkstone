package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class TileEntityStructure extends TileEntity {

    private String a = null;

    private String f = null;

    private String g = null;

    private BlockPosition h = null;

    private BlockPosition i = null;

    private EnumBlockMirror j = null;

    private EnumBlockRotation k = null;

    private TileEntityStructure.UsageMode l = null;

    private boolean m = false;

    private boolean n = false;

    private boolean o = false;

    private boolean p = false;

    private float q = 0.0F;

    private long r = 0;

    public TileEntityStructure() {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    private void J() {
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public String d() {
        return null;
    }

    public void a(String s) {
    }

    public void a(EntityLiving entityliving) {
    }

    public void b(BlockPosition blockposition) {
    }

    public void c(BlockPosition blockposition) {
    }

    public void b(EnumBlockMirror enumblockmirror) {
    }

    public void b(EnumBlockRotation enumblockrotation) {
    }

    public void b(String s) {
    }

    public TileEntityStructure.UsageMode k() {
        return null;
    }

    public void a(TileEntityStructure.UsageMode tileentitystructure_usagemode) {
    }

    public void a(boolean flag) {
    }

    public void a(float f) {
    }

    public void a(long i) {
    }

    public boolean p() {
        return false;
    }

    private List<TileEntityStructure> a(List<TileEntityStructure> list) {
        return null;
    }

    private List<TileEntityStructure> a(BlockPosition blockposition, BlockPosition blockposition1) {
        return null;
    }

    private StructureBoundingBox a(BlockPosition blockposition, List<TileEntityStructure> list) {
        return null;
    }

    public boolean q() {
        return false;
    }

    public boolean b(boolean flag) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean c(boolean flag) {
        return false;
    }

    public void E() {
    }

    public boolean F() {
        return false;
    }

    public boolean G() {
        return false;
    }

    public void d(boolean flag) {
    }

    public void e(boolean flag) {
    }

    public void f(boolean flag) {
    }

    @Nullable
    public IChatBaseComponent i_() {
        return null;
    }

    public static enum UsageMode implements INamable {

        SAVE("save", 0), LOAD("load", 1), CORNER("corner", 2), DATA("data", 3);

        private static final TileEntityStructure.UsageMode[] e = null;

        private final String f = null;

        private final int g = 0;

        private UsageMode(String s, int i) {
        }

        public String getName() {
            return null;
        }

        public int a() {
            return 0;
        }

        public static TileEntityStructure.UsageMode a(int i) {
            return null;
        }

        static {
        }
    }
}
