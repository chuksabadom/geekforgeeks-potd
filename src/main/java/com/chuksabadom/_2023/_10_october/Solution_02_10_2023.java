package com.chuksabadom._2023._10_october;

public class Solution_02_10_2023 {
     int distinctSubsequences(String S) {
        int n = S.length();
        long mod = 1000000007, pre = 1, cur = 1;
        long[] arr = new long[26];

        for (int i = 0; i < n; i++) {
            cur = (pre * 2) % mod;
            cur = (cur - arr[S.charAt(i) - 'a'] + mod) % mod;
            arr[S.charAt(i) - 'a'] = pre;
            pre = cur;
        }

        return (int) cur;
    }
    public static void main(String[] args) {
        String s = "gfg";
        int result = new Solution_02_10_2023().distinctSubsequences(s);
        System.out.println(result);
    }

}
