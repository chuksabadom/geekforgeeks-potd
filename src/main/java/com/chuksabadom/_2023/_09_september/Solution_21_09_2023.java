package com.chuksabadom._2023._09_september;

public class Solution_21_09_2023 {
    int FindMaxSum(int[] arr, int n) {
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);

        int prevWithHouse = Math.max(arr[0], arr[1]);
        int prevWithoutHouse = arr[0];

        for (int i = 2; i < n; i++) {
            int currentMax = Math.max(arr[i] + prevWithoutHouse, prevWithHouse);
            prevWithoutHouse = prevWithHouse;
            prevWithHouse = currentMax;
        }

        return prevWithHouse;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {6,5,5,7,4};
        int answer = new Solution_21_09_2023().FindMaxSum(a, n);
        System.out.println(answer);
    }
}
