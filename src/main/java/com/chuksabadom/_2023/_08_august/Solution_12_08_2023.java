package com.chuksabadom._2023._08_august;

import java.util.ArrayList;

public class Solution_12_08_2023 {
    public static int longestSubsequence(int n, int[] a) {
        int maxi = 1;
        ArrayList<Integer> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = binarySearch(dp, a[i]);
            if (index == dp.size()) {
                dp.add(a[i]);
            } else {
                dp.set(index, a[i]);
            }
            maxi = Math.max(maxi, dp.size());
        }
        return maxi;
    }

    private static int binarySearch(ArrayList<Integer> dp, int target) {
        int left = 0;
        int right = dp.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dp.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] A = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int answer = longestSubsequence(16, A);
        System.out.println(answer);
    }
}
