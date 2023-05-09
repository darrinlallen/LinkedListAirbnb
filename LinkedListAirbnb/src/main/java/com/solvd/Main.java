package com.solvd;

public class Main {
    public static void main(String[] args) {

            LinkedList<Integer> Numbers = new LinkedList<Integer>();
            Numbers.Beginning(100);
            Numbers.End(200);
            Numbers.addPosition(2, 500);
            Numbers.printLinkedList();

            LinkedList<String> Words = new LinkedList<String>();
            Words.End("cabin");
            Words.Beginning("barn");
            Words.printLinkedList();
        }
    }
