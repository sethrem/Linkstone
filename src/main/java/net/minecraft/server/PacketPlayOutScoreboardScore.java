package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutScoreboardScore implements Packet<PacketListenerPlayOut> {

    private String a = null;

    private String b = null;

    private int c = 0;

    private PacketPlayOutScoreboardScore.EnumScoreboardAction d = null;

    public PacketPlayOutScoreboardScore() {
    }

    public PacketPlayOutScoreboardScore(ScoreboardScore scoreboardscore) {
    }

    public PacketPlayOutScoreboardScore(String s) {
    }

    public PacketPlayOutScoreboardScore(String s, ScoreboardObjective scoreboardobjective) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public static enum EnumScoreboardAction {

        CHANGE, REMOVE;

        private EnumScoreboardAction() {
        }
    }
}
