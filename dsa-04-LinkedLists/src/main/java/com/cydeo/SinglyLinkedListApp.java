package com.cydeo;

public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();

        myList.deleteById(9);
        myList.printNodes();

        System.out.println(myList.indexOf(0));

        System.out.println("kth item from the last: " + myList.getKthItemFromLast(3));
        myList.removeKthItemFromLast(3);
        myList.printNodes();

        System.out.println("---------");

        MySinglyLinkedList myList1 = new MySinglyLinkedList();
        MySinglyLinkedList myList2 = new MySinglyLinkedList();
        myList1.add(1);
        myList1.add(3);
        myList1.add(6);
        myList1.add(7);
        myList2.add(2);
        myList2.add(4);
        myList2.add(5);

        Node newHead = MergeTwoLinkedList.mergeLinkedLists(myList1.head, myList2.head);

        while (newHead != null) {
            System.out.println(newHead.id);
            newHead = newHead.next;
        }

    }
}
