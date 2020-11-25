package com.arrays;

public class Kadane {

    public static void main (String[] args)
    {
        int [] a = {-2, -3, -4, -1, -2, -1, -5, 3};
                maxSubArraySum2(a);
    }
/*
    Simple idea of the Kadane’s algorithm is to look for all positive contiguous segments of the array
            (max_ending_here is used for this). And keep track of maximum sum contiguous segment among all positive
    segments (max_so_far is used for this). Each time we get a positive sum compare it with max_so_far and update
    max_so_far if it is greater than max_so_far*/

    static void maxSubArraySum(int a[])
    {
        int max_so_far =  a[0];
        int max_ending_here = a[0];
        for(int i=1; i<a.length; i++){
            max_ending_here += a[i];
            if(max_ending_here<0){
                max_ending_here = 0;
            }
            else if(max_ending_here>max_so_far){
                max_so_far = max_ending_here;
            }

        }
        System.out.println(max_so_far);
    }

    static void maxSubArraySum2(int a[])
    {
        int max =  a[0];
        int currMax = a[0];
        for(int i=1; i<a.length; i++){

            currMax = Math.max(a[i],currMax+a[i]);
            max = Math.max(max,currMax);

        }
        System.out.println(max);
    }
}
