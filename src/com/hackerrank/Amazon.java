package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Amazon {

    static void NextGreatestInteger(int[] arr){
        System.out.println(Arrays.toString(arr));
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int next = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    next = arr[j];
                    break;
                }
            }
            result[i] = next;
        }
        System.out.println(Arrays.toString(result));
    }

    static void pairSum(int[] arr, int x){

        int l=0,r=arr.length-1;
        while(l<r){

        }

    }

    public static void main(String[] args) {
        //NextGreatestInteger(new int[] {4,5,8,2,4,0,1});
        pairSum(new int[] {4,5,8,2,4,0,1}, 4);
        String string = "acac";
        int num = 4;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length() ;i++) {
        if(i+num<string.length()+1) {
            String sub = string.substring(i, i + num);

            long l = Stream.of(sub)
                    .map(w -> w.split(""))
                    .flatMap(Arrays::stream)
                    .distinct().count();
            if(l==num-1 && !list.contains(sub)){
                list.add(sub);

            }

        }
        }




    }
}
