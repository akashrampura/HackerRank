package com.amazon;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDS {

    Map<Integer, Integer> map = new HashMap<>();

    public void add(int value){
        map.put(value, map.getOrDefault(value,0) + 1);
    }

    public boolean find(int value){
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int compliment = value - entry.getKey();
                if(entry.getKey() == compliment){
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
