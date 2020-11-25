package com.hackerrank;

import java.util.*;

public class AmazonMohit2 {

    public static ArrayList<String> popularNFeatures(int n, int topFeatures, List<String> possibleFeatures, int nf, List<String> featureRequests){
        ArrayList<String> result = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        //System.out.println(possibleFeatures);
        //System.out.println(featureRequests);
        for(String possible : possibleFeatures){
            for(String feature : featureRequests){
                if(feature.toLowerCase().contains(possible.toLowerCase())){
                    map.put(possible.toLowerCase(),map.getOrDefault(feature,0)+1);
                    continue;
                }
            }
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<String,Integer>> pq =
                new PriorityQueue<>((a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue());

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.add(entry);
            if(pq.size() > topFeatures){
                pq.poll();
            }
        }
        while (!pq.isEmpty()){
            result.add(0,pq.poll().getKey());
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        List<String> pf = new ArrayList<>(Arrays.asList("storage","battery","hoover","alexa","waterproof","solar"));
        List<String> fr = new ArrayList<>(Arrays.asList("I wish storage!","battery life of my","waterproof sssfsf","waterproof","solar","waterproof","waterproof"));
        popularNFeatures(6,2,pf,7,fr);
    }
}
