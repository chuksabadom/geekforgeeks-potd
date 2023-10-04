package com.chuksabadom._2023._10_october;

public class Solution_04_10_2023 {
    public int romanToDecimal(String str) {

        int ans = 0, num = 0;
        for(int i = str.length()-1; i>=0; i--) {
            switch (str.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if(num*4 < ans){
                ans -= num;
            }
            else ans += num;
        }
        return ans;
    }
    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        int answer = new Solution_04_10_2023().romanToDecimal(romanNumeral);

        System.out.println("Roman numeral " + romanNumeral + " is equivalent to decimal " + answer);
    }
}
