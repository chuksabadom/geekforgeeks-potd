package com.chuksabadom._2023._09_september;

import java.util.ArrayList;

public class Solution_22_09_2023 {
     ArrayList<Integer> find(int[] arr, int n, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        result.add(firstIndex);
        result.add(lastIndex);

        return result;
    }
    public static void main(String[] args) {
         int n=9, x=5;
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        ArrayList<Integer> answer = new Solution_22_09_2023().find(arr, n, x);
        for(int ans : answer) {
            System.out.print(ans + " ");
        }
    }
}