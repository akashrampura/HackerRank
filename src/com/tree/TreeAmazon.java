package com.tree;

import java.util.ArrayList;

public class TreeAmazon {

    public static void main(String[] args) {
        CategoryNode root = new CategoryNode(20);

        CategoryNode l1 = new CategoryNode(12);
        root.subCategoryNode.add(l1);

        CategoryNode ll1 = new CategoryNode(11);
        l1.subCategoryNode.add(ll1);
        CategoryNode ll2 = new CategoryNode(2);
        l1.subCategoryNode.add(ll2);
        CategoryNode ll3 = new CategoryNode(3);
        l1.subCategoryNode.add(ll3);

        CategoryNode l2 = new CategoryNode(18);
        root.subCategoryNode.add(l2);

        CategoryNode l21 = new CategoryNode(15);
        l2.subCategoryNode.add(l21);
        CategoryNode l22 = new CategoryNode(8);
        l2.subCategoryNode.add(l22);

        TreeAmazon tree = new TreeAmazon();
        tree.doSomething(root);
    }

    CategoryNode output = null;
    public CategoryNode doSomething(CategoryNode root) {
        traverse(root);
        System.out.println(output.value);
        System.out.println(output.data.getAvg());
        return output;
    }

    float max = Float.MIN_VALUE;
    int nodeVal = -1;

    public void traverse(CategoryNode root) {
        System.out.println("Root: "+root.value);
        for (CategoryNode node : root.subCategoryNode) {
            traverse(node);
            root.updateByChild(node);
        }

        if(root.subCategoryNode.size() > 0) {
            System.out.print("for Root: "+root.value+ " the avg is ");
            float avg = root.data.getAvg();
            if (avg > max) {
                max = avg;
                nodeVal = root.value;
                output = root;
            }
        }
    }
}

class CategoryNode {
    public int value;
    public ArrayList<CategoryNode> subCategoryNode;
    public MyData data;

    public CategoryNode() {
        subCategoryNode = new ArrayList<CategoryNode>();
    }

    public CategoryNode(int tenure) {
        this();
        this.value = tenure;
        data = new MyData(this.value, 1);
    }

    public void updateByChild(CategoryNode node){
        this.data.updateTotal(node.data.getTotal(), node.data.getCount());
    }
}

class MyData{
    private int total;
    private int count;

    MyData(int total, int count){
        this.total = total;
        this.count = count;
    }

    public void updateTotal(int inc) {
        updateTotal(inc, 1);
    }

    public void updateTotal(int inc, int count) {
        this.total += inc;
        updateCount(count);
    }

    public void updateCount(int inc) {
        this.count += inc;
    }

    private void incCount() {
        updateCount(1);
    }

    public int getCount() {
        return count;
    }

    public int getTotal() {
        return total;
    }

    public float getAvg(){
        System.out.println("total "+total+" count "+count+" avg "+total*1f/count);
        return total*1f/count;
    }
}