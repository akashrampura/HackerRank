package com.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PureStorage {

    public void countNumber(){
            int num = 7651;
            int result = 0;
            if(num%3==0){
                System.out.println("Divisible");
                result += 4;
            }
            int seq = 1;
            String s = String.valueOf(num);
            int extraPair = 0;
            for(int i=0; i<s.length();i++){
                // 7 found
                Integer current = Character.getNumericValue(s.charAt(i));
                if(current==7){
                    result += 5;
                }
                // even
                if(current%2==0){
                    result += 3;
                }
                // N^2 98765320
                if(i+1<s.length()){
                    Integer next = Character.getNumericValue(s.charAt(i+1));
                    if(current-next==1){
                        seq += 1;
                    }else{
                        result += seq*seq;
                        System.out.println("No Sequence: Seq: "+seq*seq);
                        seq = 1;
                    }

                    System.out.println("Current : "+current+" Next: "+next+" Seq"+seq);
                    // consi
                    if(current==2 && next==2){
                        System.out.println("Consi");
                        extraPair += 1;
                        result += extraPair*6;
                    }
                }
            }
            System.out.println("Final seq:"+seq);
            result += seq*seq;
            System.out.println(result);

    }

    public Boolean isMatching(String a, String b){
        Boolean isMatch = false;
        String[] acquire = a.split(" ");
        String[] release = b.split(" ");
        if(acquire[0].startsWith("a") && release[0].startsWith("r") && acquire[1] == release[1] ){
            isMatch = true;
        }


        return isMatch;
    }

    public static void main(String[] args) {

        int[][] arr  = new int[4][4];
        new PureStorage().countNumber();



    }


}
