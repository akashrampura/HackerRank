package com.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tulip {

    public static void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void printTable1(int n) {
        int len = ("" + (n * n)).length()+1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.format("%-"+len+"s", i * j + " ");
            }
            System.out.println();
        }
    }

    static final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";

   // private static void nextPage(List<String> movies, int currentPage, String substr) throws Exception {
     //   String response = getResponse(url + substr + "&page=" + currentPage);
        //JsonObject details = new JsonParser().parse(response).getAsJsonObject();
       // JsonArray jsonArray = details.get("data").getAsJsonArray();
       // for (JsonElement each : jsonArray) {
       //     movies.add(each.getAsJsonObject().get("Title").getAsString());
      //  }
    //}

    private static String getResponse(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        HttpURLConnection conn = (HttpURLConnection) new URL(urlToRead).openConnection();
        ((HttpURLConnection) conn).setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result + "";
    }

    private static String[] getMovieTitles(String substr) {
        List<String> movies = new ArrayList<>();
        try {
            //JsonElement totalPages = new JsonParser().parse(getResponse(url + substr)).getAsJsonObject().get("total_pages");
            int currentPage = 0;
            //while (currentPage++ < Integer.parseInt(totalPages.toString())) {
                //nextPage(movies, currentPage, substr);
            //}
            Collections.sort(movies);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies.toArray(new String[movies.size()]);
    }

    public static void main(String[] args) {
        Tulip.printTable1(11);
    }
}
