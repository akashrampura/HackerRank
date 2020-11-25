package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Accestry2 {

    public static int getmin(List<Integer> num, int k) {
        int sum = 0;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < num.size(); i++) {
            int key = num.get(i);
            int count = 1;
            sum += key;
            if (tm.containsKey(key)) {
                count = tm.get(key);
            }
            tm.put(num.get(i), count);
        }
        for (int i = 0; i < k; i++) {
            int max = tm.lastKey();
            int count = tm.get(max);
            int half = (int) Math.ceil(max / 2f);
            sum -= (max - half);
            if (tm.containsKey(half)) {
                tm.put(half, tm.get(half) + 1);
            } else {
                tm.put(half, 1);
            }
            if (count > 1) {
                tm.put(max, count - 1);
            } else {
                tm.remove(max);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(90);
        list.add(100);
        list.add(20);
        list.add(7);
        System.out.println(getmin(list, 8));

//        B b = new B();
//        System.out.println(b instanceof B);
//        System.out.println((b instanceof B) &&  !(b instanceof A));
//        System.out.println((b instanceof B) &&  !(b instanceof C));
    }
}



