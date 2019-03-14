package com.arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ints2 = {9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
       String s =  Arrays.toString(ints)+Arrays.toString(ints);
       s = s.replace("[",",").replace("]",",");
       String s2 = Arrays.toString(ints2);
        System.out.println(s);
       if(s.indexOf(s2)!=-1){
           System.out.println("True");
       }

        int k =2, length = ints.length;
        int[] res = Arrays.copyOfRange(ints,length-k,length);
        int[] res1 = Arrays.copyOfRange(ints,0,length-k);

        int[] array1and2 = new int[res.length + res1.length];
        System.arraycopy(res, 0, array1and2, 0, res.length);
        System.arraycopy(res1, 0, array1and2, res.length, res1.length);
        System.out.println(Arrays.toString(array1and2));

    }
}
