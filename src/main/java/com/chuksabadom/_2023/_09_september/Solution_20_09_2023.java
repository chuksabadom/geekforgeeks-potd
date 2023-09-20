package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
public class Solution_20_09_2023 {
    ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> result = new ArrayList<>();

        // Ensure D is in the range [0, 16] to avoid unnecessary rotations.
        D = (D % 16 + 16) % 16;

        // Convert N to its binary representation as a string.
        String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');

        // Rotate left by D positions.
        String leftRotation = binaryN.substring(D) + binaryN.substring(0, D);
        result.add(Integer.parseInt(leftRotation, 2));

        // Rotate right by D positions.
        String rightRotation = binaryN.substring(16 - D) + binaryN.substring(0, 16 - D);
        result.add(Integer.parseInt(rightRotation, 2));

        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> result = new Solution_20_09_2023().rotate(29, 2);
        for(int ans : result) {
            System.out.println(ans);
        }

    }
}

