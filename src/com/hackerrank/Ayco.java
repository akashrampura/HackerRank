package com.hackerrank;

import java.util.*;

public class Ayco {

    public static int play1(List<List<Integer>>  list){
        for(int i=0; i<list.get(0).size();i++){
            for(int j=0; j<list.size();j++){
                System.out.println(list.get(j).get(i));
            }
        }
        System.out.println(list);

        return 0;
    }
    public static int play(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        if(n == 0 ) return 0;
        int m = arr.get(0).size();
        if(m == 0)  return 0;
        int[] colMax = new int[m];
        Arrays.fill(colMax, Integer.MIN_VALUE);

        int total = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr.get(j).get(i) > colMax[i]){
                    colMax[i] = arr.get(j).get(i);
                }
            }
            total += colMax[i];
        }

        Arrays.sort(colMax);
        int tomScore = 0;

        for(int i = m - 1; i >= 0; i-= 2){
            tomScore += colMax[i];
        }
        return (2* tomScore-total);


    }
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
        List<Integer> l1 = new ArrayList<>(Arrays.asList(3,7,5,3,4,5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(4,5,2,6,5,4));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(7,4,9,7,8,3));

        List<List<Integer>> list = new ArrayList(Arrays.asList(l1,l2,l3));
        play(list);

    }
}
