package com.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class Ancestry {

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);
            System.out.println(buffer.toString());
            String[] stArr = buffer.toString().split("data");
            //System.out.println(stArr[1].split(":")[1].split(",")[0]);
           //System.out.println(stArr[1]);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    public static void main(String[] args) throws Exception {
        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman";
        readUrl(url);
        String[] sArr = null;
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(15);
        list.add(8);
        int k = 4;
        Collections.sort(list,Collections.reverseOrder());
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        System.out.println(list);

        System.out.println(sum);


    }
}
