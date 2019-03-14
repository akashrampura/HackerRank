package com.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class MaxDifference {

    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff = -1;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                count++;

                if(arr[j]>arr[i] && (j-i)>maxDiff){
                    maxDiff = j-i;
                }
            }
        }
        System.out.println(count);

        return maxDiff;
    }
    int maxDiff(int arr[], int n)
    {
       int maxDiff = -1;

       int[] Lmin = new int[n];
       int[] Rmax = new int[n];

       Lmin[0] = arr[0];
       for(int i=1;i<n;i++){
           Lmin[i] = Math.min(arr[i],Lmin[i-1]);

       }
        System.out.println("Lmin: "+Arrays.toString(Lmin));
       Rmax[n-1] = arr[n-1];
       for(int j=n-2;j>=0;j--){
           Rmax[j] = Math.max(arr[j],Rmax[j+1]);
       }
        System.out.println("Rmax: "+Arrays.toString(Rmax));
        int i=0,j=0;
        while (i<n && j<n){
            if(Lmin[i]<Rmax[j]){
                maxDiff = Math.max(maxDiff,j-i);
                j++;
            }
            else{
                i++;
            }
        }
       return maxDiff;

    }


    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        MaxDifference max = new MaxDifference();
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int n = arr.length;
        int maxDiff = max.maxDiff(arr, n);
        System.out.println(maxDiff);
    }
}
