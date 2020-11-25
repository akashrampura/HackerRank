package com.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Garmin {

    public static void main(String[] args) {
        LinkedList<String> team1 = new LinkedList<>();
        team1.add("A");
        team1.add("B");
        team1.add("C");
        team1.add("D");
        LinkedList<String> team2 = new LinkedList<>();
        team2.add("E");
        team2.add("F");
        team2.add("G");
        team2.add("H");

        for(int i = 0; i < 12; i++){
            System.out.println(team1);
            System.out.println(team2);
            if(i % 2 == 0){
                // team 1
                String tier1Team1 = team1.poll();
                // team 2
                String tier1Team2P1 = team2.poll();
                String tier1Team2P2 = team2.poll();
                String tier1Team2P3 = team2.poll();
                String tier1Team2P4 = team2.poll();
               if(i == 0){
                   System.out.println("Tier1: "+tier1Team1+" : "+"Tier2: "+tier1Team2P1+", "+tier1Team2P2+", "+tier1Team2P3+", "+tier1Team2P4);

               }else{
                   System.out.println("Tier1: "+tier1Team1+" : "+"Tier2: "+tier1Team2P1+", "+tier1Team2P2+", "+tier1Team2P3);
               }
                team1.add(tier1Team1);
                team2.add(tier1Team2P1);
                team2.add(tier1Team2P2);
                team2.add(tier1Team2P3);
                team2.add(tier1Team2P4);

            }else{
                // team 1
                String tier1Team1 = team2.poll();
                // team 2
                String tier1Team2P1 = team1.poll();
                String tier1Team2P2 = team1.poll();
                String tier1Team2P3 = team1.poll();
                String tier1Team2P4 = team1.poll();
                System.out.println("Tier1: "+tier1Team1+" :"+"Tier2: "+tier1Team2P1+", "+tier1Team2P2+", "+tier1Team2P3);
                team2.add(tier1Team1);
                team1.add(tier1Team2P1);
                team1.add(tier1Team2P2);
                team1.add(tier1Team2P3);
                team1.add(tier1Team2P4);
            }
        }
    }
}
