package com.chuksabadom._2023._08_august;

import org.w3c.dom.Node;

public class Solution_28_08_2023 {
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
