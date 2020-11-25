package com.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OpsRamp {

    public static long idealNumbers(long l, long r){
        // 3,9,18
        int result = 0;
        for(long i=0; i<=Math.sqrt(r);i++){
            for(long j=0; j<=Math.sqrt(r);j++){
                double a = Math.pow(3,i)*Math.pow(5,j);
                System.out.println(i+" "+j);
                if(a>=l && a <= r){
                    //System.out.println(a);
                    result++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {


        for(int i=1; i<18;i++){
            System.out.println(i);
            System.out.println(i&(i-1));
            System.out.println((i&(i-1))==0);
        }


    }
}
