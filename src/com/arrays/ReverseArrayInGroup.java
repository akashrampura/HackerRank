package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayInGroup {

    // Function to reverse every sub-array formed by
    // consecutive k elements
    static void reverse(int arr[], int n, int k)
    {
        for(int i=0;i<=n;i+=k){

            int l=i;
            int r = Math.min(i+k-1,n-1);
            while(l<r){
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r--;
            }

        }
    }

    // Driver method
    public static void main(String[] args)
    {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;

        int n = arr.length;

        reverse(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
