package com.garmin;

import java.util.*;

public class Graph {
    private int vertex;
    private LinkedList<Integer> adj[];
    Graph(int vertex){
        this.vertex = vertex;
        this.adj = new LinkedList[vertex];
        for(int i = 0; i < this.vertex; i++){
            this.adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination){
        adj[source].add(destination);
    }
    public void DFS(int vertex){
        boolean[] visited = new boolean[this.vertex];
        List<Integer> result = new ArrayList<>();
        DFSUtil(visited, vertex, result);
        System.out.println(result);
    }
    public void DFSUtil(boolean[] visited, int vertex, List<Integer> result){
        visited[vertex] = true;
        result.add(vertex);
        Iterator<Integer> iterator = adj[vertex].listIterator();
        while (iterator.hasNext()){
            int next = iterator.next();
            if(!visited[next]){
                DFSUtil(visited, next, result);
            }
        }
    }

    public void BFS(int vertex){
        boolean[] visited = new boolean[this.vertex];
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = true;
        while (!queue.isEmpty()){
            int p = queue.poll();
            result.add(p);
            Iterator<Integer> iterator = this.adj[p].listIterator();
            while (iterator.hasNext()){
                int next = iterator.next();
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        System.out.println(result);
    }



    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        //g.DFS(2);
        g.BFS(0);
    }

}
