package com.linkedlist;

import java.util.HashSet;

public class DetectRemoveLoop {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function that detects loop in the linkedlist
    void detectAndRemoveLoop(Node node) {

        HashSet<Node> set = new HashSet<>();
        Node prev = null;
        while (node!=null){

            if(!set.contains(node)){
                set.add(node);
                prev = node;
                node = node.next;
            }else{
                prev.next = null;
                System.out.println("List containd loop");
            }
        }

    }

    // Function to print the linked linkedlist
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        DetectRemoveLoop list = new DetectRemoveLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }
}
