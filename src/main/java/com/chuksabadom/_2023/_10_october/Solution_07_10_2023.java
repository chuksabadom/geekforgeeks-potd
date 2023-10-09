package com.chuksabadom._2023._10_october;

public class Solution_07_10_2023 {
    static class Node {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        Node dummy = new Node(-1);
        dummy.next= head;
        Node previous = dummy;

        while(previous.next!=null && previous.next.next!=null){
            Node first = previous.next;
            Node second = previous.next.next;

            first.next=second.next;
            second.next=first;
            previous.next=second;
            previous = first;
        }

        return dummy.next;
    }
}
