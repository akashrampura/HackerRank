package com.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];
        System.out.println(Arrays.toString(arr3));

        int i = 0, j = 0, k = 0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
