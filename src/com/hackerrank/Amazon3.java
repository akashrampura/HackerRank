package com.hackerrank;

import java.util.Arrays;
import java.util.List;

public class Amazon3 {



    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,3,5,7,2,8,9,6,1,4);
        int target = 7;
        int result = 0;
        for(int i = 0; i<list.size();i++){
            for(int j = i+1; j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println(list.get(i)+" "+list.get(j));
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
