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


    }
}
