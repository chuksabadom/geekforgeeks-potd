package com.chuksabadom._2023._08_august;

import java.util.ArrayList;

public class Solution_20_08_2023 {
    int count(int[] arr, int n, int x) {
        // code here
        int first = lowerBound(arr, x);
        int last = upperBound(arr, x);

        if (first == n || arr[first] != x)
            return 0;

        return last - first;
    }

    private int lowerBound(int[] arr, int x) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    private int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2, 2, 2, 3};
        ArrayList<Integer> answer = new Solution_19_08_2023().subarraySum(input, 7, 2);
        for(Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
