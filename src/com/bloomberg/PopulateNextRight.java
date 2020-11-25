package com.bloomberg;

public class PopulateNextRight {
     class Node {
         public int val;
         public Node left;
         public Node right;
         public Node next;

         public Node() {
         }

         public Node(int _val, Node _left, Node _right, Node _next) {
             val = _val;
             left = _left;
             right = _right;
             next = _next;
         }

         public Node connect(Node root) {
             Node node = root;
             while (node != null) {
                 Node current = node;
                 while (current != null) {
                     if (current.left != null) {
                         current.left.next = current.right;
                     }
                     if (current.right != null && current.next != null) {
                         current.right.next = current.next.left;
                     }
                     current = current.next;
                 }
                 node = node.left;
             }
             return root;
         }
     }
}
