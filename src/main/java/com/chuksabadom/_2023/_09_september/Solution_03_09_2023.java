package com.chuksabadom._2023._09_september;

public class Solution_03_09_2023 {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    // Return True if the given trees are isomorphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)
    {
        // code here.

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        } else {
            return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) ||
                    (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
        }

    }

}
