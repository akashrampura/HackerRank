package com.arrays;

public class Kadane {

    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
                maxSubArraySum(a);
    }

    static void maxSubArraySum(int a[])
    {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
            if(sum<0){
                sum = 0;
            }

            if(max<sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
