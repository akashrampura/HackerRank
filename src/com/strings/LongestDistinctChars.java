package com.strings;

import java.util.*;

public class LongestDistinctChars {
    public static void main(String[] args) {
            String s = "geeksforgeeks";
            Queue<Character> queue = new LinkedList<>();
            int res = 0;
            for (char c : s.toCharArray()) {
                while (queue.contains(c)) {

                    queue.poll();
                }
                queue.offer(c);
                System.out.println(queue);
                res = Math.max(res, queue.size());
            }
            System.out.println(res);
        }

}
