package com.chuksabadom._2023._08_august;

public class Solution_14_08_2023 {
    public int[] singleNumber(int[] nums)
    {
        int value = 0;
        for (int i : nums)
            value ^= i;

        int rightmost = (value & (value - 1)) ^ value;

        int[] ans = new int[2];

        for (int i : nums) {
            if ((i & rightmost) != 0)
                ans[0] ^= i;
            else
                ans[1] ^= i;
        }

        if (ans[0] > ans[1]) {
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 2, 1, 4};
        int[] answer = new Solution_14_08_2023().singleNumber(A);
        for (Integer number : answer) {
            System.out.print(number + " ");
        }
    }
}
