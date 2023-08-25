package com.chuksabadom._2023._08_august;

import java.util.ArrayList;
import java.util.List;

public class Solution_19_08_2023 {
    public ArrayList<Integer> subarraySum(int[] arr, int n, long s) {
        int st=0;
        int sum=0;
        int e=0;
        for(e=0;e<n;e++){
            if(sum<s){
                sum=sum+arr[e];
            }
            if(sum>s){
                while(sum>s && st+1<n){
                    sum=sum-arr[st];
                    st++;
                }
            }
            if(sum==s){
                break;
            }
        }
        ArrayList<Integer>arrAns=new ArrayList<>();
        if(sum==s&&sum!=0){
            arrAns.add(st+1);
            arrAns.add(e+1);
        }
        else{
            arrAns.add(-1);
        }
        return arrAns;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 7, 5};
        ArrayList<Integer> answer = new Solution_19_08_2023().subarraySum(input, 5, 12);
        for(Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
