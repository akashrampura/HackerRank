package com.hackerrank;

public class BloombergMohit {

    public static void main(String[] args) {
        String a  = "ab(c(d)e";
        String b  = "[a{{b}c}d(e)]";
        String c  = "(a)b(cd)ef";
        int currMax = 0, max = 0;
        for(char ch : b.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                currMax++;
                max = Math.max(currMax,max);
            }


        }
        System.out.println('8'-'0');

    }
}
