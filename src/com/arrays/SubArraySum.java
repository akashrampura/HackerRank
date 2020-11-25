package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SubArraySum {

    /* Returns true if the there is a subarray of arr[] with sum equal to
       'sum' otherwise returns false.  Also, prints the result */
    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++)
        {

            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start<i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum )
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                int[] subArray = Arrays.copyOfRange(arr,start,i);
                System.out.println(Arrays.toString(subArray));
                return 1;

            }

            // Add this element to curr_sum
            if(i<n) {
                curr_sum = curr_sum + arr[i];
            }

        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args)
    {
        SubArraySum arraysum = new SubArraySum();
        int arr[] = {150, 2, 4, 8, 9, 5, 10, 1};
        int n = arr.length;
        int sum = 11;
        arraysum.subArraySum(arr, n, sum);
    }
}
