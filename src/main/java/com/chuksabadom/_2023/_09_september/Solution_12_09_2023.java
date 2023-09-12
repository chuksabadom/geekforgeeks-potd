package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_12_09_2023 {
    static int isPerfectNumber(long N) {
        // code here
        long sum = 1;
        if(N == 1) {
            return 0;
        }
        for(int i = 2; i <= Math.sqrt(N); i++) {
            if(N % i == 0){
                sum += i + N/i;
            }
        }
        return sum == N ? 1 : 0;
        
    }

    public static void main(String[] args) {
        int N = 496;
        int answer = isPerfectNumber(N);
        System.out.println(answer);
    }
}
