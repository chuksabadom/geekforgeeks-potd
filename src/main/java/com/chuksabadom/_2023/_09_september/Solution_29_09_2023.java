package com.chuksabadom._2023._09_september;

import java.util.LinkedList;
import java.util.Queue;
public class Solution_29_09_2023 {
     int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if (m < 3 || n < 3)
            return 0;

        Queue<int[]> q = new LinkedList<>();
        int count = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < m; j++) {
                if (ints[j] == 1)
                    count++;
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                        grid[i][j] = 2;
                        q.offer(new int[]{i, j});
                    }
                }
            }
        }

        count -= q.size();

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int row = current[0];
            int col = current[1];

            for (int k = 0; k < 4; k++) {
                int nrow = row + dx[k];
                int ncol = col + dy[k];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1) {
                    q.offer(new int[]{nrow, ncol});
                    grid[nrow][ncol] = 2;
                    count--;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {0, 1, 1, 0}};
        int result = new Solution_29_09_2023().numberOfEnclaves(grid);
        System.out.println(result);
    }
}
