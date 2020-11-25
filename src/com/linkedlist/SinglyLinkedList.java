package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class SinglyLinkedList {

    Node head;



    public boolean isEmpty(){
        return head == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int data){
        Node current = head;
        if(current == null){
            head = new Node(data);
            return;
        }
        while (current != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void deleteAfter(Node node){
        Node current = head;
        // 1,2,3,4
        while(current != null && current.next != null && current.next.data == node.data){
            //System.out.println(current.data);
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.insertLast(1);
        s.print();


    }
}
