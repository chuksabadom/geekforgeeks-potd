package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
public class Solution_27_09_2023 {
    public static ArrayList<Integer> printClosest(int[] arr, int[] brr, int n, int m, int x) {
        int low = 0, high = m - 1, MIN_DIFF = Integer.MAX_VALUE;
        ArrayList<Integer> pair = new ArrayList<>();

        while (low < n && high >= 0) {
            int sum = arr[low] + brr[high];
            int DIFF = Math.abs(sum - x);

            if (MIN_DIFF > DIFF) {
                pair.clear();
                pair.add(arr[low]);
                pair.add(brr[high]);
                MIN_DIFF = DIFF;
            }

            if (sum < x) {
                low++;
            } else {
                high--;
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7};
        int[] brr = {10, 20, 30, 40};
        int n = arr.length;
        int m = brr.length;
        int x = 38;

        ArrayList<Integer> closestPair = printClosest(arr, brr, n, m, x);
        System.out.println("Closest pair: " + closestPair);
    }
}

