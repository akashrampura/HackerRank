package com.hackerrank;

import java.util.*;

public class AmazonVijay2 {


// To determine the number of hours required, first I'm looping over the grid and adding every

    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumHours(int rows, int columns, List<List<Integer> > grid){
        int notFiles = 0;
        Queue<Point> queue = new LinkedList<>();
        for (int r = 0; r < grid.size(); r++) {
            for (int c = 0; c < grid.get(0).size(); c++) {
                if (grid.get(r).get(c) == 1) {
                    queue.add(new Point(r, c));
                } else {
                    notFiles++;
                }
            }
        }

        if (notFiles == 0) return 0;

        for (int hours = 1; !queue.isEmpty(); hours++) {
            for (int sz = queue.size(); sz > 0; sz--) {
                Point point = queue.poll();

                for (int[] dir : DIRECTIONS) {
                    int r = point.r + dir[0];
                    int c = point.c + dir[1];

                    if (isFilePresent(grid, r, c)) {
                        notFiles--;
                        if (notFiles == 0) return hours;
                        grid.get(r).set(c, 1);
                        queue.add(new Point(r, c));
                    }
                }
            }
        }
        return -1;
    }
    private boolean isFilePresent(List<List<Integer>> grid, int r, int c) {
        return r >= 0 && r < grid.size() &&c >= 0 && c < grid.get(0).size() && grid.get(r).get(c) != 1;
    }

    private static class Point {
        int r, c;
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    // Below algorithm time complexity is O(T + Q) where T = size of toys given, Q = size of quotes. Same for sapce complixety
    // Algorithm
    // First I'm checking for edge cases where empty toys or quotes are given, then return empty result;
    // I have created a toys set and added all the given toys in lower case format (since case-insensitive)
    // Then a map (key = toy, value = toyCount) is created. This map is created by iterating over quotes and I have used StringBuilder to create the word required.
    // After that a minHeap is created using custom comparator. From the minHeap only number of topToys are added.
    // Then the resulting list is populated from the PriorityQueue
    public ArrayList<String> popularNToys(int numToys,
                                          int topToys,
                                          List<String> toys,
                                          int numQuotes,
                                          List<String> quotes) {
        ArrayList<String> result = new ArrayList<>();
        if(numToys == 0 || topToys == 0 || numQuotes == 0 || toys.size() == 0 || quotes.size() == 0){
            return result;
        }
        Map<String, Integer> map = new TreeMap<>();
        HashSet<String> toysSet = new HashSet<>();
        for(String toy : toys){
            toysSet.add(toy.toLowerCase());
        }
        StringBuilder sb = new StringBuilder();
        for(String quote : quotes){
            sb.setLength(0);
            HashSet<String> duplicateWord = new HashSet<>(); // to check duplicate word in same quote
            for(int i = 0; i < quote.length(); i++){
                char c = Character.toLowerCase(quote.charAt(i));
                if(c == ' ' || i == quote.length() - 1){
                    if(i == quote.length() - 1) sb.append(c);
                    String word = ""+sb;
                    if(toysSet.contains(word) && !duplicateWord.contains(word)){
                        map.put(word,map.getOrDefault(word,0)+1);
                        duplicateWord.add(word);
                    }
                    sb.setLength(0);
                }
                else{
                    sb.append(c);
                }
            }
        }
        PriorityQueue<Map.Entry<String,Integer>> pq =
                new PriorityQueue<>((a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue());

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.add(entry);
            if(pq.size() > topToys){
                pq.poll();
            }
        }
        while (!pq.isEmpty()){
            result.add(0,pq.poll().getKey());
        }
        //System.out.println(result);
        return result;

    }
    public static void main(String[] args) {

    }
}
