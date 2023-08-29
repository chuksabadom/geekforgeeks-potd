package com.chuksabadom._2023._08_august;

public class Solution_29_08_2023 {
    Node compute(Node head)
    {
        // your code here
        head = reverseList(head);
        Node currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.data > currentNode.next.data) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return reverseList(head);
    }

    private Node reverseList(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }
    static class Node {
        int data;
        Solution_29_08_2023.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
