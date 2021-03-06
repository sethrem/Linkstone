package net.minecraft.server;

import javax.annotation.Nullable;

public class DamageSource {

    public static DamageSource FIRE = null;

    public static DamageSource LIGHTNING = null;

    public static DamageSource BURN = null;

    public static DamageSource LAVA = null;

    public static DamageSource HOT_FLOOR = null;

    public static DamageSource STUCK = null;

    public static DamageSource DROWN = null;

    public static DamageSource STARVE = null;

    public static DamageSource CACTUS = null;

    public static DamageSource FALL = null;

    public static DamageSource FLY_INTO_WALL = null;

    public static DamageSource OUT_OF_WORLD = null;

    public static DamageSource GENERIC = null;

    public static DamageSource MAGIC = null;

    public static DamageSource WITHER = null;

    public static DamageSource ANVIL = null;

    public static DamageSource FALLING_BLOCK = null;

    public static DamageSource DRAGON_BREATH = null;

    private boolean t = false;

    private boolean u = false;

    private boolean v = false;

    private float w = 0.0F;

    private boolean x = false;

    private boolean y = false;

    private boolean z = false;

    private boolean A = false;

    private boolean B = false;

    public String translationIndex = null;

    public static DamageSource mobAttack(EntityLiving entityliving) {
        return null;
    }

    public static DamageSource a(Entity entity, EntityLiving entityliving) {
        return null;
    }

    public static DamageSource playerAttack(EntityHuman entityhuman) {
        return null;
    }

    public static DamageSource arrow(EntityArrow entityarrow, @Nullable Entity entity) {
        return null;
    }

    public static DamageSource fireball(EntityFireball entityfireball, @Nullable Entity entity) {
        return null;
    }

    public static DamageSource projectile(Entity entity, @Nullable Entity entity1) {
        return null;
    }

    public static DamageSource b(Entity entity, @Nullable Entity entity1) {
        return null;
    }

    public static DamageSource a(Entity entity) {
        return null;
    }

    public static DamageSource explosion(@Nullable Explosion explosion) {
        return null;
    }

    public static DamageSource b(@Nullable EntityLiving entityliving) {
        return null;
    }

    public boolean a() {
        return false;
    }

    public DamageSource b() {
        return null;
    }

    public boolean isExplosion() {
        return false;
    }

    public DamageSource d() {
        return null;
    }

    public boolean ignoresArmor() {
        return false;
    }

    public float getExhaustionCost() {
        return 0.0F;
    }

    public boolean ignoresInvulnerability() {
        return false;
    }

    public boolean isStarvation() {
        return false;
    }

    protected DamageSource(String s) {
    }

    @Nullable
    public Entity i() {
        return null;
    }

    @Nullable
    public Entity getEntity() {
        return null;
    }

    protected DamageSource setIgnoreArmor() {
        return null;
    }

    protected DamageSource l() {
        return null;
    }

    protected DamageSource m() {
        return null;
    }

    protected DamageSource setExplosion() {
        return null;
    }

    public IChatBaseComponent getLocalizedDeathMessage(EntityLiving entityliving) {
        return null;
    }

    public boolean o() {
        return false;
    }

    public String p() {
        return null;
    }

    public DamageSource q() {
        return null;
    }

    public boolean r() {
        return false;
    }

    public boolean isMagic() {
        return false;
    }

    public DamageSource setMagic() {
        return null;
    }

    public boolean u() {
        return false;
    }

    @Nullable
    public Vec3D v() {
        return null;
    }
}
