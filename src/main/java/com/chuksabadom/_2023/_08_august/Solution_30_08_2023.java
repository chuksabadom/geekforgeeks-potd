package com.chuksabadom._2023._08_august;

public class Solution_30_08_2023 {
    Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }

        if (x == 1) {
            head = head.next;
            return head;
        }

        Node prev = getNodeAtIndex(head, x - 2);
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }

        return head;
    }

    private Node getNodeAtIndex(Node node, int index) {
        Node current = node;
        int count = 0;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        return current;
    }
    // Linklist node structure
    static class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}


