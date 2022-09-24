package com.cydeo.ReverseLinkedList;

public class Solution {

    public static void main(String[] args) {

        //Reverse the nodes of a singly linked list in one pass:

        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.printNodes(); //before reversing

        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();

    }

    static void reverse(MySinglyLinkedList list) {
        //Create two pointers
        Node prev = list.head;
        Node current = list.head.next;

        //while loop to iterate until curr=null
        while (current != null) {
            Node nextNode = current.next; //We need a third variable to keep the track of third node
            current.next = prev; //change direction of current to prev
            prev = current; //move prev to right to the current
            current = nextNode; //move current to right on the next node
        }

        //now adjust tail and head
        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;

    }

}
