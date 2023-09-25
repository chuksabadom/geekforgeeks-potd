package com.chuksabadom._2023._09_september;
import java.util.*;

public class Solution_25_09_2023 {

     static List<Integer> maxCombinations(int N, int K, int[] A, int[] B) {
//The code commented out takes more time than the accepted one
//        List<Integer>l1=new ArrayList<>();
//        List<Integer>l2=new ArrayList<>();
//        for(int i=0; i<N; i++){
//            for(int j=0; j<N; j++){
//                l1.add(A[i]+B[j]);
//            }
//        }
//        Collections.sort(l1);
//
//        for(int i=l1.size(); i>l1.size()-K; i--){
//            l2.add(l1.get(i-1));
//        }
//
//        return l2;

         //Accepted solution
         Arrays.sort(A);
         Arrays.sort(B);

         PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

         for (int i = N - 1; i > N - K - 1; i--) {
             for (int j = N - 1; j > N - K - 1; j--) {
                 int sum = A[i] + B[j];

                 if (priorityQueue.size() < K) {
                     priorityQueue.add(sum);
                 } else {
                     if (priorityQueue.peek() < sum) {
                         priorityQueue.poll();
                         priorityQueue.add(sum);
                     } else {
                         break;
                     }
                 }
             }
         }

         List<Integer> answer = new ArrayList<>(priorityQueue);
         answer.sort((a, b) -> b - a);

         return answer;
    }
    public static void main(String[] args) {
         int N = 2, K = 2;
         int[] A = {3, 2};
         int[] B = {1, 4};
        List<Integer> result = maxCombinations(N, K, A, B);
        for (int ans : result) {
            System.out.print(ans +" ");
        }

    }
}

