package com.chuksabadom._2023._08_august;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_02_08_2023 {
    private static final int[] ROW_OFFSET = {1, 0, -1, 0};
    private static final int[] COL_OFFSET = {0, -1, 0, 1};

    public int shortestDistance(int rows, int cols, int[][] grid, int targetRow, int targetCol) {
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        if (grid[0][0] == 0 || grid[targetRow][targetCol] == 0) {
            return -1;
        }

        queue.offer(new Cell(0, 0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            int currentRow = cell.row;
            int currentCol = cell.col;
            int currentSteps = cell.steps;

            if (currentRow == targetRow && currentCol == targetCol) {
                return currentSteps;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = currentRow + ROW_OFFSET[i];
                int newCol = currentCol + COL_OFFSET[i];
                if (isValid(newRow, newCol, rows, cols) && !visited[newRow][newCol] && grid[newRow][newCol] == 1) {
                    queue.offer(new Cell(newRow, newCol, currentSteps + 1));
                    visited[newRow][newCol] = true;
                }
            }
        }

        return -1;
    }

    private boolean isValid(int row, int col, int numRows, int numCols) {
        return row >= 0 && col >= 0 && row < numRows && col < numCols;
    }

    private static class Cell {
        int row;
        int col;
        int steps;

        Cell(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {
       int N=3, M=4, X=2, Y=3;
       int[][] A = {{1,0,0,0},{1,1,0,1},{0,1,1,1}};

        int shortestPath = new Solution_02_08_2023().shortestDistance(N, M, A, X, Y);
        System.out.println(shortestPath);
    }
}

