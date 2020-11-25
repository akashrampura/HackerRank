package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Quora {

    public static void digitAnagram(){
        int[] a = {25,35,872,228,53,278,872};
        List<String> list = new ArrayList<>();
        for(int num : a){
            char[] cArr = String.valueOf(num).toCharArray();
            Arrays.sort(cArr);
            list.add(new String(cArr));

        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        digitAnagram();
       int[][] arr = new int[][]{{1,4,-2},{-2,3,4},{3,1,3}};
       int[][] res = arr.clone();
        Map<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<arr.length;i++){
           for(int j=0; j<arr[i].length;j++){
               map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
           }
       }

       System.out.println(map);
        List<Map.Entry<Integer,Integer>> l = map.entrySet().stream().sorted((a, b)->a.getValue()==b.getValue()?a.getKey()-b.getKey():a.getValue()-b.getValue()).collect(Collectors.toList());

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->
               a.getValue()==b.getValue()? a.getKey()-b.getKey() :a.getValue()-b.getValue());
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
       }
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> e = pq.poll();
            for(int i=0; i<e.getValue();i++){
                list.add(e.getKey());
            }
        }
        System.out.println(list);


        for(int i=0; i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }
        /*
        [1, 4, -2]
        [-2, 3, 4]
        [3, 1, -2]
        1
        -2 4
        3 3 -2
        1 4
        -2
        * */
        int w = list.size()-1;
        int rowCount = arr.length;
        int columnCount = arr[0].length;
        for (int r = 0; r < rowCount; r++) {
            for (int row = r, col = 0; row >= 0 && col < columnCount; row--, col++) {
                System.out.print(arr[row][col] + " ");
                res[col][row] = list.get(w);
                w--;
            }
            System.out.println();
        }

        for (int c = 1; c < columnCount; c++) {
            for (int row = rowCount-1, col = c; row >= 0 && col < columnCount; row--, col++) {
                System.out.print(arr[row][col] + " ");
                res[col][row] = list.get(w);
                w--;
            }
            System.out.println();
        }

        for(int i=0; i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }
}
