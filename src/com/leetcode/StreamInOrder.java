package com.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StreamInOrder {

    static void streamOrder(Map<Integer,String> map) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int min = 0;
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            if(entry.getKey() == min+1){
                System.out.println(entry.getKey()+" "+entry.getValue());
                min++;
            }else{
                pq.add(entry.getKey());
            }

        }
        while(!pq.isEmpty()){
            int val = min + 1;
            if(val == pq.peek()){
                System.out.println(val+" "+map.get(min+1));
                min++;
                pq.poll();
            }

        }

    }

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Vijay");
        map.put(5,"Nagaraj");
        map.put(7,"Karigowdara");
        map.put(6,"Q");
        map.put(2,"S");
        streamOrder(map);
    }
}
