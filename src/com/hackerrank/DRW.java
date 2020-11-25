package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class DRW {

    public int solders (int[] ranks){

        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < ranks.length; i++) {
           map.put(ranks[i],map.getOrDefault(ranks[i],0)+1);

        }
        System.out.println(map);
        for(Integer i: map.keySet()){
            if(map.containsKey(i+1)){
                result += map.get(i);
            }
        }
        System.out.println(result);
        return result;

    }

    public int longestBeads (int[] ranks){

        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < ranks.length; i++) {
            map.put(ranks[i],map.getOrDefault(ranks[i],0)+1);

        }
        System.out.println(map);
        for(Integer i: map.keySet()){
            if(map.containsKey(i+1)){
                result += map.get(i);
            }
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        int[] sArr = {3,4,3,0,2,2,3,0,0};
        new DRW().solders(sArr);
        int[] longestBeads = {3,4,3,0,2,2,3,0,0};
        new DRW().solders(sArr);
    }
}
