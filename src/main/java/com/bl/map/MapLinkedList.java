package com.bl.map;

public class MapLinkedList<K, T> {
    MyMapNode head;

    public int add(K key, T value) {
        MyMapNode newNode = new MyMapNode(key, value);
        int count = 0;
        if (head == null) {
            head = newNode;
            count++;
            return count;
        }
        MyMapNode temp = head;
        while (temp.next != null) {
            if (temp.key.equals(key)) {
                temp.Value = value;
                return count;
            }
            temp = temp.next;
        }
        temp.next = newNode;
        count++;
        return count;
    }

    public T search(K key) {
        MyMapNode temp = head;
        while (temp != null) {
            if (temp.key.equals(key))
                return (T) temp.Value;
            else
                temp = temp.next;
        }
        return null;

    }

    public void pop(K key) {
        MyMapNode temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                if (temp == head)
                    head = temp.next;
                temp.Value = null;
                temp.key = null;
                return;
            }
            temp = temp.next;
        }
    }


    @Override
    public String toString() {
        return "MapLinkedList{" +
                "head=" + head +
                '}';
    }
}



