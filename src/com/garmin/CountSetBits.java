package com.garmin;

public class CountSetBits {

    public static void main(String[] args) {
        // O(log(n))
        int n = 9;
        int count = 0;
        while(n > 0){
            n &= n - 1;
            count++;
        }
        System.out.println(count);
    }
}
