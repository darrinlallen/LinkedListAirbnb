package com.solvd;
import com.solvd.ListNode;

public class LinkedList<T> {
    public ListNode<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Add data at the beginning of the linked list
    public void Beginning(T val) {
        ListNode<T> newNode = new ListNode<T>(val);
        newNode.next = this.head;
        this.head = newNode;
    }

    // Add data at the end of the linked list
    public void End(T val) {
        ListNode<T> newNode = new ListNode<T>(val);
        if (this.head == null) {
            this.head = newNode;
        } else {
            ListNode<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add data at a specified index in the linked list
    public void addPosition(int index, T val) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative: " + index);
        }
        ListNode<T> newNode = new ListNode<T>(val);
        if (index == 0) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            ListNode<T> current = this.head;
            int i = 0;
            while (i < index - 1 && current != null) {
                current = current.next;
                i++;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printLinkedList() {
        ListNode<T> current = this.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

