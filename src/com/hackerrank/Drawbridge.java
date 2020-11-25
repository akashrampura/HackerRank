package com.hackerrank;

import java.util.*;

public class Drawbridge {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(12);
        int seg = 5;
        List<Integer> newList = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
            System.out.println("before: "+i);
            if (newList.size() == seg) {

                list2.add(newList);
                list3.add(Collections.min(newList));
                newList = new ArrayList<>();
                i = i+1-seg;
                if(i==list.size()-seg){
                    break;
                }
                System.out.println(i);
            }
        }
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(Collections.max(list3));

    }
}
