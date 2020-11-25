package com.arrays;

import java.util.*;
import java.util.stream.IntStream;

public class Test {
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    Test(){
        this.root = null;
    }
    public Node search(Node root, int key){

        if(root.val == key || root == null){
            return root;
        }
        if(key > root.val){
            return search(root.right, key);
        }
            return search(root.left,key);
    }

    public Node insert(Node root, int val){

        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val > root.val){
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static void main(String[] args) {





    }

}
