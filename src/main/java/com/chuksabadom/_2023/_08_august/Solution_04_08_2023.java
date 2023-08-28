package com.chuksabadom._2023._08_august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution_04_08_2023 {
    static void reverse(Stack<Integer> s)
    {
        // add your code
        if (s == null) {
            System.out.println();
            return;
        }

        Stack<Integer> r = new Stack<>();
        while (!s.isEmpty()) {
            r.push(s.pop());
        }

        r.forEach(i -> System.out.print(i+" "));
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,2,1,7,6));
        Stack<Integer> st = new Stack<>();
        for (Integer num : input) {
            st.push(num);
        }
        reverse(st);
        for (Integer sol : st) {
            System.out.println(sol);
        }
    }
}
