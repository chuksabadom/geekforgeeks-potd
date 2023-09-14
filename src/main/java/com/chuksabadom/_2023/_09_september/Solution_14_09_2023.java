package com.chuksabadom._2023._09_september;

import java.util.Arrays;

public class Solution_14_09_2023 {
    public int perfectSum(int[] arr, int n, int sum) {
        // Your code goes here
        int modulo = 1000000007;
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] += dp[j - arr[i]];
                dp[j] %= modulo;
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        int N = 6, sum = 10;
        int[] arr = {2, 3, 5, 6, 8, 10};

        int answer = new Solution_14_09_2023().perfectSum(arr, N, sum);
        System.out.println(answer);
    }
}

