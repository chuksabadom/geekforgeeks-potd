package com.chuksabadom._2023._08_august;

public class Solution_15_08_2023 {
    public static int maxOnes(int[] a, int n) {
        // Your code goes here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                a[i] = -1;
                count++;
            } else {
                a[i] = 1;
            }
        }

        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            ans = Math.max(ans, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return ans + count;
    }

    public static void main(String[] args) {

        int[] A = {1, 0, 0, 1, 0};
        int answer = maxOnes(A, 5);
        System.out.println(answer);
    }
}
