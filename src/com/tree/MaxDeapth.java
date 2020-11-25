package com.tree;

class Node{
    int data;
    Node left,right;
    int hd;
    Node(int d){
        left = right = null;
        data = d;
    }

}
public class MaxDeapth {

    Node root;

    int maxDeapth(Node node){

        if(node==null){
            return 0;
        }else{
            int l = maxDeapth(node.left);
            int r = maxDeapth(node.right);
            if(l>r){
                return l+1;
            }else{
                return r+1;
            }
        }




    }


}
