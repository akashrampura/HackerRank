package com.graphs;

import java.util.*;

public class TopologicalSortKahns {
    static class Graph{
        private int V;
        private List<Integer>[] adj;
        Graph(int v){
            this.V = v;
            this.adj = new LinkedList[v];
            for(int i=0; i<v; i++){
                this.adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w){
            this.adj[v].add(w);
        }

        void topologicalSort(){

            int[] indegree = new int[this.V];
            for(int i=0; i<this.V; i++){
                for(Integer in : this.adj[i]){
                    indegree[in]++;
                }
            }
            System.out.println("Indegree: "+ Arrays.toString(indegree));
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0; i<this.V; i++){
                if(indegree[i] == 0){
                    queue.add(i);
                }
            }
            int count = 0;
            List<Integer> result = new ArrayList<>();
            while (!queue.isEmpty()){
                int child = queue.poll();
                result.add(child);
                System.out.println("Queue e: "+child);
                for(Integer c : this.adj[child]){
                    System.out.println("child: "+c);
                    if(--indegree[c] == 0){
                        queue.add(c);
                    }
                }
            }
            System.out.println("Result: "+result);
        }
    }

    public static void main(String[] args) {

        // Create a graph given in the above diagram
        Graph g=new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println("Following is a Topological Sort");
        g.topologicalSort();
        System.out.println(9%2);
    }
}
