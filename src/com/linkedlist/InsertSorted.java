package com.linkedlist;

public class InsertSorted {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insert(Node newNode){
        Node current;
        if(head==null || newNode.data<head.data){
            newNode.next = head;
            head = newNode;
        }else{
            current = head;
            while (current.next!=null && newNode.data>current.next.data){
                    current = current.next;
            }
            newNode.next = current.next;
            current = newNode;
        }


    }



}
