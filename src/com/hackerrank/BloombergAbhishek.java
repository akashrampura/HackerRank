package com.hackerrank;

import java.sql.SQLOutput;
import java.util.*;

public class BloombergAbhishek {

    static class Adj{
        char ch;
        int freq;
        Adj(char ch){
            this.ch = ch;
            this.freq = 1;
        }
    }

    public static void main(String[] args) {
        String s = "AABBBAB"; // B
        LinkedList<Adj> stack = new LinkedList<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch == c){
                stack.peek().freq++;
            }else{
                stack.push(new Adj(c));
            }
            if(stack.peek().freq == 3){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Adj adj = stack.removeLast();
            for(int i = 0; i< adj.freq; i++){
                sb.append(adj.ch);
            }
        }
        System.out.println(sb.toString());
    }
}
