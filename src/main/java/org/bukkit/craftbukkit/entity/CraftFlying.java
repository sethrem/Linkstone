package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityFlying;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Flying;

public class CraftFlying extends CraftLivingEntity implements Flying {

    public CraftFlying(CraftServer server, EntityFlying entity) {
    }

    @Override
    public EntityFlying getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
