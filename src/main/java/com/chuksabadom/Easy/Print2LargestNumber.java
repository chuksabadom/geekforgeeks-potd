package com.chuksabadom.Easy;

import java.util.Arrays;

public class Print2LargestNumber {
	//Using sort method
	int print2largestSort(int[] arr, int n) {
		// code here
		int k=-1;
		Arrays.sort(arr);
		while(n>1){
			if(arr[n-2]!=arr[n-1]){
				k=arr[n-2];
				break;
			} else {
				n--;
			}
		}
		return k;
	}
	//Without using sort method
	int print2largestNoSort(int[] arr, int n) {
		int first = arr[0];
		int second = -1;
		
		for(int i = 0; i < n; i++){
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}
			if(second < first && first > arr[i] && second < arr[i]){
				second = arr[i];
			}
		}
		return second;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,2,3,1,2,3,3};
		int n = arr.length;
		
		int ans = new Print2LargestNumber().print2largestNoSort(arr, n);
		System.out.println("The answer: " + ans);
		
		int ans2 = new Print2LargestNumber().print2largestSort(arr, n);
		System.out.println("The answer2: " + ans2);
	}
}
