package com.arrays;

public class LeadersInArray {

    /*Java Function to print leaders in an array */
    void printLeaders(int arr[], int size)
    {
        int max = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
