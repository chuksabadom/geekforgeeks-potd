package com.chuksabadom._2023._08_august;

public class Solution_13_08_2023 {
    static int nthFibonacci(int n){
        // code here
        int x, y;
        x = y = 1;

        final int mod = 1000000007;

        for (int i = 3; i < n + 1; i++) {
            x = (x + y) % mod;
            int temp = x;
            x = y;
            y = temp;
        }

        return y;
    }
    public static void main(String[] args) {

        int answer = nthFibonacci(5);
        System.out.println(answer);
    }
}
