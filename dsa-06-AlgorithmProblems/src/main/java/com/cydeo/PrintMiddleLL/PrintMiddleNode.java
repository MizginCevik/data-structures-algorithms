package com.cydeo.PrintMiddleLL;

public class PrintMiddleNode {

    public static void main(String[] args) {

        //Find the middle of a linked list in one pass.

        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        printMiddle(list);
    }
    public static void printMiddle(MySinglyLinkedList sll){
        // create two pointers
        Node slow = sll.head;
        Node fast = sll.head; //jumping double(x2)

        // iterate over the linked list
        while(fast != sll.tail && fast.next != sll.tail){ //don't know number of elements that's why while loop
            slow = slow.next; // single jump
            fast = fast.next.next; // double jump
        }

        // b is located either on tail or before tail
       if(fast==sll.tail) {
           System.out.println(slow.id); // on tail,odd number of nodes
       }else {
           System.out.println(slow.id + "," + slow.next.id); // before tail,even number of nodes
       }
    }

}
