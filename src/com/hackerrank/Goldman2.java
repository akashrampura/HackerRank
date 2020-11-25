package com.hackerrank;

import java.util.*;

public class Goldman2 {

    public static List<String> strangeSort(List<Integer> mapping, List<String> nums){
        List<String> result = new ArrayList<>();
        Map<Integer,Integer> intMap = new HashMap<>();
        for(int i=0;i<mapping.size();i++){
            intMap.put(mapping.get(i),i);
        }
        System.out.println(intMap);

        return result;

    }
    public static void sub(){
        String s = "ABBCZBAC";
        //s = "ABC";
        long count = 0;
        for(int i=0; i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String sub = s.substring(i,j);
                //System.out.println(sub);
                if(sub.contains("A") && sub.contains("B") && sub.contains("C")){
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        List<Integer> mapping = new ArrayList<>(Arrays.asList(2,1,4,8,6,3,0,9,7,5));
        List<String> nums  = new ArrayList<>(Arrays.asList("12","02","4","023","65","83","224","50"));
        strangeSort(mapping,nums);

    }
}
