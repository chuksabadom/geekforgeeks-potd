package com.chuksabadom._2023._08_august;

import java.util.Vector;

class Solution_17_08_2023 {
    public Vector<Integer> generateNextPalindrome(int[] num, int n) {
        boolean change = true;
        for (int i = 0; i < n / 2; i++) {
            if (num[i] < num[n - i - 1]) {
                change = true;
            } else if (num[i] > num[n - i - 1]) {
                change = false;
            }

            num[n - i - 1] = num[i];
        }

        Vector<Integer> ans = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            ans.add(num[i]);
        }

        int ind = n / 2;
        boolean carry = change;

        while (carry && ind < n) {
            if (ans.get(ind) == 9) {
                ans.set(ind, 0);
                ans.set(n - ind - 1, 0);
            } else {
                ans.set(ind, ans.get(ind) + 1);
                ans.set(n - ind - 1, ans.get(ind));
                carry = false;
            }

            ind++;
        }

        if (carry) {
            ans.set(0, 1);
            ans.add(1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] input = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        Vector<Integer> answer = new Solution_17_08_2023().generateNextPalindrome(input, 11);
        for(Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
