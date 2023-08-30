package com.chuksabadom._2023._08_august;

import java.util.*;

class Solution_03_08_2023 {
    public int[] shortestPath(int N, int M, int[][] edges) {
        List<int[]>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int startNode = e[0];
            int endNode = e[1];
            int distance = e[2];
            adj[startNode].add(new int[]{endNode, distance});
        }

        int[] distance = new int[N];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.comparingInt(a -> distance[a]));
        q.add(0);

        while (!q.isEmpty()) {
            int currentNode = q.poll();

            for (int[] neighbor : adj[currentNode]) {
                int neighborNode = neighbor[0];
                int neighborDistance = neighbor[1];
                if (distance[currentNode] + neighborDistance < distance[neighborNode]) {
                    distance[neighborNode] = distance[currentNode] + neighborDistance;
                    q.add(neighborNode);
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
        int N = 6;
        int M = 7;
        int[][] edges = {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6}, {5, 3, 1}};
        int[] result = new Solution_03_08_2023().shortestPath(N, M, edges);
        System.out.println(Arrays.toString(result));
    }
}
