package com.clone.LinkedList;

import com.clone.PropertyType.Cabin;

import java.util.logging.Logger;

public class LinkedListAvailableRooms <T> {

    private Node<T> head;
    private int cnt;
    private static Logger logger = Logger.getLogger(String.valueOf(Cabin.class));

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    private static class Node<T> {
        T rooms;
        Node<T> next;

        Node(T rooms) {
            this.rooms = rooms;
            next = null;
        }
    }

    public void addBeginning(T rooms) {
        Node<T> newNode = new Node<>(rooms);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

        setCnt(getCnt() + 1);
    }

    public void addEnd(T rooms) {
        Node<T> newNode = new Node<>(rooms);

        if (head == null) {
            head = new Node(rooms);
            return;
        }

        newNode.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;


    setCnt(getCnt() + 1);
}

        public void addMiddle(T rooms, int position) {
            if (position < 0 || position > getCnt()) {
                throw new IndexOutOfBoundsException("Error " + position);
            }

            Node<T> newNode = new Node<>(rooms);

            if (head == null) {
                head = newNode;
            } else if (position == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node<T> currentNode = head;
                int currentPosition = 0;

                while (currentPosition < position - 1) {
                    currentNode = currentNode.next;
                    currentPosition++;
                }

                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }

            setCnt(getCnt() + 1);
        }
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            logger.info("List is empty");
            return;
        }
        logger.info("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            logger.info(current.rooms + " ");
            current = current.next;
        }
        logger.info("");
    }
}
