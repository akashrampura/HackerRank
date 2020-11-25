package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ClosestMin {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 3, 4, 1, 2, 1};
        int min  = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(arr[i] == min){
                list.add(i);
            }
        }
        int minDist = Integer.MAX_VALUE;
        for(int i=1; i<list.size();i++){
            if(list.get(i)-list.get(i-1) < minDist){
                minDist = list.get(i)-list.get(i-1);
            }
        }
        System.out.println(minDist);


    }
}
