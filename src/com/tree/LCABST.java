package com.tree;

public class LCABST {

    public static Node lca(Node node, int n1, int n2){

        while(node!=null){
            if(n1>node.data && n2>node.data){
                node = node.right;
            }else if(n1<node.data && n2<node.data){
                node = node.left;
            }else{
                break;
            }
        }
        return  node;

    }


}
