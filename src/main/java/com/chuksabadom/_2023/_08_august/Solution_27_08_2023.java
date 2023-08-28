package com.chuksabadom._2023._08_august;

public class Solution_27_08_2023 {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        int n=str.length();
        StringBuilder res= new StringBuilder();
        for(int i=n-1; i>=0; i--) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("emeka"));
    }
}
