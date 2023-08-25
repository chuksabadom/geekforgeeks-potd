package com.chuksabadom._2023._08_august;

import java.util.ArrayList;

public class Solution_22_08_2023 {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int[] values = new int[N];
        int need = 0;

        for (int i = 0; i < N; i++) {
            int row, col;
            row = col = 0;

            for (int j = 0; j < N; j++) {
                row += matrix[i][j];
                col += matrix[j][i];
            }

            need = Math.max(Math.max(need, row), col);
            values[i] = row;
        }

        int ans = 0;
        for (int i : values)
            ans += need - i;

        return ans;
    }
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 2, 3}, {3, 2, 1}};

        int answer = findMinOperation(3, input);
        System.out.print(answer );

    }
}
