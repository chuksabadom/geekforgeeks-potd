package com.chuksabadom._2023._09_september;

public class Solution_18_09_2023 {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {
        // Your code here
        for (long i = 1; i <= n; i *= 2){
            if (i == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean answer = isPowerofTwo(90);
        System.out.println(answer);
    }
}
