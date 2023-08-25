package com.chuksabadom._2023._08_august;

public class Solution_25_08_2023 {
    int isPalindrome(String S) {
        // code here
        for(int i =0;i<S.length()/2;i++) {
            if(S.charAt(i)!=S.charAt(S.length()-i-1)) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String s1 = "ababa";
        int answer = new Solution_25_08_2023().isPalindrome(s1);
        System.out.println(answer);
    }
}
