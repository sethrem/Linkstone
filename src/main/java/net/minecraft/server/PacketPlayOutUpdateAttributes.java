package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class PacketPlayOutUpdateAttributes implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private final List<PacketPlayOutUpdateAttributes.AttributeSnapshot> b = null;

    public PacketPlayOutUpdateAttributes() {
    }

    public PacketPlayOutUpdateAttributes(int i, Collection<AttributeInstance> collection) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public class AttributeSnapshot {

        private final String b = null;

        private final double c = 0.0;

        private final Collection<AttributeModifier> d = null;

        public AttributeSnapshot(String s, double d0, Collection collection) {
        }

        public String a() {
            return null;
        }

        public double b() {
            return 0.0;
        }

        public Collection<AttributeModifier> c() {
            return null;
        }
    }
}
