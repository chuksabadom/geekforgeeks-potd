package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_08_09_2023 {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        collectDataInOrder(root, list);
        Collections.sort(list);
        return buildBST(list, 0, list.size() - 1);
    }

    Node buildBST(ArrayList<Integer> list, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        Node root = new Node(list.get(mid));
        root.left = buildBST(list, low, mid - 1);
        root.right = buildBST(list, mid + 1, high);
        return root;
    }

    void collectDataInOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.data);
        collectDataInOrder(root.left, list);
        collectDataInOrder(root.right, list);
    }
}
