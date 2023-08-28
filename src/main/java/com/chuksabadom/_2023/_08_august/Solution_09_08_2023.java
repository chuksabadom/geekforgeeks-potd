package com.chuksabadom._2023._08_august;

public class Solution_09_08_2023 {
    static long largestPrimeFactor(int N) {
        // code here
        long ans = 1;

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                ans = i;
                while (N % i == 0) {
                    N /= i;
                }
            }
        }

        if (N > 1)
            ans = Math.max(ans, N);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(5));
    }
}
