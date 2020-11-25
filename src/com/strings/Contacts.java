package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

    public static void main(String[] args) {
        String[][] sAr = {{"vijay","kn"},{"vinay","k"}};
       for(int i=0;i<sAr.length;i++){
           for(int j=0;j<sAr[i].length;j++){
               System.out.println(sAr[i][j]);
           }

       }

        Map<String,Integer> map = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            
        }

    }

}
