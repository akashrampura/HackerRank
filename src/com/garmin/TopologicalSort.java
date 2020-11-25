package com.garmin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    static class Graph{
        private int vertex;
        private List<List<Integer>> edges;
        Graph(int v){
            vertex = v;
            edges = new ArrayList<>();
            for(int i = 0; i < v; i++){
                edges.add(new ArrayList<>());
            }
        }
        public void addEdge(int v, int w){
            edges.get(v).add(w);
        }
        public List<Integer> topologicalSort(){
            List<Integer> result = new ArrayList<>();
            boolean[] visited = new boolean[vertex];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < vertex; i++){
                if(!visited[i]){
                    topologicalSortUtil(i, visited, stack);
                }
            }
            while (!stack.isEmpty()){
                result.add(stack.pop());
            }
            System.out.println(result);
            return result;
        }
        public void topologicalSortUtil(int vertex, boolean[] visited, Stack<Integer> stack){
            visited[vertex] = true;
            Iterator<Integer> iterator = edges.get(vertex).listIterator();
            while (iterator.hasNext()){
                int next = iterator.next();
                if(!visited[next]){
                    topologicalSortUtil(next, visited, stack);
                }
            }
            stack.add(vertex);
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
