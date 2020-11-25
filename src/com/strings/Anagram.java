package com.strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String t = "forgeksgeeks";

        int[] a = new int[26];
        for(char c : s.toCharArray()){
            a[c-'a']++;
        }

        for(char c : t.toCharArray()){
            a[c-'a']--;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                System.out.println("Not Anagram");
                break;
            }
        }
        System.out.println("is Anagram");
    }
}
