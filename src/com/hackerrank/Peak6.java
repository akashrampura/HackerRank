package com.hackerrank;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Peak6 {

    /*
    */

    public static int  kangroo(List<String> list, int score, Boolean isSynonym){
        Set<String> set = new HashSet<>();
        for (String syn : list) {
            System.out.println(syn);
            String[] synArr = syn.split(":");
            String word = synArr[0];
            String[] syns = synArr[1].split(",");
            for (String synonym : syns) {
                int j = 0;
                int[] indeces = new int[2];
                for (int i = 0; i < word.length() && j < synonym.length(); i++) {
                    if (synonym.charAt(j) == word.charAt(i)) {
                        if (j == 0) {
                            indeces[0] = i;
                        }
                        if (j == synonym.length() - 1) {
                            indeces[1] = word.lastIndexOf(word.charAt(i));
                        }
                        j++;
                    }
                }
                int len = indeces[1] - indeces[0] + 1;
                System.out.println(j == synonym.length() && len != synonym.length());
                if (j == synonym.length() && len != synonym.length()) {
                    if(isSynonym){
                        score++;
                    }else{
                        score--;
                    }

                    if (!set.contains(synonym)) {
                        set.add(synonym);
                    } else {
                        score++;
                    }
                }
                System.out.println(Arrays.toString(indeces));
            }
        }
        return score;
    }

    public static void k() {
        List<String> words = new ArrayList(Arrays.asList("illuminated",
                "animosity", "deoxyribonucleic", "container", "lit", "amity", "encourage", "lighted"));
        List<String> wordsToSynonyms = new ArrayList(Arrays.asList("encourage:urge,boost,inspire",
                "container:tin,can,bag,bottle", "lighted:lit", "illuminated:lit"));
        List<String> wordsToAntonyms = new ArrayList(Arrays.asList("encourage:discourage", "animosity:amity,like",
                "lighted:dark"));
        int score = 0;
        score = Peak6.kangroo(wordsToSynonyms,score,true);
        score = Peak6.kangroo(wordsToAntonyms,score,false);
        System.out.println(score);
    }

    public static void flights() {
        List<Integer> land = new ArrayList(Arrays.asList(650, 645, 730, 1100));
        List<Integer> takeOff = new ArrayList(Arrays.asList(700, 845, 1015, 1130));
        int maxWait = 58;
        int initial = 1;
        int gates = initial;
        int i = 0, j = 0;
        int result = 1;
        while (i < land.size() && j < takeOff.size()) {
            Integer landAndWaitMinutes = Peak6.toMinutes(land.get(i)) + maxWait;
            Integer landAndWaitHours = Peak6.toHours(landAndWaitMinutes);
            System.out.println(land.get(i) + "landAndWaitHours: " + landAndWaitHours + " to " + takeOff.get(j));
            if (landAndWaitHours <= takeOff.get(j)) { //land.get(i)<=takeOff.get(j) &&
                i++;
                gates++;
            } else {
                gates--;
                j++;
            }
            if (gates > result) {
                result = gates;
            }
            System.out.println("gates " + gates);
        }
        System.out.println(result);
    }

    public static Integer toHours(int minutes) {
        int m = minutes % 60;
        int h = minutes / 60;
        if (m != 0) {
            String t = "";
            String mS = String.valueOf(m);
            if (mS.length() == 1) {
                t = h + "0" + m;
            } else {
                t = h + "" + m;
            }

            int time = Integer.parseInt(t);
            return time;
        } else {
            String t = h + "" + 0 + "" + 0;
            int time = Integer.parseInt(t);
            return time;
        }
    }

    public static Integer toMinutes(int hours) {
        String s = String.valueOf(hours);
        String m = s.substring(s.length() - 2);
        String h = s.replace(m, "");
        return Integer.parseInt(h) * 60 + Integer.parseInt(m);
    }

    public static void main(String[] args) {
        Peak6.flights();
        //Peak6.k();

    }
}
