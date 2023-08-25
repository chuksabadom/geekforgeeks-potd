package com.chuksabadom._2023._08_august;

public class Solution_11_08_2023 {
    public long count(int[] coins, int N, int sum) {
        long[] store = new long[sum + 1];
        store[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= sum; j++)
                store[j] += store[j - coin];
        }
        return store[sum];
    }

    public static void main(String[] args) {
       int[] coins = {2,5,3,6};
       long answer = new Solution_11_08_2023().count(coins, 4, 10);
        System.out.println(answer);
    }
}
