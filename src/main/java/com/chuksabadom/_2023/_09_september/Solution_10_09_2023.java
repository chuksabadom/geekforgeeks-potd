package com.chuksabadom._2023._09_september;

public class Solution_10_09_2023 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
        // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        if (root == null) {
            return new Node(Key);
        }

        Node curr = root;
        Node prev = null;

        while (curr != null) {
            if (curr.data == Key) {
                return root; // Node with Key already exists, no need to insert.
            } else if (curr.data > Key) {
                prev = curr;
                curr = curr.left;
            } else {
                prev = curr;
                curr = curr.right;
            }
        }

        // Insert the new node at the appropriate position.
        if (prev.data > Key) {
            prev.left = new Node(Key);
        } else {
            prev.right = new Node(Key);
        }

        return root;
    }
}
