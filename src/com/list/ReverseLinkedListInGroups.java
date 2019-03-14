package com.list;

public class ReverseLinkedListInGroups {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    void printList(Node node){
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static Node reverse(Node node, int k){
        Node current = node;
        Node prev = null;
        Node next = null;
        int count = 0;
        while(count<k && current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        while(next!=null){
            head.next = reverse(next,k);
        }
        return prev;

    }
}
