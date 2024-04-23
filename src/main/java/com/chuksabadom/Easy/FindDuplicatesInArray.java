package com.chuksabadom.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than
once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1].
Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.

Example 1:
Input:
N = 4
a[] = {0,3,1,2}
Output:
-1
Explanation:
There is no repeating element in the array. Therefore, output is -1.

Example 2:
Input:
N = 5
a[] = {2,3,1,2,3}
Output:
2 3
Explanation:
2 and 3 occur more than once in the given array.
*/
public class FindDuplicatesInArray {
	public static ArrayList<Integer> duplicates(int[] arr, int n) {
		// code here
		ArrayList<Integer> arrDuplicates = new ArrayList<>() ;
		
		Arrays.sort(arr);
		for(int i = 0 ; i< n-1 ; i++){
			if(arr[i] == arr[i+1]){
				arrDuplicates.add(arr[i]);
				while(i<n-1 && arr[i]==arr[i+1]){

					i++ ;
				}
			}
		}
		if(arrDuplicates.isEmpty()){
			arrDuplicates.add(-1);
		}
		return arrDuplicates;
		
	}
	public static void main(String[] args) {
		int[] arr = {6,2,3,1,2,3,3};
		int n = arr.length;
		ArrayList<Integer> ans = duplicates(arr, n);
		System.out.println("The answer: " + ans);
	}
}
