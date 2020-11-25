package com.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }

    public void levelOrder(Node node){

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){

            Node n = queue.poll();
            System.out.println(n.data);
            if(n.left!=null){
                queue.add(n.left);
            }if(n.right!=null){
                queue.add(n.right);
            }

        }

    }

}
