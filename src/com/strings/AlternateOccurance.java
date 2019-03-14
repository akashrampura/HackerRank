package com.strings;

import java.util.*;

public class AlternateOccurance {

    static void printStringAlternate(String str)
    {
        int[] occ = new int[122];

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            occ[c]++;
            if(occ[c]%2!=0){
                System.out.print(c);
            }
        }
    }

    // driver program
    public static void main (String[] args)
    {
        String str1 = "geeksforgeeks";
        String str2 = "It is a long day Dear";
        //printStringAlternate(str1);
       // printStringAlternate(str2);
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character c: str1.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);

        }
        for(Character c: map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
       // System.out.println(map);

    }
}
