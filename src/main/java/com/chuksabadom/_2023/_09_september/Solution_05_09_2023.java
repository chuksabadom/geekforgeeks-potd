package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
import java.util.List;

public class Solution_05_09_2023 {
    public List<List<Integer>> printGraph(int V, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0; i<V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int[][] edges = {{0,1},{0,4},{4,1},{4,3},{1,3},{1,2},{3,2}};

        List<List<Integer>> adjacencyList = new Solution_05_09_2023().printGraph(V, edges);

        // Print the adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print("Adjacency list of vertex " + i + ": ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
