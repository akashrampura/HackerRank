package com.dp;

import java.util.Arrays;

public class MaxSumIncrSubSeq {

    /* maxSumIS() returns the
    maximum sum of increasing
    subsequence in arr[] of size n */
    static int maxSumIS(int arr[], int n)
    {
        int[] msis = new int[n];
        for(int i=0;i<n;i++){
            msis[i] = arr[i];
        }
       int max = 0;
       for(int i=1;i<n;i++){
           for(int j=0;j<i;j++){
               if(arr[i]>arr[j] && msis[i]<msis[j]+arr[i]){
                   msis[i] = msis[j] + arr[i];
               }
           }
       }
        System.out.println(Arrays.toString(msis));
       for (int i=0;i<n;i++){
           if(msis[i]>max){
               max = msis[i];
           }
       }
       return max;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.println("Sum of maximum sum "+
                "increasing subsequence is "+
                maxSumIS(arr, n));
    }
}
