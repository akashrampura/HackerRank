package com.arrays;

import java.util.HashMap;

public class MinDistance {

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int min  = Integer.MAX_VALUE;
        int prev = 0;
        int x = 3, y = 6;
        boolean flag = true;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == x || arr[i] == y && flag) {
                prev = i;
                flag = false;
            }
            if(arr[i] == x || arr[i] == y){
                if(arr[i] != arr[prev] && (i - prev) < min){
                    min = i - prev;
                    prev = i;
                }else{
                    prev = i;
                }
            }

        }
        System.out.println(min);

    }
}
