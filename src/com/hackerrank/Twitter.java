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
          //list<Map.Entry<String,Integer>> s = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
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
        //list<Integer> v=new ArrayList<>();
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
       // String s = "I am using HackerRank to improve programming";
        //String t = "HackerRank am to improve";
       // missingWords(s,t);
        String[] sArr = {"b","b","a","a"};
        //election(sArr);
        String s = "I am using hackerRank to improve programming I am";
        String t = "am I";
        int k =0;
        String[] sent=s.split(" ");
        String[] subsent=t.split(" ");;
        List<String> missing=new LinkedList<>();
        for(int i=0;i<sent.length;i++){
            missing.add(sent[i]);
        }
        for(int i=0;i<subsent.length;i++){

            for(int j=k;j<missing.size();j++)
            {
                if(missing.get(j).equals(subsent[i]))
                {
                    missing.remove(j);
                    k=j;
                    break;
                }

            }
        }
        for(int i = 0; i<missing.size(); i++) {
            System.out.println(missing.get(i));
        }
    }


}
