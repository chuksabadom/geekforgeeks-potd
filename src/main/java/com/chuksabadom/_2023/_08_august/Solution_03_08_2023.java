package com.chuksabadom._2023._08_august;
import java.util.*;

class Solution_03_08_2023 {
        public int[] shortestPath(int N, int M, int[][] edges) {
            List<int[]>[] adj = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int[] e : edges) {
                adj[e[0]].add(new int[]{e[1], e[2]});
            }

            int[] distance = new int[N];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[0] = 0;

            PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.comparingInt(a -> distance[a]));
            q.add(0);

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int[] padosi : adj[node]) {
                    int nbr = padosi[0];
                    int dist = padosi[1];
                    if (distance[node] + dist < distance[nbr]) {
                        distance[nbr] = distance[node] + dist;
                        q.add(nbr);
                    }
                }
            }

            for (int i = 0; i < distance.length; i++) {
                if (distance[i] == Integer.MAX_VALUE) {
                    distance[i] = -1;
                }
            }

            return distance;
        }
    public static void main(String[] args) {
        int N = 4;
        int M = 5;
        int[][] edges = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        int[] result = new Solution_03_08_2023().shortestPath(N, M, edges);
        System.out.println(Arrays.toString(result));
    }
}
