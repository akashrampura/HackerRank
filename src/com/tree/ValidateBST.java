package com.tree;


public class ValidateBST {

        NodeBST root;

    static class NodeBST
    {
        int data;
        NodeBST left, right;

        public NodeBST(int item)
        {
            data = item;
            left = right = null;
        }
    }

        boolean isBST()  {
            return isBSTUtil(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
        }

        /* Returns true if the given tree is a BST and its
          values are >= min and <= max. */
        boolean isBSTUtil(NodeBST node, int min, int max)
        {
            /* an empty tree is BST */
            if (node == null)
                return true;

            /* false if this node violates the min/max constraints */
            if (node.data < min || node.data > max)
                return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
            // Allow only distinct values
            System.out.println(node.data);
            return (isBSTUtil(node.left, min, node.data) &&
                    isBSTUtil(node.right, node.data, max));
        }

        /* Driver program to test above functions */
        public static void main(String args[])
        {
            ValidateBST tree = new ValidateBST();
            tree.root = new NodeBST(4);
            tree.root.left = new NodeBST(2);
            tree.root.right = new NodeBST(5);
            tree.root.left.left = new NodeBST(1);
            tree.root.left.right = new NodeBST(3);

            if (tree.isBST())
                System.out.println("IS BST");
            else
                System.out.println("Not a BST");
        }
    }

