package com.linkedlist;

public class MergeLinkedLists {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    /*
    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
      */
    public Node mergeTwoLists(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.data < l2.data){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

/* Method to print linked linkedlist */
void printList(Node node)
{
    Node temp = node;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

    public static void main(String args[])
{
    /* Let us create two sorted linked
       lists to test the methods
       Created lists:
           llist1: 5->10->15,
           llist2: 2->3->20
    */
    MergeLinkedLists llist1 = new MergeLinkedLists();
    MergeLinkedLists llist2 = new MergeLinkedLists();

    // Node head1 = new Node(5);
    llist1.addToTheLast(new Node(5));
    llist1.addToTheLast(new Node(10));
    llist1.addToTheLast(new Node(15));

    // Node head2 = new Node(2);
    llist2.addToTheLast(new Node(2));
    llist2.addToTheLast(new Node(3));
    llist2.addToTheLast(new Node(20));


    Node node = new MergeLinkedLists().mergeTwoLists(llist1.head,llist2.head);
    llist1.printList(node);

}

}
