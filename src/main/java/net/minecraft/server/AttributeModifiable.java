package net.minecraft.server;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class AttributeModifiable implements AttributeInstance {

    private final AttributeMapBase a = null;

    private final IAttribute b = null;

    private final Map<Integer, Set<AttributeModifier>> c = null;

    private final Map<String, Set<AttributeModifier>> d = null;

    private final Map<UUID, AttributeModifier> e = null;

    private double f = 0.0;

    private boolean g = false;

    private double h = 0.0;

    public AttributeModifiable(AttributeMapBase attributemapbase, IAttribute iattribute) {
    }

    public IAttribute getAttribute() {
        return null;
    }

    public double b() {
        return 0.0;
    }

    public void setValue(double d0) {
    }

    public Collection<AttributeModifier> a(int i) {
        return null;
    }

    public Collection<AttributeModifier> c() {
        return null;
    }

    @Nullable
    public AttributeModifier a(UUID uuid) {
        return null;
    }

    public boolean a(AttributeModifier attributemodifier) {
        return false;
    }

    public void b(AttributeModifier attributemodifier) {
    }

    protected void f() {
    }

    public void c(AttributeModifier attributemodifier) {
    }

    public void b(UUID uuid) {
    }

    public double getValue() {
        return 0.0;
    }

    private double g() {
        return 0.0;
    }

    private Collection<AttributeModifier> b(int i) {
        return null;
    }
}
