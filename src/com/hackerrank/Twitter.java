package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Twitter {

    static void missingWords(String s, String t){

        String[] sArr = s.split(" ");
        String[] tArr = t.split(" ");
        List<String> list = new ArrayList<>();
        System.out.println(s+t);
        Map<String,Integer> map = new HashMap<>();
        int c = 0;
        for(String string: sArr){
            list.add(string);
            map.put(string,c);
            c++;

        }

        for(int i=1;i<tArr.length;i++){
            //System.out.println(tArr[i-1]);
            System.out.println(tArr[i]);
            if(map.get(tArr[i-1])>map.get(tArr[i])) {
                list.remove(tArr[i - 1]);
            }
        }

        System.out.println(list);
    }

    static String election(String[] stringArr){

        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<stringArr.length;i++) {
            if (!map.containsKey(stringArr[i])) {
                map.put(stringArr[i], 1);
            } else {
                map.put(stringArr[i], map.get(stringArr[i]) + 1);
            }
        }
            int max = 0; String key = "";
            System.out.println(key);
          //linkedlist<Map.Entry<String,Integer>> s = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
          //Collections.reverse(s);

            for(Map.Entry<String,Integer> entry:map.entrySet()){
                if(entry.getValue()>=max){
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
        System.out.println(key);
        return key ;

    }

    public static List<Integer> primeQuery(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {
        List<Integer> output = new ArrayList<Integer>();
        List<List<Integer>> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        //linkedlist<Integer> v=new ArrayList<>();
        HashMap<Integer,Integer> v=new HashMap<>();
        for (int i = 0; i <= values.size(); i++) {
            list1.add(new ArrayList<>());
            list2.add(new ArrayList<>());

        }

        for (int i = 0; i < first.size(); i++) {

            list1.get(first.get(i)).add(second.get(i));
            list2.get(second.get(i)).add(first.get(i));
        }

        v.put(1,1);
        recur(list1,1,list2,v);
        for (int i = 0; i < queries.size(); i++)
        {   int count=0;
            int b=queries.get(i);
            if(isPrime(values.get(b-1))) count=1;
            for (int j = 0; j <list2.get(b).size(); j++) {
                int a=list2.get(b).get(j);

                if(a!=-1 && isPrime(values.get(a-1))){
                    count++;
                }
            }
            output.add(count);
        }
        return  output;
    }
    public static List<Integer> recur(List<List<Integer>> ll,int index,List<List<Integer>> dpl,HashMap<Integer,Integer> v){

        if(!dpl.get(index).isEmpty()) return dpl.get(index);

        if(ll.get(index).size()==1 && v.containsKey(ll.get(index).get(0))){
            dpl.get(index).add(-1);
            List<Integer> l=new ArrayList<>();
            l.add(index);
            return l;
        }

        else{
            for (int i = 0; i < ll.get(index).size(); i++) {
                int a=ll.get(index).get(i);
                if(!v.containsKey(a)){
                    v.put(a,a);
                    List<Integer> l=recur(ll,a,dpl,v);
                    dpl.get(index).addAll(l);
                }
            }
        }

        List<Integer> l1=new ArrayList<>();
        l1.add(index);
        l1.addAll(dpl.get(index));
        return l1;

    }

    public static boolean isPrime(int b) {
        if(b==1) return false;
        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "hackerrank";//-1,7,5,-1
        String string2 = "aaaa";// 1012 // sam - [1] -1
        List<Integer> indexList = new ArrayList<>();
        indexList.add(4);
        indexList.add(1);
        indexList.add(6);
        indexList.add(8);
        int[] arr2 = {0,1,2,3};
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<indexList.size();i++){
            int l = 0, r = string.length();
            StringBuilder sb = new StringBuilder();
            sb.append(string.substring(0,indexList.get(i)));
            sb.reverse();
            String s1 = sb.toString();
            String s2 = string.substring(indexList.get(i)+1);
            System.out.println(s1);
            System.out.println(s2);

            String s = Character.toString(string.charAt(indexList.get(i)));
            if(!s1.contains(s) && !s2.contains(s)){
                result.add(-1);
            }
            else {
                int val = 0;

                for (int j=0;j<(s1+s2).length();j++) {

                    if (j<s1.length() && s1.charAt(j) == string.charAt(indexList.get(i))) {
                        val = s1.length() - j - 1;
                        result.add(val);
                        break;
                    }
                    if (j<s2.length() && s2.charAt(j) == string.charAt(indexList.get(i))) {
                        val = val = s1.length() + j + 1;
                        result.add(val);
                        break;
                    }
                 }
                }

            }
        System.out.println(result);
    }


}
