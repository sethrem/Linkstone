package org.bukkit.craftbukkit.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@SuppressWarnings("unchecked")
public class LongObjectHashMap<V> implements Cloneable, Serializable {

    static final long serialVersionUID = 0;

    private static final long EMPTY_KEY = 0;

    private static final int BUCKET_SIZE = 0;

    private transient long[][] keys = null;

    private transient V[][] values = null;

    private transient int modCount = 0;

    private transient int size = 0;

    public LongObjectHashMap() {
    }

    public LongObjectHashMap(Map<? extends Long, ? extends V> map) {
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(long key) {
        return false;
    }

    public boolean containsValue(V value) {
        return false;
    }

    public V get(long key) {
        return null;
    }

    public V put(long key, V value) {
        return null;
    }

    public V remove(long key) {
        return null;
    }

    public void putAll(Map<? extends Long, ? extends V> map) {
    }

    public void clear() {
    }

    public Set<Long> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    /**
     * Returns a Set of Entry objects for the HashMap. This is not how the internal
     * implementation is laid out so this constructs the entire Set when called. For
     * this reason it should be avoided if at all possible.
     *
     * @return Set of Entry objects
     * @deprecated
     */
    @Deprecated
    public Set<Map.Entry<Long, V>> entrySet() {
        return null;
    }

    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    private void initialize() {
    }

    private long keyIndex(long key) {
        return 0;
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
    }

    private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
    }

    private class ValueIterator implements Iterator<V> {

        private int count = 0;

        private int index = 0;

        private int innerIndex = 0;

        private int expectedModCount = 0;

        private long lastReturned = 0;

        long prevKey = 0;

        V prevValue = null;

        ValueIterator() {
        }

        public boolean hasNext() {
            return false;
        }

        public void remove() {
        }

        public V next() {
            return null;
        }
    }

    private class KeyIterator implements Iterator<Long> {

        final ValueIterator iterator = null;

        public KeyIterator() {
        }

        public void remove() {
        }

        public boolean hasNext() {
            return false;
        }

        public Long next() {
            return null;
        }
    }

    private class KeySet extends AbstractSet<Long> {

        public void clear() {
        }

        public int size() {
            return 0;
        }

        public boolean contains(Object key) {
            return false;
        }

        public boolean remove(Object key) {
            return false;
        }

        public Iterator<Long> iterator() {
            return null;
        }
    }

    private class ValueCollection extends AbstractCollection<V> {

        public void clear() {
        }

        public int size() {
            return 0;
        }

        public boolean contains(Object value) {
            return false;
        }

        public Iterator<V> iterator() {
            return null;
        }
    }

    private class Entry implements Map.Entry<Long, V> {

        private final Long key = null;

        private V value = null;

        Entry(long k, V v) {
        }

        public Long getKey() {
            return null;
        }

        public V getValue() {
            return null;
        }

        public V setValue(V v) {
            return null;
        }
    }
}
