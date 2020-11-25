package com.hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ArrowStreet {

    public static Boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] charCount = new int[26];
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static List<String> funWithAnagrams(List<String> s) {
        Set<Integer> idexToRemove = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = i + 1; j <s.size(); j++) {
                if (isAnagram(s.get(i), s.get(j))) {
                    idexToRemove.add(j);
                }
            }
        }
        //System.out.println(idexToRemove);
        for(int i =0; i < s.size(); i++){
            if(!idexToRemove.contains(i)){
                result.add(s.get(i));
            }
        }
        Collections.sort(result);
        //System.out.println(result);
        return result;

    }
    public static int shortestSubstring(String s) {
        if (s.length() == 0 ) {
            return 0;
        }

        Map<Character, Integer> dictT = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            dictT.put(s.charAt(i), 1);
        }


        int required = dictT.size();

        int l = 0, r = 0;

        int formed = 0;

        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return ans[0] == -1 ? 0 : s.substring(ans[1], ans[2] + 1).length();

    }
    public static List<Integer> subsetA(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr,Collections.reverseOrder());
        long sum = 0;
        for(int i =0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        List<Integer> out = new ArrayList<>();
        sum = sum/2;
        long secSum = 0;
        for(int i =0; i< arr.size(); i++){

            if(secSum <= sum){
                secSum += arr.get(i);
                out.add(arr.get(i));
            }
            else{
                break;
            }
        }
        Collections.sort(out);
        return out;
    }
    public static List<String> sortDates(List<String> dates) {
        // Write your code here
        // Sort list according to date.
        dates.sort(new Comparator<String>() {
            DateFormat df = new SimpleDateFormat("dd MMM yyyy");
            @Override
            public int compare(String s1, String s2) {
                try {
                    Date d1 = df.parse(s1.split("-")[0].trim());
                    Date d2 = df.parse(s2.split("-")[0].trim());
                    return d1.compareTo(d2);
                } catch (ParseException pe) {
                    System.out.println("erro: " + pe);
                    return 0;
                }
            }
        });

        return dates;
    }
    public static int countMeetings(List<Integer> arrival, List<Integer> departure) {
        // Write your code here
        if(arrival == null || departure == null || arrival.size() == 0 || departure.size() == 0)
            return 0;

        List<Pair> list = new ArrayList<>();
        for(int i=0; i<arrival.size(); i++) {
            list.add(new Pair(arrival.get(i), departure.get(i)));
        }

        Collections.sort(list, (a, b) -> {
            if(a.end < b.end)
                return -1;
            else if(a.end > b.end)
                return 1;
            else {
                return Integer.compare(a.start, b.start);
            }
        });

        Set<Integer> set = new HashSet<>();
        set.add(list.get(0).start);
        int day = list.get(0).start;
        for(int i=1; i<list.size(); i++) {
            if(list.get(i).end > day) {
                day = insertInSet(list.get(i), set);
                if(day != -1) {
                    set.add(day);
                }
            }
        }
        return set.size();
    }
    public static int insertInSet(Pair interval, Set<Integer> set) {
        int st = interval.start;
        while(st <= interval.end) {
            if(!set.contains(st)) {
                return st;
            }
            st++;
        }
        return -1;
    }

}

class Pair {
    int start;
    int end;

    public Pair(int i, int j) {
        this.start = i;
        this.end = j;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList(Arrays.asList("poke","pkoe","okpe","ekop"));
        List<String> list2 = new ArrayList(Arrays.asList("code","aaagmnrs","anagrams","doce"));
        //funWithAnagrams(list2);

    }
}
