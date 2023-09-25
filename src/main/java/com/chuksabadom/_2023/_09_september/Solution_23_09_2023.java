package com.chuksabadom._2023._09_september;

public class Solution_23_09_2023 {
    public static int equilibriumPoint(long[] arr, int n) {
        if(n==1){
            return 1;
        }
        int left = 0, right = n - 1;
        long leftSum = 0, rightSum = 0;

        while (left < right) {
            if (leftSum == rightSum) {
                leftSum += arr[left++];
                rightSum += arr[right--];
            } else if (leftSum < rightSum) {
                leftSum += arr[left++];
            } else {
                rightSum += arr[right--];
            }
        }

        if (leftSum == rightSum) {
            return left + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        long[] A = {1,3,5,2,2};
        int answer = equilibriumPoint(A, n);
        System.out.println(answer);
    }
}

