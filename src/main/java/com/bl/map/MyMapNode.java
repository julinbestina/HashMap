package com.bl.map;

public class MyMapNode<K, T> {

    K key;
    T Value;
    MyMapNode next;

    public MyMapNode(K key, T value) {
        this.key = key;
        Value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", Value=" + Value +
                ", next=" + next +
                '}';
    }
}

