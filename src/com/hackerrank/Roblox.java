package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Roblox {

 public static void socialGraphs(List<Integer> counts) {
                    HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
                    List<Integer> order = new ArrayList<>();

                    for (int i = 0; i < counts.size(); i++) {
                        List<List<Integer>> old = map.getOrDefault(counts.get(i), new ArrayList<List<Integer>>());
                        int listSize = old.size();
                        if (listSize == 0) {
                            old.add(new ArrayList<>());
                            listSize = 1;
                            order.add(counts.get(i));
                        }
                        if (old.get(listSize - 1).size() == counts.get(i)) {
                            old.add(new ArrayList<>());
                            order.add(counts.get(i));
                        }
                        listSize = old.size();
                        old.get(listSize - 1).add(i);
                        map.put(counts.get(i), old);
                    }

                    for (int i = 0; i < order.size(); i++) {
                        List<List<Integer>> old = map.getOrDefault(order.get(i), new ArrayList<List<Integer>>());
                        List<Integer> print = old.remove(0);
                        for (int p : print) {
                            System.out.print(p + " ");
                        }
                        System.out.println();
                        map.put(order.get(i), old);
                    }
                }



    public static void main(String[] args) {
    //
        String mx = "";
        String str = "";
        for (int i = 0; i < str.length(); ++i) {
            if (mx.compareTo(str.substring(i)) <= 0) {
                mx = str.substring(i);
            }
        }
        // 2
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        HashMap<String,Integer> hm = new HashMap<>();
        int max = 0;
        char c;
        /*String str;
        int count;
        for(int i = 0; i< s.length(); i++ ){
            sb = new StringBuilder();
            hs = new HashSet<>();
            for(int j = i; j < i + minLength-1 && j <s.length();j++){
                c = s.charAt(j);
                sb.append(""+c);
                hs.add(c);
            }
            for(int j = i+minLength-1; j<= i+maxLength && j < s.length(); j++){
                c = s.charAt(j);
                sb.append(""+c);
                hs.add(c);
                if(hs.size() <=maxUnique){
                    str = ""+sb;
                    if(hm.containsKey(str)){
                        count = hm.get(str)+1;
                        if(count > max){
                            max = count;
                        }
                        hm.put(str,count);
                    }
                    else{
                        if(max == 0) max = 1;
                        hm.put(str,1);
                    }
                }
            }
        }
*/


    }
}
