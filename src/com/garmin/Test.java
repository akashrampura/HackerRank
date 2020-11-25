package com.garmin;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        double a = 3;
        System.out.println(a);
        System.out.println(a == 3);
        Set<Integer> set = new HashSet<>();
        set.add(null);
        System.out.println(set);

    }
}
