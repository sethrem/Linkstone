package net.minecraft.server;

import java.io.IOException;
import javax.annotation.Nullable;

public class PacketPlayOutSetSlot implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private int b = 0;

    private ItemStack c = null;

    public PacketPlayOutSetSlot() {
    }

    public PacketPlayOutSetSlot(int i, int j, @Nullable ItemStack itemstack) {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }
}
