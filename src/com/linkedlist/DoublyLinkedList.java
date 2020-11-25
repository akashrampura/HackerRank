package com.linkedlist;


public class DoublyLinkedList {

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addAfter(Node node, int data){
        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
            newNode.prev = null;
            return;
        }
        while (current != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void print(){
        Node last = null;
        Node current = head;
        System.out.println("Forward print");
        while (current != null){
            current = last;
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Backward print");
        while (last != null){
            System.out.println(last.data);
            last = last.prev;
        }
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }


}
