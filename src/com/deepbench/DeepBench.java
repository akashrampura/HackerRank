package com.deepbench;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public strictfp class DeepBench   {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(28);
        list.add(list.size(),56);
        System.out.println(list);
        Random random = new Random();
        System.out.println(random.nextInt(10));
        int[] arr = {1,2,3};
        int[] o = arr.clone();
        arr[0] = 0;
        System.out.println(Arrays.toString(o));
    }


}
