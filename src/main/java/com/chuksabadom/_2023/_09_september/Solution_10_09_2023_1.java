package com.chuksabadom._2023._09_september;

public class Solution_10_09_2023_1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node insert(Node root, int Key) {
        if(root==null) {
            root= new Node(Key);
        }
        if(root.data>Key) {
            root.left= insert(root.left, Key);
        }
        if(root.data<Key) {
            root.right= insert(root.right, Key);
        }
        return root;
    }
}