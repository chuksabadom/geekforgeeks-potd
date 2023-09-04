package com.chuksabadom._2023._09_september;
import java.util.LinkedList;
import java.util.Queue;



class Solution_02_09_2023 {
    static class Pair {
        Node root;
        int level;

        Pair(Node root, int level) {
            this.root = root;
            this.level = level;
        }
    }
    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
    public int getCount(Node node, int bud) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        int sum = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(node, 1));

        while (!queue.isEmpty()) {
            Pair currentPair = queue.poll();
            Node currentNode = currentPair.root;
            int currentLevel = currentPair.level;

            if (currentNode.left == null && currentNode.right == null) {
                count++;
                sum += currentLevel;
                if (sum > bud) {
                    return count - 1;
                }
                if (sum == bud) {
                    return count;
                }
            }

            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, currentLevel + 1));
            }
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, currentLevel + 1));
            }
        }

        return count;
    }
}
