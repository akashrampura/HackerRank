package com.hackerrank;

import java.util.*;

public class Clutter {



    public static void main(String[] args) {

        List<String> list = Arrays.asList("mission impossible","man on a mission","byte to eat","eat my words");
        HashMap<String,String> firstMap = new HashMap<>();
        HashMap<String,String> lastMap = new HashMap<>();
        for (String s: list ) {
            String[] sArr = s.split(" ");
            lastMap.put(sArr[sArr.length-1],s);
            s = s.replaceAll(sArr[0],"");
            firstMap.put(sArr[0],s);
        }
        System.out.println(lastMap);
        System.out.println(firstMap);

        List<String> result = new ArrayList<>();

        for(Map.Entry<String,String> e  : firstMap.entrySet()){
            if(lastMap.get(e.getKey())!=null){
                System.out.println(lastMap.get(e.getKey())+e.getValue());
            }
        }


    }
}
