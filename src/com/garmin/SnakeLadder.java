package com.garmin;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadder {
    static class QueueEntry{
        int vertex;
        int distance;
    }
    public static int getMinDiceThrows(int[] moves, int N){
        QueueEntry queueEntry = new QueueEntry();
        queueEntry.distance = 0;
        queueEntry.vertex = 0;
        Queue<QueueEntry> queue = new LinkedList<>();
        boolean[] visited = new boolean[N];
        visited[0] = true;
        queue.add(queueEntry);

        while (!queue.isEmpty()){
            queueEntry  = queue.poll();
            int vertex = queueEntry.vertex;
            if(vertex == N - 1) break;

            for(int j = vertex + 1; j <= (vertex + 6) && j < N; j++){
                if(!visited[j]){
                    QueueEntry newQueueEntry = new QueueEntry();
                    newQueueEntry.distance = queueEntry.distance + 1;
                    visited[j] = true;

                    if(moves[j] != -1){
                        newQueueEntry.vertex = moves[j];
                    }else{
                        newQueueEntry.vertex = j;
                    }
                    queue.add(newQueueEntry);
                }
            }

        }


        return queueEntry.distance;

    }

    public static void main(String[] args) {
        int N = 30;
        int[] moves = new int[N];
        for(int i = 0; i < N; i++){
            moves[i] = -1;
        }
        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        System.out.println("Min Dice throws required is " +
                getMinDiceThrows(moves, N));
    }
}
