package com.leetcode;

import java.util.Stack;

public class CandyCrush1D {

    static class Adjscent{
        int freq;
        Character ch;

        Adjscent(Character ch){
            this.ch = ch;
            this.freq = 1;
        }

        @Override
        public String toString() {
            return "Adjscent{" +
                    "freq=" + freq +
                    ", ch=" + ch +
                    '}';
        }
    }

    public static void main(String[] args) {

        String str = "aaabbbc";
        Stack<Adjscent> stack = new Stack<>();

        for(Character c : str.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch==c){
                stack.peek().freq++;
            }else{
                stack.push(new Adjscent(c));
            }
            if(stack.peek().freq == 3){
                stack.pop();
            }
            //System.out.println(stack);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Adjscent adj = stack.pop();
            for(int i=0; i<adj.freq;i++){
                sb.append(adj.ch);
            }
        }
        System.out.println(sb);



    }
}
