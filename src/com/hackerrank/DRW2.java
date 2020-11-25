package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;

public class DRW2 {

    public static void main(String[] args) {
        int[] arr = {2,-2,3,0,4,-7};
        HashMap <Integer, Integer> map = new HashMap<>();
        int res = 0;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum == 0){
                res++;
            }
            if (map.containsKey(currsum ))
                res += map.get(currsum);
            Integer count = map.get(currsum);
            if (count == null)
                map.put(currsum, 1);
            else
                map.put(currsum, count+1);
        }
        System.out.println(res);
    }
}
