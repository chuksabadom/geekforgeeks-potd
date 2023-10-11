package com.chuksabadom._2023._10_october;

public class Solution_11_10_2023 {
    static class Node
    {
        int data;
        Node left,right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root) {
        // Your code here

        if(root==null)
            return true;
        int lh=lheight(root.left);
        int rh=rheight(root.right);
        if(Math.abs(lh-rh)>1)
            return false;

        return isBalanced(root.left)&&isBalanced(root.right);
    }

    int lheight(Node root) {
        if(root == null) {
            return 0;
        }

        return Math.max(lheight(root.left),lheight(root.right))+1;
    }

    int rheight(Node root) {
        if(root == null) {
            return 0;
        }

        return Math.max(rheight(root.left),rheight(root.right))+1;
    }
}

