package com.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LogestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        String res = "";
        int len = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                count++;
                if(len>i+j){
                    continue;
                }
                String sub = s.substring(i,j);
                StringBuilder sb = new StringBuilder(sub);
                String rev = sb.reverse().toString();
               // System.out.println(sub);
                if(sub.equals(rev)){
                    if(sub.length()>len){
                        res = sub;
                        len = sub.length();
                    }

                }
            }
        }
        System.out.println(count);
        System.out.println(res);
    }
}
