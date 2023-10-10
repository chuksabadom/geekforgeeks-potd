package com.chuksabadom._2023._10_october;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_10_10_2023 {
    static class Node {
     int data;
     Node left, right;
    }
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k) {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> list = new ArrayList<>();
        int num = helper(root, target, k, list);
        Collections.sort(list);
        return list;
    }
     static void kdown(Node root, int d, Node blockNode, ArrayList<Integer> list) {
        if(root == null || d < 0 || root == blockNode) return;

        if(d == 0) {
            list.add(root.data);
            return;
        }

        kdown(root.left, d-1, blockNode, list);
        kdown(root.right, d-1, blockNode, list);
    }

    public static int helper(Node root, int target, int k, ArrayList<Integer> list) {
        if(root == null) return -1;

        if(root.data == target) {
            kdown(root, k, null, list);
            return 1;
        }

        int ld = helper(root.left, target, k, list);
        if(ld != -1) {
            kdown(root, k-ld, root.left, list);
            return ld+1;
        }
        int rd = helper(root.right, target, k, list);
        if(rd != -1) {
            kdown(root, k-rd, root.right, list);
            return rd+1;
        }

        return -1;
    }
}
