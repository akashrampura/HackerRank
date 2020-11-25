package com.garmin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class OrderAlienLang {
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
        public void addEdge(int s, int d){
            edges.get(s).add(d);
        }
        public List<Character> topologicalSort(){
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[vertex];
            for(int i = 0; i < vertex; i++){
                if(!visited[i]){
                    topologicalSortUtil(i, visited, stack);
                }
            }
            List<Character> result = new ArrayList<>();
            while(!stack.isEmpty()){
                result.add((char) (stack.pop() + 'a'));
            }
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
    public static void printOrder(String[] words, int alphabets){
        Graph graph = new Graph(alphabets);
        for(int i = 1; i < words.length; i++){
            String word1 = words[i - 1];
            String word2 = words[i];
            for(int j = 0; j < Math.min(word1.length(), word2.length()); j++){
                char word1Char = word1.charAt(j);
                char word2Char = word2.charAt(j);
                if(word1Char != word2Char){
                    graph.addEdge(word1Char - 'a', word2Char - 'a');
                    break;
                }
            }
        }
        System.out.println(graph.topologicalSort());
    }


    public static void main(String[] args) {
        String[] words = {"baa", "abcd", "abca", "cab", "cad"};
        printOrder(words, 4);
    }
}
