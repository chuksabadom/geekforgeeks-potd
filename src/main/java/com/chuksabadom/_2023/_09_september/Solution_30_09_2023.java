package com.chuksabadom._2023._09_september;

import java.util.Arrays;
import java.util.List;
public class Solution_30_09_2023 {
     void booleanMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] matrix = {
                {1, 0, 0},
                {0, 0, 1},
                {0, 0, 0}
        };

        Solution_30_09_2023 converter = new Solution_30_09_2023();
        converter.booleanMatrix(matrix);

        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

