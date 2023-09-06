package com.chuksabadom._2023._09_september;
import java.util.*;
public class Solution_06_09_2023 {
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        int[] visited = new int[V];  // Initialize an array to track visited nodes

        // Perform a topological sort starting from unvisited nodes
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                topo(i, stack, adj, visited);
            }
        }

        // Reset the visited array
        Arrays.fill(visited, 0);

        // Get the last visited node from the topological sort
        int last_visited_node = stack.pop();

        // Calculate the size of the connected component starting from the last visited node
        int component_size = dfs(last_visited_node, adj, visited);

        // If the size of the component is equal to the total number of vertices, it's a mother vertex
        return (component_size == V) ? last_visited_node : -1;
    }

    public int dfs(int current_node, ArrayList<ArrayList<Integer>> adjacency_list, int[] visited) {
        visited[current_node] = 1;
        int component_size = 1;  // Initialize component size to 1 (the current node itself)

        for (int neighbor : adjacency_list.get(current_node)) {
            if (visited[neighbor] == 0) {
                component_size += dfs(neighbor, adjacency_list, visited);
            }
        }

        return component_size;
    }

    public void topo(int current_node, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adjacency_list, int[] visited) {
        visited[current_node] = 1;

        for (int neighbor : adjacency_list.get(current_node)) {
            if (visited[neighbor] == 0) {
                topo(neighbor, stack, adjacency_list, visited);
            }
        }

        stack.push(current_node);
    }
}
