package com.chuksabadom._2023._09_september;

public class Solution_16_09_2023 {
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n) {
        final long MOD = 1000000007;
        if (n <= 3) {
            return (n == 1) ? 1 : (n == 2) ? 2 : 4;
        }

        long a = 1, b = 2, c = 4, d = 0;
        for (int i = 4; i <= n; i++) {
            d = (a + b + c) % MOD;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

    public static void main(String[] args) {
        long answer = countWays(5);
        System.out.println(answer);
    }
}
