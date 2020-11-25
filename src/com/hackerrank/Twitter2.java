package com.hackerrank;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Twitter2 {



    public static void main(String[] args) {

       String s = "mokkori";

        Set<String> set = new HashSet<>();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                StringBuilder sb = new StringBuilder(s.substring(i,j));
                sb.reverse();
                if(s.substring(i,j).equals(sb.toString())){
                    set.add(s.substring(i,j));
                }

            }
        }
        System.out.println(set.size());

    }
}
