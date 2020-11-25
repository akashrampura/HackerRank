package com.leetcode;

import java.util.*;

public class StringSubset {


    public static void generateSubSeq(int startIndex, String str, List<String> subset, List<String> result){

        String resString = String.join("",subset);
        result.add(resString);
        System.out.println(subset);
        for(int i=startIndex;i<str.length();i++){
            subset.add(String.valueOf(str.charAt(i)));
            generateSubSeq(i+1,str,subset,result);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args) {
       String str = "abc";
       List<String> subset = new ArrayList<>();
       List<String> result = new ArrayList<>();
       generateSubSeq(0,str,subset,result);
       System.out.println(result);
    }
}
