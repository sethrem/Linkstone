package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventoryCrafting;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit end
public class ContainerWorkbench extends Container {

    public InventoryCrafting craftInventory;

    // CraftBukkit - move initialization into constructor
    public IInventory resultInventory;

    // CraftBukkit - move initialization into constructor
    private final World g;

    private final BlockPosition h;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity;

    private PlayerInventory player;

    // CraftBukkit end
    public ContainerWorkbench(PlayerInventory playerinventory, World world, BlockPosition blockposition) {
    }

    public void a(IInventory iinventory) {
    }

    public void b(EntityHuman entityhuman) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    public boolean a(ItemStack itemstack, Slot slot) {
        return false;
    }

    // CraftBukkit start
    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }
    // CraftBukkit end
}
