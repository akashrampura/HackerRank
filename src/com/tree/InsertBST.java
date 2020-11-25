package com.tree;



public class InsertBST {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static Node insert(Node root,int data) {
        if(root == null){
            Node node = new Node(data);
            return node;
        }
        if(data < root.data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static Node search(Node root, int data){
        if(root==null || data == root.data){
            return root;
        }
        if(data < root.data){
             return search(root.left,data);
        }else{
             return search(root.right, data);
        }
    }

    public static Node search2(Node root, int data){
        while(root != null){
            if(data == root.data) break;
            if(data > root.data){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return root;
    }

}
