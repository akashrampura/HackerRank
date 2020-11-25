package com.tree;

import java.util.*;

public class TopView {
    Node root;
    public List<Integer> topView(Node root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        java.util.Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.add(root.data);
        Node root1 = root;
        while(root1.left != null){
            stack.add(root1.left.data);
            root1 = root1.left;
        }
        Node root2 = root;
        while(root2.right != null){
            queue.add(root2.right.data);
            root2 = root2.right;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        while(!queue.isEmpty()){
            result.add(queue.poll());
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        /* creating a binary tree and entering the nodes */
        TopView tree = new TopView();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        tree.topView(tree.root);
    }
}
