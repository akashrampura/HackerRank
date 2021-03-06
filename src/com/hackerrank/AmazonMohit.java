package com.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AmazonMohit {

    static class PairInt{
        int first;
        int second;
        PairInt(){

        }
        PairInt(int first, int second){
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "PairInt{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    class Graph{
        int V;
        LinkedList<Integer>[] adj;
        int time = 0;
        static final int NIL = -1;
        Graph(int v){
            this.V = v;
            this.adj = new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i] = new LinkedList<>();
            }

        }

        void addEdge(int v, int w){
            adj[v].add(w);
            adj[w].add(v);
        }

        List<PairInt> bridgeUtil( List<PairInt> result, int u, boolean[] visited, int[] disc, int[] low, int[] parent){
            visited[u] = true;
            disc[u] = low[u] = time++;
            Iterator<Integer> i = adj[u].listIterator();
            while(i.hasNext()){
                int v = i.next();
                if(!visited[v]){
                    parent[v] = u;
                    bridgeUtil(result, v,visited,disc,low,parent);
                    low[u] = Math.min(low[u],low[v]);
                    if(disc[u]<low[v]){
                        PairInt pairInt = new PairInt(u,v);
                        result.add(pairInt);
                    }
                }else if(v != parent[u]){
                    low[u] = Math.min(disc[v],low[u]);

                }
            }
            return result;
        }

        List<PairInt> bridge(){
            List<PairInt> result = new ArrayList<>();
            boolean[] visited = new boolean[V];
            int[] disc = new int[V];
            int[] low = new int[V];
            int[] parent = new int[V];
            for(int i=0;i<V;i++){
                visited[i] = false;
                parent[i] = NIL;
            }
            for(int i=0;i<V;i++){
                if(!visited[i]){
                   result = bridgeUtil(result, i,visited,disc,low,parent);
                }
            }


            return result;

        }

    }

    List<PairInt> criticalConnection(int numOfWarehouses, int numOfRoads, List<PairInt> roads){
        List<PairInt> result = new ArrayList<>();
        Graph graph = new Graph(numOfWarehouses+1);
        for(PairInt pairInt: roads){
            graph.addEdge(pairInt.first,pairInt.second);
        }
        result = graph.bridge();
        System.out.println(result);

        return  result;


    }

    public static void main(String[] args) {
        List<PairInt> roads = new ArrayList<>();
        PairInt p1 = new PairInt(1,2);
        PairInt p2 = new PairInt(1,3);
        PairInt p3 = new PairInt(3,4);
        PairInt p4 = new PairInt(1,4);
        PairInt p5 = new PairInt(4,5);
        roads.add(p1);
        roads.add(p2);
        roads.add(p3);
        roads.add(p4);
        roads.add(p5);
        new AmazonMohit().criticalConnection(5,5,roads);

    }


}
