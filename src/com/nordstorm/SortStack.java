package com.nordstorm;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(3);
        stack.add(0);
        stack.add(5);
        stack.add(1);
        stack.add(2);
        stack.add(7);

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()){
            int p = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > p){
                    stack.push(tempStack.pop());
            }
            tempStack.push(p);
        }
        System.out.println(tempStack);
    }
}
