package net.minecraft.server;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class PacketPlayOutMapChunk implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private int b = 0;

    private int c = 0;

    private byte[] d = null;

    private List<NBTTagCompound> e = null;

    private boolean f = false;

    public PacketPlayOutMapChunk() {
    }

    public PacketPlayOutMapChunk(Chunk chunk, int i) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    private ByteBuf g() {
        return null;
    }

    public int a(PacketDataSerializer packetdataserializer, Chunk chunk, boolean flag, int i) {
        return 0;
    }

    protected int a(Chunk chunk, boolean flag, int i) {
        return 0;
    }

    public boolean e() {
        return false;
    }
}
