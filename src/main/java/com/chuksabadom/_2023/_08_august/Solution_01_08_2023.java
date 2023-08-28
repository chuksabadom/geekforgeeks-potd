package com.chuksabadom._2023._08_august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_01_08_2023 {

    // Function to return a list containing the DFS traversal of the graph.

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>al=new ArrayList<>();
        boolean[] vis =new boolean[V];
        if(adj==null)return al;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(0,al,vis,adj);
            }
        }
        return al;
    }
    public static void dfs(int x, ArrayList<Integer> al, boolean[] vis,
                           ArrayList<ArrayList<Integer>> adj) {
        if(vis[x])return;
        al.add(x);
        vis[x]=true;
        for(int i=0;i<adj.get(x).size();i++){
            int n=adj.get(x).get(i);
            dfs(n,al,vis,adj);
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(Arrays.asList(0,4)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(2)));

        ArrayList<Integer> answer = new Solution_01_08_2023().dfsOfGraph(V, adj);
        for(Integer num : answer) {
            System.out.print(num + " ");
        }
    }
}
