package com.chuksabadom._2023._10_october;

public class Solution_05_10_2023 {
     private long atMost(String S, int K) {
        int[] chars = new int[26];
        int i = 0, j = 0, distinct = 0;
        long len = 0;

        while (j < S.length()) {
            int jth = S.charAt(j) - 'a';
            chars[jth]++;
            if (chars[jth] == 1) {
                distinct++;
            }

            while (distinct > K) {
                int ith = S.charAt(i) - 'a';
                chars[ith]--;
                if (chars[ith] == 0) {
                    distinct--;
                }
                i++;
            }

            len += j - i + 1;
            j++;
        }

        return len;
    }
    long substrCount(String S, int K) {
        if (K == 0 || S.isEmpty()) {
            return 0;
        }
        return atMost(S, K) - atMost(S, K-1);
    }

    public static void main(String[] args) {
       String S = "aba"; int K = 2;
       long answer = new Solution_05_10_2023().substrCount(S, K);
        System.out.println(answer);
    }
}
