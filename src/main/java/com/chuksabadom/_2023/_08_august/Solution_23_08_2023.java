package com.chuksabadom._2023._08_august;

import java.util.ArrayList;

public class Solution_23_08_2023 {
    public int[][] searchWord(char[][] grid, String word) {
        ArrayList<int[]> result = new ArrayList<>();
        // initialize two arrays one for rows and cols each that represents
        // change in direction [i, j]
        // left [0,-1], right[0,1], up [-1, 0], down [1,0]
        // left-top [-1,-1], right-top [-1,1], right-bottom [1,1], left-bottom [1,-1]
        int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] dy = {-1, 1, 0, 0, -1, 1, 1, -1}; //for directions
        // n square the entire matrix
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //check if the first character matches with a cell
                if (grid[i][j] == word.charAt(0)) {
                    // check in all directions (total 8 directions)
                    for (int dir = 0; dir < 8; dir++) {
                        int newrow = i + dx[dir];
                        int newcol = j + dy[dir];
                        int k;
                        for (k = 1; k < word.length(); k++) {
                            if (newrow >= rows || newcol >= cols || newrow < 0 || newcol < 0) {
                                break;
                            }
                            if (grid[newrow][newcol] != word.charAt(k)) {
                                break;
                            }
                            newrow += dx[dir];
                            newcol += dy[dir];
                        }
                        if (k == word.length()) {
                            int[] coord = {i, j};
                            boolean alreadyExists = false;
                            for (int[] points : result) {
                                if (points[0] == coord[0] && points[1] == coord[1]) {
                                    alreadyExists = true;
                                    break;
                                }
                            }
                            if (!alreadyExists) {
                                result.add(coord);
                            }
                        }
                    }
                }
            }
        }
        int[][] resultant = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultant[i] = result.get(i);
        }
        return resultant;
    }
    public static void main(String[] args) {
        char[][] grid = {{'a','b','a','b'},{'a','b','e','b'},{'e','b','e','b'}};
        String word = "abe";
        int[][] answer = new Solution_23_08_2023().searchWord(grid, word);
        for (int[] ints : answer) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        if(answer.length==0){
            System.out.println("-1");
        }
    }
}
