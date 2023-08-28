package com.chuksabadom._2023._08_august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution_05_08_2023 {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(n == 0 || m == 0)
            return 0;

        if(m > n)
            return -1;

        Collections.sort(a);

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i + m -1 < n; i++){
            int diff = a.get(i+m-1) - a.get(i);
            if(diff < minDiff){
                minDiff = diff;
            }
        }

        return minDiff;
//        a.sort(null);
//
//        long mini = Integer.MAX_VALUE;
//        int i = 0;
//        int j = (int) m - 1;
//
//        while (j < n) {
//            long diff = a.get(j) - a.get(i);
//            mini = Math.min(mini, diff);
//            i++;
//            j++;
//        }
//
//        return mini;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        long answer = new Solution_05_08_2023().findMinDiff(A, 8, 5);
        System.out.println(answer);
    }
}
