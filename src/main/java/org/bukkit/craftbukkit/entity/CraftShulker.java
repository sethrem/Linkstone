package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityGolem;
import net.minecraft.server.EntityShulker;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Shulker;

public class CraftShulker extends CraftGolem implements Shulker {

    public CraftShulker(CraftServer server, EntityShulker entity) {
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public EntityShulker getHandle() {
        return null;
    }
}
