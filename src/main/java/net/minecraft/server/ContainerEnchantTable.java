package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.craftbukkit.inventory.CraftInventoryEnchanting;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.entity.Player;

// CraftBukkit end
public class ContainerEnchantTable extends Container {

    // CraftBukkit - make type specific (changed from IInventory)
    public InventorySubcontainer enchantSlots = null;

    public World world = null;

    private final BlockPosition position = null;

    private final Random l = null;

    public int f = 0;

    public int[] costs = null;

    public int[] h = null;

    public int[] i = null;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private Player player = null;

    // CraftBukkit end
    public ContainerEnchantTable(PlayerInventory playerinventory, World world, BlockPosition blockposition) {
    }

    protected void c(ICrafting icrafting) {
    }

    public void addSlotListener(ICrafting icrafting) {
    }

    public void b() {
    }

    public void a(IInventory iinventory) {
    }

    public boolean a(EntityHuman entityhuman, int i) {
        return false;
    }

    private List<WeightedRandomEnchant> a(ItemStack itemstack, int i, int j) {
        return null;
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

    // CraftBukkit start
    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }
    // CraftBukkit end
}
