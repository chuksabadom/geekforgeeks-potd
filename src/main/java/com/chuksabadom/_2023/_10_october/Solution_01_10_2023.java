package com.chuksabadom._2023._10_october;

import java.util.ArrayList;

public class Solution_01_10_2023 {
    //Function to return list of integers that form the boundary
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int[][] matrix, int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ans.add(matrix[0][i]);
        }
        for (int i = 1; i < n; i++) {
            ans.add(matrix[i][m - 1]);
        }
        if (n > 1)
            for (int i = m - 2; i >= 0; i--) {
                ans.add(matrix[n - 1][i]);
            }
        if (m > 1)
            for (int i = n - 2; i > 0; i--) {
                ans.add(matrix[i][0]);
            }

        return ans;
    }
    public static void main(String[] args) {
        int n = 4, m = 4;
        int[][] matrix= {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};

        ArrayList<Integer> result = boundaryTraversal(matrix, n, m);
        //result.forEach(res -> System.out.print(res + " "));
        for(int ans : result) {
            System.out.print(ans + " ");
        }
    }
}
