package net.minecraft.server;

public abstract class PathfinderAbstract {

    protected IBlockAccess a = null;

    protected EntityInsentient b = null;

    protected final IntHashMap<PathPoint> c = null;

    protected int d = 0;

    protected int e = 0;

    protected int f = 0;

    protected boolean g = false;

    protected boolean h = false;

    protected boolean i = false;

    public PathfinderAbstract() {
    }

    public void a(IBlockAccess iblockaccess, EntityInsentient entityinsentient) {
    }

    public void a() {
    }

    protected PathPoint a(int i, int j, int k) {
        return null;
    }

    public abstract PathPoint b();

    public abstract PathPoint a(double d0, double d1, double d2);

    public abstract int a(PathPoint[] apathpoint, PathPoint pathpoint, PathPoint pathpoint1, float f);

    public abstract PathType a(IBlockAccess iblockaccess, int i, int j, int k, EntityInsentient entityinsentient, int l, int i1, int j1, boolean flag, boolean flag1);

    public abstract PathType a(IBlockAccess iblockaccess, int i, int j, int k);

    public void a(boolean flag) {
    }

    public void b(boolean flag) {
    }

    public void c(boolean flag) {
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }
}
