package com.stacks;

import java.util.Stack;

public class BalancedParan {

    public static Boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
            System.out.println(stack);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String par = "{ ( [ ( ) ] ) }";
        System.out.println(isBalanced(par));


    }




}
