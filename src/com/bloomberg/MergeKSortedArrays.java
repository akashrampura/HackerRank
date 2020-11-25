package com.bloomberg;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedArrays {
    static class QueueNode implements Comparable<QueueNode>{
        int array;
        int index;
        int value;
        QueueNode(int array, int index, int value){
            this.array = array;
            this.index = index;
            this.value = value;
        }
        @Override
        public int compareTo(QueueNode n){
            if(this.value < n.value) return -1;
            if(this.value > n.value) return 1;
            return 0;
        }
    }
    public static int[] mergeKSortedArray(int[][] arrLists){
        int size = 0;
        PriorityQueue<QueueNode> pq = new PriorityQueue<>();
        for(int i = 0; i < arrLists.length; i++){
            if(arrLists[i].length > 0){
                pq.add(new QueueNode(i, 0, arrLists[i][0]));
            }
            size += arrLists[i].length;
        }
        int[] res = new int[size];

        for(int i = 0; !pq.isEmpty(); i++){
            QueueNode n = pq.poll();
            res[i] = n.value;
            int nextIndex = n.index + 1;
            if(nextIndex < arrLists[n.array].length){
                pq.add(new QueueNode(n.array, nextIndex, arrLists[n.array][nextIndex]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int[] arr3 = { 0, 9, 10, 11 };

        int[] result = mergeKSortedArray(new int[][] { arr1, arr2, arr3 });
        System.out.println(Arrays.toString(result));
        String s = "index/jdj/";
        System.out.println(s.indexOf("/",6));

    }
}
