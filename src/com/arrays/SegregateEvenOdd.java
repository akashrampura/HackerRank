package com.arrays;

import java.util.Arrays;

public class SegregateEvenOdd {

    static void segEvenOdd(int [] arr){

        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]%2==0 && l<r){
                l++;
                System.out.println("l: "+l);
            }
            if(arr[r]%2!=0 && l<r){
                r--;

            }
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;

            }
        }
        System.out.println(Arrays.toString(arr));



    }
    public static int findComplement(int num)
    {
        int i = 0;
        int j = 0;

        while (i < num)
        {
            i += Math.pow(2, j);
            System.out.println(i);
            j++;
        }

        return i - num;
    }


    public static void main(String[] args) {

        //segEvenOdd(new int[]{22,7,45,8,9,44,77});
        System.out.println(~2);
    }
}
