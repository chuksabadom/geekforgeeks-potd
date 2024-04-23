package com.chuksabadom.Easy;

import java.util.ArrayList;

/*
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

Example 1:
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so, it is also
included.

Example 2:
Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
Explanation: 0 is the rightmost element
and 4 is the only element which is greater
than all the elements to its right.
 */
public class LeadersInAnArray {
	//Function to find the leaders in the array.
	static ArrayList<Integer> leaders(int[] arr, int n){
		// Your code here
		ArrayList<Integer> ans = new ArrayList<>();
		
		int MAX = Integer.MIN_VALUE;
		
		for (int i = n - 1; i > -1; i--) {
			MAX = Math.max(MAX, arr[i]);
			
			if (arr[i] >= MAX) {
				ans.add(arr[i]);
			}
		}
		
		//Collections.reverse(ans);
		
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {6,2,3,1,2,5,3};
		int n = arr.length;
		ArrayList<Integer> ans = leaders(arr, n);
		System.out.println("The answer: " + ans);
	}
}
