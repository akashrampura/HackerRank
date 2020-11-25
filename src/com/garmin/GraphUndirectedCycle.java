package com.garmin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GraphUndirectedCycle {
    static class Graph{
        private int vertex;
        private List<List<Integer>> edges;
        Graph(int vertex){
            this.vertex = vertex;
            this.edges = new ArrayList<>();
            for(int i = 0; i < this.vertex; i++){
                edges.add(new ArrayList<>());
            }
        }
        public void addEdge(int v, int w){
            this.edges.get(v).add(w);
        }
        public boolean isCyclic(){
            boolean[] visited = new boolean[this.vertex];
            for(int i = 0; i < this.vertex; i++){
                if(!visited[i]){
                    if(isCyclicUtil(i, visited, -1)){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean isCyclicUtil(int vertex, boolean[] visited, int parent){
            visited[vertex] = true;

            Iterator<Integer> iterator = this.edges.get(vertex).listIterator();
            while (iterator.hasNext()){
                int next = iterator.next();
                if(!visited[next]){
                    if(isCyclicUtil(next, visited, vertex)){
                        return true;
                    }
                }else if(next != parent){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a graph given in the above diagram
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");

        Graph g2 = new Graph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}

