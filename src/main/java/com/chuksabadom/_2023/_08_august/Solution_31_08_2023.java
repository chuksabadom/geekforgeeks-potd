package com.chuksabadom._2023._08_august;

public class Solution_31_08_2023 {


         static Node deleteNode(Node root, int key) {
        // code here.
        // Normal BST deletion
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node has only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor
            Node temp = inorderSuccessor(root.right);

            // Copy the inorder successor's content to this Node
            root.data = temp.data;

            // Delete the inorder successor
            root.right = deleteNode(root.right, temp.data);
        }

        // Update height of current Node
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // Get the balance factor of the current Node
        int balance = getBalanceFactor(root);

        // Left Left case
        if (balance > 1 && getBalanceFactor(root.left) >= 0) {
            return rightRotate(root);
        }

        // Left Right Case
        if (balance > 1 && getBalanceFactor(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalanceFactor(root.right) <= 0) {
            return leftRotate(root);
        }

        // Right Left Case
        if (balance < -1 && getBalanceFactor(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    static int getBalanceFactor(Node n) {
        if (n == null) {
            return 0;
        }
        return height(n.left) - height(n.right);
    }

    static Node leftRotate(Node root) {
        Node newRoot = root.right;
        Node temp = newRoot.left;

        // Rotation
        newRoot.left = root;
        root.right = temp;

        // Update heights
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        newRoot.height = Math.max(height(newRoot.left), height(newRoot.right)) + 1;

        // Return new root after rotation
        return newRoot;
    }

    static Node rightRotate(Node root) {
        Node newRoot = root.left;
        Node temp = newRoot.right;

        // Rotation
        newRoot.right = root;
        root.left = temp;

        // Update heights
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        newRoot.height = Math.max(height(newRoot.left), height(newRoot.right)) + 1;

        // Return new root after rotation
        return newRoot;
    }

    static Node inorderSuccessor(Node root) {
        Node curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
            left = right = null;
        }
    }
}
