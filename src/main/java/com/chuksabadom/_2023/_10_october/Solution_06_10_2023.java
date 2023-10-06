package com.chuksabadom._2023._10_october;

public class Solution_06_10_2023 {
    static class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    public static void rearrange(Node odd) {
        Node even = odd.next;
        Node odd_pointer = odd;
        Node even_head = even;
        while(even!=null && even.next!=null){
            odd_pointer.next = odd_pointer.next.next;
            even.next = even.next.next;
            odd_pointer = odd_pointer.next;
            even = even.next;
        }
        even_head = reverse(even_head);
        odd_pointer.next = even_head;
    }
    //function for reverse list
    public static Node reverse(Node head)
    {
        Node current = head;
        Node previous = null;
        Node temp;
        while(current!=null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}
