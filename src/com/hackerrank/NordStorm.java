package com.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class NordStorm {
    private static void doSome(String[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] input = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            input[i] = Integer.parseInt(arr[i]);
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }

        int k = (int) Math.ceil(Math.log(arr.length) / Math.log(2));

        float buck = ((max - min + 1) / (k * 1f));

        int[] freq = new int[k];

        for (int i = 0; i < input.length; i++) {
            freq[(int) ((input[i] - min) / buck)]++;
        }

        for (int i : freq) {
            System.out.print((int) Math.round(i * 100f / input.length) + " ");
        }
    }

    public static void nthLargestString(){
        List<String> stringList = new ArrayList<>(Arrays.asList("Vijay","ab","Hi how are","ascd"));
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->b.length()-a.length());
        int k = 1;
        for(String s : stringList){
            pq.add(s);
        }
        System.out.println(pq);


    }


    public static void main(String[] args) throws Exception {
       List<Integer> list = new ArrayList<>(Arrays.asList(14,15,15,14,13,19,21,10));
        int k = 0;
        int i = 0;
        while(true){
            if(Math.pow(2,i)>=list.size()){
                k = i;
                break;
            }
            i++;
        }
        System.out.println(k);
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            String[] arr = line.split(" ");
            doSome(arr);
        }
        nthLargestString();



    }
}
