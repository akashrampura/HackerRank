package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OneTwoEightTech {

    public static int solution(String s){

        String[] sArr = s.split(",");
        System.out.println(Arrays.toString(sArr));
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<sArr.length;i +=2){
            String phS = sArr[i+1].replaceAll("-","");
            String[] dur = sArr[i].split(":");
            String hr = dur[0];
            Integer min = Integer.parseInt(dur[1]);
            Integer sec = Integer.parseInt(dur[2]);
            Integer ph = Integer.parseInt(phS);
            int cost = 0;
            if(!map.containsKey(ph)){
                cost = 0;
            }else{
                cost = map.get(ph);
            }
            if(min<5){
                cost += (60*min + sec)*3;
            }else{
                if(sec > 0){
                    min += 1;
                }
                cost += min * 150;

            }

            map.put(ph,cost);
        }
        System.out.println(map);

        return map.get(0);

    }

    public static void main(String[] args) {

        solution("00:01:07,400-200-388,00:05:01,948-769-837,00:05:00,400-200-388");

    }
}
