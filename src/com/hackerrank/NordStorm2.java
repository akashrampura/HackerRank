package com.hackerrank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class NordStorm2 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        StringBuilder sb = new StringBuilder();
        String head = in.readLine();
        int idIndex = 0;
        String checkID[] = head.split(",");
        for (int i = 0; i < checkID.length; i++) {
            if (checkID[i].equals("ID")) {
                idIndex = i;
                break;
            }
        }
        System.out.println(head);

        TreeMap<Integer, String> map = new TreeMap<>();

        while ((line = in.readLine()) != null) {
            if (!line.equals("") && !line.equals(head)) {
                String data[] = line.split(",");
                map.put(Integer.parseInt(line.split(",")[idIndex]), line);
            }
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

    }

}
