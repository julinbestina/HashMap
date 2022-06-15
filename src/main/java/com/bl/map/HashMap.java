package com.bl.map;

import java.util.Arrays;

public class HashMap<K, T> {
    MapLinkedList[] bucket = new MapLinkedList[6];
    int size = 0;

    private int findBucketIndex(K key) {
        return Math.abs(key.hashCode() % bucket.length);
    }

    public void add(K key, T value) {
        int index = findBucketIndex(key);
        if (bucket[index] == null) {
            bucket[index] = new MapLinkedList<K, T>();
        }
        size += bucket[index].add(key, value);
    }

    public T get(K key) {
        int index = findBucketIndex(key);
        if (bucket[index] == null) {
            return null;
        }
        return (T) bucket[index].search(key);
    }

    public void remove(K key) {
        int index = findBucketIndex(key);
        bucket[index].pop(key);
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hashmap{" +
                "bucket=" + Arrays.toString(bucket) +
                '}';
    }


}


