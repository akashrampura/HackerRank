package com.garmin;

import java.util.ArrayList;
import java.util.List;

public class GraphDirectedCycle {
    static class Graph{
        private int vertex;
        private List<List<Integer>> adj;

        Graph(int vertex){
            this.vertex = vertex;
            this.adj = new ArrayList<>();
            for(int i = 0; i < this.vertex; i++){
                this.adj.add(new ArrayList<>());
            }
        }
        public void addEdge(int s, int d){
            this.adj.get(s).add(d);
        }
        public boolean isCyclic(){
            boolean[] visited = new boolean[this.vertex];
            boolean[] recStack = new boolean[this.vertex];

            for(int i = 0; i < this.vertex; i++){
                if(isCyclicUtil(i, visited, recStack)){
                    return true;
                }
            }
            return false;
        }
        public boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] recStack){
            if(recStack[vertex]) return true;
            if(visited[vertex]) return false;
            visited[vertex] = true;
            recStack[vertex] = true;
            List<Integer> children = this.adj.get(vertex);
            for(Integer child : children){
                if(isCyclicUtil(child, visited, recStack)) return true;
            }
            recStack[vertex] = false;
            return false;
        }

    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");
    }
}

