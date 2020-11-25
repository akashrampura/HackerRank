package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LCABT {

    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null || root == p || root == q) return root;
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left == null && right == null) return null;
        if(left != null && right != null) return root;
        return left == null ? right : left;

    }

    int lca(Node node, int n1, int n2){
        if(!findLca(node,n1,path1) || !findLca(node,n2,path2)){
            return -1;
        }
        int i=0;
        for(i = 0; i< path1.size() && i< path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }
    Boolean findLca(Node node, int n, List<Integer> path){
        if(node==null){
            return false;
        }
        path.add(node.data);
        if(node.data==n){
            return true;
        }
        if(node.left!=null && findLca(node.left,n,path)){
            return  true;
        }
        if(node.right!=null && findLca(node.right,n,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }


}
