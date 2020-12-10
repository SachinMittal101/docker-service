package com.example.docker.linkedlist;

public class LoopInALinkedList {

    Node head;

    public static void main(String[] args) {
        LoopInALinkedList list = new LoopInALinkedList();

        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        list.head = new Node(10);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        final boolean loop = list.isLoop();
        System.out.println(loop);
    }

    private boolean isLoop() {
        Node slowPtr = head;
        Node fastPtr = head;

        int flag = 0;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            return true;
        } else {
            return false;
        }

    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
