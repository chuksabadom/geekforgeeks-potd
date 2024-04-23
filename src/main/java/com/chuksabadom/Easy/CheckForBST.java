package com.chuksabadom.Easy;

/*
Given the root of a binary tree. Check whether it is a BST or not.
Note: We are considering that BSTs can not contain duplicate Nodes.
A BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
Input:
   2
 /    \
1      3
Output: 1
Explanation:
The left subtree of root node contains node
with key lesser than the root nodes key and
the right subtree of root node contains node
with key greater than the root nodes key.
Hence, the tree is a BST.

Example 2:
Input:
  2
   \
    7
     \
      6
       \
        5
         \
          9
           \
            2
             \
              6
Output: 0
Explanation:
Since the node with value 7 has right subtree
nodes with keys less than 7, this is not a BST.

 */
public class CheckForBST {
	private Node prev = null;
	private boolean isBST = true;
	
	// Function to check whether a Binary Tree is BST or not.
	private void inorderTraversal(Node root) {
		if (root == null) return;
		
		inorderTraversal(root.left);
		
		// Check if the current node violates BST property.
		if (prev != null && prev.data >= root.data) {
			isBST = false;
			return;
		}
		
		// Update previous node for comparison.
		prev = root;
		
		inorderTraversal(root.right);
	}
	//Function to check whether a Binary Tree is BST or not.
	boolean isBST(Node root)
	{
		// code here.
		inorderTraversal(root);
		return isBST;
		
	}
}
