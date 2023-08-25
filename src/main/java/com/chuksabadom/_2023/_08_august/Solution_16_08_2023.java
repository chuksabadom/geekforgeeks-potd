package com.chuksabadom._2023._08_august;

public class Solution_16_08_2023 {
    public static int findCatalan(int n) {
        // code here
        final int mod = (int) (1e9 + 7);

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = (dp[i] + (dp[j] * dp[i - j - 1]) % mod) % mod;
            }
        }

        return (int) dp[n];
    }

    public static void main(String[] args) {

        int answer = findCatalan(5);
        System.out.println(answer);
    }
}
