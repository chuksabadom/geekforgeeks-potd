package com.chuksabadom.Easy;

/*
Given an array A of n non-negative numbers. The task is to find the first equilibrium point in an array. Equilibrium
point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.
Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output:
3
Explanation:
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2).

Example 2:
Input:
n = 1
A[] = {1}
Output:
1
Explanation:
Since there's only element hence its only the equilibrium point.
 */
public class EquilibriumPoint {
	// Function to find equilibrium point in the array.
	public static int equilibriumPoint(long[] arr, int n) {
		
		// Your code here
		if(n==1){
			return 1;
		}
		int left = 0, right = n - 1;
		long leftSum = 0, rightSum = 0;
		
		while (left < right) {
			if (leftSum == rightSum) {
				leftSum += arr[left++];
				rightSum += arr[right--];
			} else if (leftSum < rightSum) {
				leftSum += arr[left++];
			} else {
				rightSum += arr[right--];
			}
		}
		
		if (leftSum == rightSum) {
			return left + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		long[] arr = {6,1,3,1,2,5,3};
		int n = arr.length;
		int ans = equilibriumPoint(arr, n);
		System.out.println("The answer: " + ans);
	}
}
