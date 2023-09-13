package com.chuksabadom._2023._09_september;

public class Solution_13_09_2023 {
    static String findLargest(int N, int S) {
        if (N == 1 && S == 0) {
            return "0";
        }
        if (S <= 0 || S > 9 * N) {
            return "-1"; // No valid number is possible in this case.
        }

        StringBuilder ans = new StringBuilder();

        while (N > 0) {
            if (S >= 9) {
                ans.append('9');
                S -= 9;
            } else {
                ans.append((char)('0' + S));
                S = 0;
            }
            N--;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        int N = 3, S = 20;
        String answer = findLargest(N, S);
        System.out.println(answer);
    }
}
