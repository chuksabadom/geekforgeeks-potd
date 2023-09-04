package com.chuksabadom._2023._09_september;

public class Solution_04_09_2023 {
    public static char[][] fill(int n, int m, char[][] a) {
        // Iterate over the borders and perform depth-first search
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 'O') {
                dfs(i, 0, n, m, a);
            }
            if (a[i][m - 1] == 'O') {
                dfs(i, m - 1, n, m, a);
            }
        }
        for (int j = 0; j < m; j++) {
            if (a[0][j] == 'O') {
                dfs(0, j, n, m, a);
            }
            if (a[n - 1][j] == 'O') {
                dfs(n - 1, j, n, m, a);
            }
        }

        // Replace '0' with 'O' and 'O' with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '0') {
                    a[i][j] = 'O';
                } else if (a[i][j] == 'O') {
                    a[i][j] = 'X';
                }
            }
        }

        return a;
    }

    private static void dfs(int r, int c, int n, int m, char[][] a) {
        if (r < 0 || r >= n || c < 0 || c >= m || a[r][c] != 'O') {
            return;
        }

        a[r][c] = '0';

        // Explore neighboring cells
        dfs(r + 1, c, n, m, a);
        dfs(r - 1, c, n, m, a);
        dfs(r, c + 1, n, m, a);
        dfs(r, c - 1, n, m, a);
    }

    public static void main(String[] args)  {

        int n = 5, m = 4;
        char[][] mat = {{'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        char[][] answer = fill(n, m, mat);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
