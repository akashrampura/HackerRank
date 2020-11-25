package com.practice;

import java.rmi.Remote;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test implements Cloneable {

    static long repeatedString(String s, long n) {
        long result = 0;

        long aLen = s.length(), stringLen = s.length();
        if(n<stringLen){
            aLen = n;
        }
        for(int i=0;i<aLen;i++){
            if(s.charAt(i)=='a'){
                result++;
            }
        }

        long k = n/stringLen ;
        System.out.println("K: "+k);


        if(n%stringLen==0){
            result = result * k;
            System.out.println(" result = "+result);
            return  result;
        }
        else if(n<2*stringLen){
             aLen = n-stringLen;
             for(int i=0; i<aLen;i++){
                 if(s.charAt(i)=='a'){
                     result++;
                 }
             }
        }else{
            result = result *k;
            aLen = n-(k*stringLen);
            System.out.println(" Array len = "+aLen);
            for(int i=0; i<aLen;i++){
                if(s.charAt(i)=='a'){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        // abaabaabaab
        //System.out.println(repeatedString("aab",882787));
        //HashSet<Character> set = new HashSet<>();
         List<Integer>  list = new ArrayList<>();
         PriorityQueue<Integer> pq = new PriorityQueue<>();



    }

}
