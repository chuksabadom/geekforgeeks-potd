package com.chuksabadom._2023._09_september;

public class Solution_17_09_2023 {
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) {

        long[] dp =new long[n];
        dp[0] = 1;
        if(n ==1 )return dp;
        dp[1] = 1;
        for(int i=2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
    public static void main(String[] args) {
        long[] answer = printFibb(9);
        for(long ans : answer) {
            System.out.print(ans + " ");
        }
    }
}
