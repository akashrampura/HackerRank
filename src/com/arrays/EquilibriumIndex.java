package com.arrays;

import java.util.Arrays;

public class EquilibriumIndex {

    int equilibrium(int arr[], int n)
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        sum = Arrays.stream(arr).sum();
        for (int i = 0; i < n; ++i) {

            sum -= arr[i]; // sum is now right sum for index i
            System.out.println("leftsum: "+leftsum+" Sum: "+sum);
            if (leftsum == sum)
                return i;
            leftsum += arr[i];


        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr2[] = { 1,2,3,4,5,5 };
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " +
                equi.equilibrium(arr, arr_size));
    }

}
