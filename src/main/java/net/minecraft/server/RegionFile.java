package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class RegionFile {

    private static final byte[] a = null;

    private final File b = null;

    private RandomAccessFile c = null;

    private final int[] d = null;

    private final int[] e = null;

    private List<Boolean> f = null;

    private int g = 0;

    private long h = 0;

    public RegionFile(File file) {
    }

    // CraftBukkit start - This is a copy (sort of) of the method below it, make sure they stay in sync
    public synchronized boolean chunkExists(int i, int j) {
        return false;
    }

    // CraftBukkit end
    public synchronized DataInputStream a(int i, int j) {
        return null;
    }

    public DataOutputStream b(int i, int j) {
        return null;
    }

    protected synchronized void a(int i, int j, byte[] abyte, int k) {
    }

    private void a(int i, byte[] abyte, int j) throws IOException {
    }

    private boolean d(int i, int j) {
        return false;
    }

    private int e(int i, int j) {
        return 0;
    }

    public boolean c(int i, int j) {
        return false;
    }

    private void a(int i, int j, int k) throws IOException {
    }

    private void b(int i, int j, int k) throws IOException {
    }

    public void c() throws IOException {
    }

    class ChunkBuffer extends ByteArrayOutputStream {

        private final int b = 0;

        private final int c = 0;

        public ChunkBuffer(int i, int j) {
        }

        public void close() {
        }
    }
}
