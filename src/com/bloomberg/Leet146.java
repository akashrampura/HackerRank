package com.bloomberg;

import java.util.HashMap;

public class Leet146 {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */);
//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        System.out.println(cache.get(1));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(2));       // returns 3
    }

}

class LRUCache {
    private int capacity;
    private HashMap<Integer, DLList> map = new HashMap<>();
    private DLList head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DLList(-1, -1);
        tail = new DLList(-1, -1);

        head.setNext(tail);
        tail.setPrev(head);
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            map.get(key).top(head);
            return map.get(key).getValue();
        }
        return -1;
    }

    public void put(int key, int value) {
        DLList cur;
        if (!map.containsKey(key)) {
            cur = new DLList(key, value);
            map.put(key, cur);
            cur.insert(head);
            if (map.size() > this.capacity) {
                DLList prevTail = tail.getPrev();
                map.remove(prevTail.getKey());
                prevTail.move();
            }
        } else {
            cur = map.get(key);
            cur.setValue(value);
            cur.top(head);
        }
    }
}

class DLList {
    private int key;
    private int value;
    private DLList next;
    private DLList prev;

    DLList(int key, int value) {
        this.key = key;
        setValue(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public int getKey() {
        return this.key;
    }

    public DLList getPrev() {
        return this.prev;
    }

    public void setPrev(DLList prev) {
        this.prev = prev;
    }

    public void setNext(DLList next) {
        this.next = next;
    }

    public void insert(DLList head) {
        prev = head;
        next = head.next;
        head.next.prev = this;
        head.next = this;
    }

    public void move() {
        DLList prevNode = prev;
        DLList nextNode = next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void top(DLList head) {
        move();
        insert(head);
    }

    @Override
    public String toString() {
        return "[key: " + key + ", value: " + value + "]";
    }
}

/**
 * Your leetcode.LRUCache object will be instantiated and called as such:
 * leetcode.LRUCache obj = new leetcode.LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


