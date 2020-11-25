package com.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

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
            Stack<Integer> stack = new Stack<>();

            boolean[] visited = new boolean[this.V];
            System.out.println(Arrays.toString(visited));
            for(int i=0; i<this.V; i++){
                if(!visited[i]){
                    topologicalSortUtil(i, visited, stack);
                }
            }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    void topologicalSortUtil(int s, boolean[] visited, Stack<Integer> stack){
            visited[s] = true;
            List<Integer> children = this.adj[s];
            for(Integer child : children){
                if(!visited[child]){
                    topologicalSortUtil(child, visited, stack);
                }
            }
            stack.push(s);
        }
    }

    public static void main(String[] args) {
        // Create a graph given in the above diagram
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological " +
                "sort of the given graph");
        g.topologicalSort();
    }
}
