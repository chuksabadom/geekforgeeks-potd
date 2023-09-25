package com.chuksabadom._2023._09_september;
import java.util.ArrayList;
public class Solution_24_09_2023 {

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> arrayOfDuplicates = new ArrayList<>();

        // Mark elements as visited
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Find and add duplicates to the list
        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                arrayOfDuplicates.add(i);
            }
        }

        // Handle the case when no duplicates are found
        if (arrayOfDuplicates.isEmpty()) {
            arrayOfDuplicates.add(-1);
        }

        return arrayOfDuplicates;

    }
    public static void main(String[] args) {
        int N = 5;
        int[] a = {2,3,1,2,3};
        ArrayList<Integer> result = duplicates(a, N);
        System.out.println(result);
    }
}

