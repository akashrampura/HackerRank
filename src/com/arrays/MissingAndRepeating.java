package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeating {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };

        Map<Integer,Boolean> map = new HashMap<>();
        for(Integer i: arr){

            if(map.get(i)==null){
                map.put(i,true);
            }
            else{
                System.out.println("Repeating No.: "+i);
            }
        }
        int max = arr.length;
        for(int i=1;i<=max;i++){
            if(map.get(i)==null){
                System.out.println("Missing No: "+i);
            }
        }
    }
}
