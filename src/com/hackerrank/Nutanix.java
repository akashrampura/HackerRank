package com.hackerrank;

public class Nutanix {


    public static void main(String[] args) {

        int[] arr = {3,17,4,12,5,6,2,1};
        // 100,99,88,1,2,3,4,5,6,7
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=1; i<arr.length-2;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                count1++;
            }
            if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                count2++;
            }
            if(arr[i]-arr[i-1]==0){
                count3++;
            }
            long[] l = new long[2];
            Long max = Long.MIN_VALUE;



        }


    }

}
