package com.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LongestDistinctChars {
    public static void main(String[] args) {
            String s = "geeksforgeeks";
            Queue<Character> queue = new LinkedList<>();
            List<Character> list = new LinkedList<>();
            int res = 0;
            for (char c : s.toCharArray()) {
                while (queue.contains(c)) {
                    //System.out.println(queue);
                    queue.poll();
                }
                queue.offer(c);
                res = Math.max(res, queue.size());
            }
            System.out.println(res);
        }

}
