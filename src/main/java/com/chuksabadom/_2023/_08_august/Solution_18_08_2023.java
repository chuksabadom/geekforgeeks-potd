package com.chuksabadom._2023._08_august;

import java.util.ArrayList;
import java.util.Collections;

class Solution_18_08_2023 {
    public ArrayList<Integer> leaders(int[] a, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        int MAX = Integer.MIN_VALUE;

        for (int i = n - 1; i > -1; i--) {
            MAX = Math.max(MAX, a[i]);

            if (a[i] >= MAX) {
                ans.add(a[i]);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
    public static void main(String[] args) {
        int[] input = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> answer = new Solution_18_08_2023().leaders(input, 6);
        for(Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
