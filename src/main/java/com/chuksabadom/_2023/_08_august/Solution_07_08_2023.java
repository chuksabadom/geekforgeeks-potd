package com.chuksabadom._2023._08_august;

public class Solution_07_08_2023 {

    static final int N = 9; // Assuming N is defined as a constant
    static int grid[][] ={{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1 },
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
    // Function to find a solved Sudoku.
    static boolean isPossible(int[][] grid, int curr_row, int curr_col, int val) {
        for (int i = 0; i < N; i++) {
            if (grid[curr_row][i] == val) return false;
            if (grid[i][curr_col] == val) return false;
        }

        for (int i = 0; i < N; i++) {
            if (grid[3 * (curr_row / 3) + i / 3][3 * (curr_col / 3) + i % 3] == val) return false;
        }

        return true;
    }

    static boolean SolveSudoku(int[][] grid) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    for (int index = 1; index <= 9; index++) {
                        if (isPossible(grid, i, j, index)) {
                            grid[i][j] = index;
                            boolean nextFunCall = SolveSudoku(grid);
                            if (nextFunCall) {
                                return true;
                            } else {
                                grid[i][j] = 0;
                            }
                        }
                    }
                    if (grid[i][j] == 0) return false;
                }
            }
        }
        return true;
    }

    // Function to print grids of the Sudoku.
    static void printGrid(int[][] grid) {
        // Your code here

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        if(SolveSudoku(grid)) {
            printGrid(grid);
        }else {
            System.out.println("No solution exists");
        }
    }
}
