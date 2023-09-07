package com.chuksabadom._2023._09_september;

import java.util.LinkedHashMap;

public class Solution_07_09_2023_1 {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        int currSteps = 0;
        map.put(start, currSteps);
        while(!map.isEmpty()){
            int num = map.keySet().iterator().next();

            currSteps = map.get(num);
            map.remove(num);
            for (int j : arr) {
                int mul = (num * j) % 100000;

                if (mul == end) {
                    return currSteps + 1;
                }
                if (!map.containsKey(mul)) {
                    map.put(mul, currSteps + 1);


                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 65};
        int start = 7, end = 66175;
        int answer = new Solution_07_09_2023_1().minimumMultiplications(arr, start, end);
        System.out.println(answer);
    }
}
