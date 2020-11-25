package com.arrays;

import java.util.Stack;

public class NextGreaterElement {

    static int arr[] = {11, 13, 3, 21};

    /* prints element and NGE pair for all
    elements of arr[] of size n */
    public static void printNGE()
    {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                nge[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " --> " + nge[i]);
    }
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        //NextGreaterElement nge = new NextGreaterElement();
        printNGE();
    }
}
