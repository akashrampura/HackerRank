package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class JewelsAndStones {

    public int numJewelsInStones(String S, String J) {

        int count = 0;
        List<Character> list = new ArrayList<>();
        for(int i=0; i<J.length();i++){
            list.add(J.charAt(i));
        }
        System.out.println(list);
        for(int i=0; i<S.length();i++){
            if(list.contains(S.charAt(i))){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String J = "a.A";
        String S = "aAAbbbb";
        String[] sArr =  J.split(".");
        J = J.replaceAll("\\.","[.]");
        System.out.println(J);
        //System.out.println(Arrays.toString(sArr));
        //int c = new JewelsAndStones().numJewelsInStones(S,J);
    }
}
