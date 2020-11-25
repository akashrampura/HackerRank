package com.hackerrank;

public class Twitter3 {

    public static int maxEvents(int[] arrival, int[] duration){
        int result = 1;

        for (int i = 1; i < arrival.length && i < duration.length; i++) {
            result++;
            if(arrival[i]>arrival[i-1]+duration[i-1]){
                System.out.println(arrival[i]);
                result--;
                continue;
            }

        }
        System.out.println(result);

        return result;
    }

    public static int processJob(int[] weights, int[] tasks, int p){
        int result1 = 0;
        int result2 = 0;
        int[] tasks2 = {4,12,8,14,2};
        int sum = 0;
        int weightSum = 0;
        for (int i = 0; i < tasks2.length; i++) {

        }


        return result1;
    }

    public static void main(String[] args) {

        int[] arrival = {1,3,3,5,7};
        int[] duration = {2,2,1,2,1};
        //Twitter3.maxEvents(arrival,duration);
        int[] weights = {1,4,2,5,3};
        int[] tasks = {2,6,4,7,1}; // *2
        int p = 13;
        Twitter3.processJob(weights,tasks,p);

    }
}
