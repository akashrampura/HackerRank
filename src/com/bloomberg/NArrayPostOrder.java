package com.bloomberg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NArrayPostOrder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        // loop reverse for pre-order
        public List<Integer> postorder(Node root) {
            LinkedList<Integer> result = new LinkedList<>();
            if(root == null) return result;
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()){
                Node node = stack.pop();
                result.addFirst(node.val);
                for(Node child : node.children){
                    stack.push(child);
                }
            }
            return result;
        }
    }

}
