package com.chuksabadom._2023._09_september;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_01_09_2023 {
    static class Node
    {
        int data;
        Node left, right;
        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }
    public static void printCorner(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node nodeLevel = queue.poll();

                // Print the first and last elements in the current level
                if (i == 0 || i == size - 1) {
                    System.out.print(nodeLevel.data + " ");
                }

                // Add children to the queue
                if (nodeLevel.left != null) {
                    queue.add(nodeLevel.left);
                }
                if (nodeLevel.right != null) {
                    queue.add(nodeLevel.right);
                }
            }
        }
    }

}
