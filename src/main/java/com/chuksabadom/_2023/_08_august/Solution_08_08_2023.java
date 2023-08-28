package com.chuksabadom._2023._08_august;

import java.util.HashMap;
import java.util.Map;

public class Solution_08_08_2023 {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        Map<Pair, Integer> f = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int gcd = gcd(numerator[i], denominator[i]);
            numerator[i] /= gcd;
            denominator[i] /= gcd;

            int x, y;
            x = numerator[i];
            y = denominator[i];

            int z = y - x;

            Pair pair = new Pair(z, y);
            if (f.containsKey(pair)) {
                ans += f.get(pair);
            }

            Pair fractionPair = new Pair(numerator[i], denominator[i]);
            f.put(fractionPair, f.getOrDefault(fractionPair, 0) + 1);
        }

        return ans;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int hashCode() {
            return 31 * first + second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair other = (Pair) obj;
            return first == other.first && second == other.second;
        }
    }

    public static void main(String[] args) {

        int[] numerator = {3, 1, 12, 81, 2};
        int[] denominator = {9, 10, 18, 90, 5};
        int answer = countFractions(5, numerator, denominator);

        System.out.println(answer);
    }
}
