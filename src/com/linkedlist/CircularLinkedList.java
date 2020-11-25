package com.linkedlist;

public class CircularLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        Node current = head;

        if(head != null){
            while(current.next != newNode){
                current = current.next;
            }
            current.next = newNode;

        }else{
            newNode.next = newNode;
        }
    }

    public void print(){
        Node current = head;
        if(current != null){
            do{
                System.out.println(current.data);
                current = current.next;
            }while (current != head);
        }
    }

}
