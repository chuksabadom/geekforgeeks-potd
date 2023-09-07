package com.chuksabadom._2023._09_september;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_07_09_2023 {
    int minimumMultiplications(int[] arr, int start, int end) {
        if (start == end) return 0;

        int[] visited = new int[100000];
        Arrays.fill(visited, -1);

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 0;

        while (!q.isEmpty()) {
            int temp = q.poll();
            int currentSteps = visited[temp];

            for (int num : arr) {
                int newStart = (temp * num) % 100000;

                if (newStart == end) return currentSteps + 1;
                if (visited[newStart] == -1) {
                    q.offer(newStart);
                    visited[newStart] = currentSteps + 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 65};
        int start = 7, end = 66175;
        int answer = new Solution_07_09_2023().minimumMultiplications(arr, start, end);
        System.out.println(answer);
    }
}
