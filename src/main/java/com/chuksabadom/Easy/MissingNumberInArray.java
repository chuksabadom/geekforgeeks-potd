package com.chuksabadom.Easy;
/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
*/
public class MissingNumberInArray {
	int missingNumber(int[] array, int n) {
		// Your Code Here
		int total = calculateSum(n); // Total sum of numbers from 1 to n
		int arrTotal = calculateArraySum(array); // Total sum of elements in the array
		return total - arrTotal;
	}
	
	private int calculateSum(int n) {
		return n * (n + 1) / 2; // Formula to calculate sum of numbers from 1 to n
	}
	
	private int calculateArraySum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {6,1,2,8,3,4,7,10,5};
		int n = arr.length;
		int ans = new MissingNumberInArray().missingNumber(arr, n);
		System.out.println("The answer: " + ans);
	}
}
