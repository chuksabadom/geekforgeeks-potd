package com.chuksabadom._2023._09_september;

public class Solution_19_09_2023 {
        public static int getFirstSetBit(int n) {
            int i = 1;
            while (n > 0) {
                if (n % 2 == 1) {
                    return i;
                } else {
                    i += 1;
                    n = n / 2;
                }
            }
            return 0;
        }

        public static void main(String[] args) {
            int n = 18;
            int result = getFirstSetBit(n);
            System.out.println("The position of the first set bit is: " + result);
        }

}
