package com.chuksabadom._2023._10_october;

public class Solution_03_10_2023 {
     String colName(long n) {
        StringBuilder columnName = new StringBuilder();

        while (n > 0) {
            n--; // Adjust n to start from 0 instead of 1
            char rem = (char) ('A' + n % 26);
            columnName.insert(0, rem);
            n /= 26;
        }

        return columnName.toString();
    }
    public static void main(String[] args) {
        long n = 720;
        String answer = new Solution_03_10_2023().colName(n);
        System.out.println(answer);
    }
}
