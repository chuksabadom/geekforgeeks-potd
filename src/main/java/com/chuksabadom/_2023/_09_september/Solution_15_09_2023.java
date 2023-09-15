package com.chuksabadom._2023._09_september;

import java.util.Arrays;
public class Solution_15_09_2023 {
    static int equalPartition(int N, int[] arr) {
        int totalSum = Arrays.stream(arr).sum();
        if (totalSum % 2 != 0)
            return 0;

        int halfSum = totalSum / 2;
        int[] dp = new int[halfSum + 1];
        dp[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = halfSum; j >= arr[i]; j--) {
                dp[j] |= dp[j - arr[i]];
            }
        }

        return dp[halfSum];
    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = {1, 5, 11, 5};
        int answer = equalPartition(N, arr);
        System.out.println(answer);
    }
}

