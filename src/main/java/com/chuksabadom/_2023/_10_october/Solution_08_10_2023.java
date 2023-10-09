package com.chuksabadom._2023._10_october;

public class Solution_08_10_2023 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node sortedInsert(Node head1, int key) {
            Node newNode = new Node(key);
            if(head1 == null || key <= head1.data){
                newNode.next = head1;
                return newNode;
            }
            Node currentNode = head1;
            //Node prev = null;
            while(currentNode.next != null && currentNode.next.data < key){
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            return head1;
        }

        public static void main(String[] args) {
            // Example usage:
            Node head = null;
            head = sortedInsert(head, 5);
            head = sortedInsert(head, 3);
            head = sortedInsert(head, 7);
            head = sortedInsert(head, 1);

            // Printing the sorted linked list
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
