package com.hackerrank;

import java.util.*;

public class HeavyWaters {

    static class Node{

        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }

    public int maxDif(int[] arr){
        int maxDiff = arr[1]-arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-min>maxDiff){
                maxDiff = arr[i] - min;
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(maxDiff);
        return maxDiff;
    }

    public void decimalToBinary(int n){
        int[] bin = new int[1000];
        int i = 0;
        while(n>0){
            System.out.println(n%2);
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(bin[j]);

    }

    public void removeDuplicate(Node node){

        Node current = node;
        Node prev = null;
        Set<Integer> set = new HashSet<>();
        while(current!=null){
            int currVal = current.data;
            if(!set.contains(currVal)){
                set.add(currVal);
                prev = current;
            }else{
                prev.next = current.next;
            }
            current = current.next;
        }

    }


        public static void main(String[] args) {

        int[] arr = {2,4,8,2,6,0,4,7};

        HeavyWaters hw = new HeavyWaters();
        //hw.maxDif(arr);
        hw.decimalToBinary(17);


    }
}
