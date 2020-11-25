package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Goldman {

    public static List<String> sfwp(List<Integer> dailyPrice){
        List<String> result = new ArrayList<>();

        float window = 7;
        for(int i=0;i<dailyPrice.size()-window+1;i++){
            float sum = 0;
            for(int j=0; j<window;j++){
                sum += dailyPrice.get(i+j);
                System.out.println(i+j);
            }
            double avg = sum/window;
            double roundOff = Math.round(avg * 100.0) / 100.0;
            String av = String.valueOf(roundOff);
            if(av.split("\\.")[1].length()==1){
                StringBuilder sb = new StringBuilder(av);
                sb.append("0");
                av = sb.toString();
            }
           // System.out.println(av);
        }

        return result;


    }


        /*
         * Complete the 'gridGame' function below.
         *
         * The function is expected to return a 2D_INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. 2D_INTEGER_ARRAY grid
         *  2. INTEGER k
         *  3. STRING_ARRAY rules
         */

        public static List<List<Integer>> gridGame(List<List<Integer>> grid, int k, List<String> rules) {
            List<Integer> prev = null;
            List<Integer> next = null;

            HashSet<Integer> alive = new HashSet<>();
            int index = 0;
            for(String status: rules){
                if(status.equals("alive")){
                    alive.add(index);
                }
                index++;
            }

            while(k > 0){
                List<List<Integer>> tempOuter = new ArrayList<>();
                for(int i = 0; i < grid.size(); i++){
                    List<Integer> newList = new ArrayList<>();
                    List<Integer> cur = grid.get(i);
                    if( (i + 1) < grid.size()){
                        next = grid.get(i+1);
                    }
                    for(int j = 0; j < cur.size(); j++){
                        int total = 0;
                        if(prev != null){
                            total += totalAlive(prev, j, true);
                        }
                        total += totalAlive(cur, j, false);
                        if(next != null){
                            total += totalAlive(next, j, true);
                        }
                        if(alive.contains(total)){
                            newList.add(1);
                        }else{
                            newList.add(0);
                        }
                    }
                    prev = cur;
                    next = null;
                    tempOuter.add(newList);
                }
                prev = null;
                k--;
                grid = tempOuter;
            }
            return grid;
        }

        public static int totalAlive(List<Integer> list, int j, boolean use){
            int total = 0;
            if(j - 1 >= 0){
                total += list.get(j - 1);
            }
            if(use){
                total += list.get(j);
            }
            if((j + 1) < list.size()){
                total += list.get(j + 1);
            }
            return total;
        }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,7,7,7,7,7,7,7));
        sfwp(list);
    }
}
