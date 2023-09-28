package com.chuksabadom._2023._09_september;

public class Solution_28_09_2023 {
    public static void convertToWave(int n, int[] arr) {
        for (int i = 0; i < n-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Replace this array with your own input array
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        convertToWave(n, arr);

        System.out.println("Waveform array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

