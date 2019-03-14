package com.list;

public class RotateLinkedList {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int d){
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }
    public void print(Node node){
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    // 10->20->30->40->50->60  50->60->10->20->30->40
    public void rotate(Node node, int k){
        if(k==0){
            return;
        }
        Node current = node;
        int count = 1;
        while(count<k && current != null){
            current = current.next;
            count++;
        }
        if(current==null){
            return;
        }

        Node kThNode = current;

        while(current!=null){
            current = current.next;
        }
        current.next = head;
        head = kThNode.next;
        kThNode.next = null;
    }

}
