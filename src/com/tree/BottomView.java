package com.tree;

import java.util.*;

public class BottomView {
    Node root;
    public List<Integer> bottomView(Node root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Map<Integer, Node> locationMap = new HashMap<>();
        locationMap.put(0, root);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            int loc = current.hd;
            if(current.left != null){
                current.left.hd = loc - 1;
                locationMap.put(loc - 1, current.left);
                queue.add(current.left);
            }
            if(current.right != null){
                current.right.hd = loc + 1;
                locationMap.put(loc + 1, current.right);
                queue.add(current.right);
            }
        }
        for(Node node : locationMap.values()){
            result.add(node.data);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        /* creating a binary tree and entering the nodes */
        BottomView tree = new BottomView();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        tree.bottomView(tree.root);
    }

}
