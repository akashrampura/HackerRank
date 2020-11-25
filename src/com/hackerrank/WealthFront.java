package com.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WealthFront {

    public int solution(String S, String T) {
        // write your code in Java SE 8
        int count = 0;
        int start = getNumber(S);
        int end = getNumber(T);
        HashSet<Integer> hs = new HashSet<>();
        int temp;

        for(int i = start; i <= end; i++){
            hs.clear();
            if(i < 100000 ) hs.add(0);
            if(i % 10000 > 5959) i+=4040;
            if(i % 100 > 59) i+=40;
            temp = i;

            while(temp > 0){
                hs.add(temp % 10);
                temp = temp/10;
                if(hs.size() > 2) break;
            }
            //System.out.println(hs);

            if(hs.size() <= 2) {
                //System.out.println(i);
                count++;};
        }
        return count;
    }

    public int getNumber(String s){
        return Integer.parseInt(s.substring(0,2)) *10000 +Integer.parseInt(s.substring(3,5)) *100 + Integer.parseInt(s.substring(6));

    }


    public static void main(String[] args) {
        // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
        List<Integer> list = new ArrayList<>();
        Integer a = 1;
        int[] arr = new int[2];
        arr.clone();



    }
}
