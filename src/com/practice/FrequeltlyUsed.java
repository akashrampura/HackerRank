package com.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequeltlyUsed {
    static void frequentlyUsedNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max = 0,mostFreq = 0;
        for(Integer key:map.keySet()){
            if(map.get(key)>=max){
                max = map.get(key);
                mostFreq = key;
            }

        }
        System.out.println(map);
        System.out.println(mostFreq);


    }

    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,6,6,7,7,0};
        frequentlyUsedNumber(arr);


    }
}
