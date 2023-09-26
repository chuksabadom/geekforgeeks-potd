package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_26_09_2023 {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates to avoid duplicate results
            }

            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue; // Skip duplicates
                }

                int left = j + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum < k) {
                        left++;
                    } else if (sum > k) {
                        right--;
                    } else {
                        ArrayList<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(arr[i]);
                        quadruplet.add(arr[j]);
                        quadruplet.add(arr[left]);
                        quadruplet.add(arr[right]);
                        result.add(quadruplet);

                        while (left < right && arr[left] == arr[left + 1]) {
                            left++; // Skip duplicates
                        }
                        while (left < right && arr[right] == arr[right - 1]) {
                            right--; // Skip duplicates
                        }

                        left++;
                        right--;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int K = 23;
        int[] A = {10,2,3,4,5,7,8};
        ArrayList<ArrayList<Integer>> answer = new Solution_26_09_2023().fourSum(A, K);
        for(ArrayList<Integer>  a : answer) {
            System.out.println(a);
        }
    }
}
