package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bridges {

    private int V; // no. of vertices
    private LinkedList<Integer>[] adj;
    int time = 0;
    static final int NIL = -1;

    Bridges(int v){
        V = v;
        adj = new  LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    void bridgeUtil(int i, boolean[] visited, int[] disc, int[] low, int[] parent){
        visited[i] = true;
        disc[i] = low[i] = time++;
       Iterator<Integer> iterator =  adj[i].iterator();
       while(iterator.hasNext()){
           int j = iterator.next();
           if(!visited[j]){
               parent[j] = i;
               bridgeUtil(j,visited,disc,low,parent);

               low[i] = Math.min(low[i],low[j]);
               if(disc[i]<low[j]){
                   System.out.println(i+" "+j);
               }
           }else if(j != parent[i]){
               low[i] = Math.min(disc[j],low[i]);
           }

       }
    }

    void bridge(){
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int parent[] = new int[V];
        for(int i=0; i<V; i++){
            visited[i] = false;
            parent[i] = NIL;
        }
        for(int i=0; i<V; i++){
            if(visited[i]==false){
                bridgeUtil(i,visited,disc,low,parent);
            }
        }


    }

}
