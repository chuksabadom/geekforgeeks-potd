package com.chuksabadom._2023._09_september;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_09_09_2023 {
    // return the Kth largest element in the given BST rooted at 'root'
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left=null;
            right=null;
        }
    }
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer>list= new ArrayList<>();
        buildBST(root,list);
        Collections.sort(list);

        return list.get(list.size()-K);
    }
    static void buildBST(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        buildBST(root.left,list);
        buildBST(root.right,list);
    }
}