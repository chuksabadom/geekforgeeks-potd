package com.chuksabadom._2023._10_october;

public class Solution_09_10_2023 {
    static class Node
    {
        public Node left, right;
        int data;
        Solution_06_10_2023.Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    //Function to find the height of a binary tree.
    int height(Node node)
    {
        // code here
        if(node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
