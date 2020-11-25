package com.arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
        int totalCost = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<costs.length; i++){
            totalCost += costs[i][0];
            heap.add(costs[i][1]-costs[i][0]);
            if(heap.size()>n) totalCost += heap.remove();
        }
        return totalCost;
    }
    public String removeDuplicates(String S) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : S.toCharArray()) {
            if (!dq.isEmpty() && dq.peekLast() == c) {
                dq.pollLast();
            }else {
                dq.offer(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : dq) { sb.append(c); }
        return sb.toString();
    }
}
