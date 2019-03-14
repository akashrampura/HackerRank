package com.tree;
// Java program to find averages of all levels
// in a binary tree.
import java.util.*;
class AverageOfLevels {

    /* A binary tree node has data, pointer to
    left child and a pointer to right child

    Start by pushing the root node into the queue. Then, remove a node from the front of the queue.
For every node removed from the queue, push all its children into a new temporary queue.
Keep on popping nodes from the queue and adding these node’ s children to the temporary queue till queue becomes empty.
Every time queue becomes empty, it indicates that one level of the tree has been considered.
While pushing the nodes into temporary queue, keep a track of the sum of the nodes along with the number of nodes pushed and find out the average of the nodes on each level by making use of these sum and count values.
After each level has been considered, again initialize the queue with temporary queue and continue the process till both queues become empty.

    */
    static class Node {
        int val;
        Node left, right;
    }

    /* Function to print the average value of the
    nodes on each level */
    static void averageOfLevels(Node root)
    {
        //vector<float> res;
        // Traversing level by level
        Queue<Node> q = new LinkedList<Node> ();
        q.add(root);
        int sum = 0, count = 0;

        while (!q.isEmpty()) {

            // Compute sum of nodes and
            // count of nodes in current
            // level.
            sum = 0;
            count = 0;
            Queue<Node> temp = new LinkedList<Node> ();

            while (!q.isEmpty()) {
                Node n = q.peek();
                q.remove();
                sum += n.val;
                count++;
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }
            q = temp;
            System.out.print("Avg: "+(sum * 1.0 / count) + " ");
        }
    }

    /* Helper function that allocates a
    new node with the given data and
    NULL left and right pointers. */
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.val = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    // Driver code
    public static void main(String[] args)
    {
	/* Let us construct a Binary Tree
		4
	/ \
	2 9
	/ \ \
	3 5 7 */

        Node root = null;
        root = newNode(4);
        root.left = newNode(2);
        root.right = newNode(9);
        root.left.left = newNode(3);
        root.left.right = newNode(5);
        root.right.right = newNode(7);
        //System.out.println("Averages of levels : ");
        //System.out.print("[");
        averageOfLevels(root);
        //System.out.println("]");
        // create object of Queue

    }
}
