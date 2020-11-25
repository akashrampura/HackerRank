package com.leetcode;

public class RepeatedStringMatch {

    public static int repeatedStringMatch(String A, String B) {

        int i=1;
        int count = 1;
        String s = A;
        while(s.length()<=10000){
            if(s.indexOf(B)!=-1){
                return count;
            }else{
                count++;
                s += A;
            }

        }

        return -1;


    }

    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abac","abacabacabac"));


    }
}
