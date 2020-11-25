package com.linkedlist;

public class NthFromLast {
    Node head; // head of the linkedlist

    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to get the nth node from the last of a
       linked linkedlist */
    void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(n>len){
            return;
    }
        temp = head;
        for (int i=0;i<len-n+1;i++){
            temp = temp.next;
    }
        System.out.println(temp.data);

    }

    /* Inserts a new Node at front of the linkedlist. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*Drier program to test above methods */
    public static void main(String [] args)
    {
        NthFromLast llist = new NthFromLast();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(4);
    }
}
