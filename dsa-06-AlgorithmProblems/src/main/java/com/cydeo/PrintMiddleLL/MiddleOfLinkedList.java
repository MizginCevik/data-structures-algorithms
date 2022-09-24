package com.cydeo.PrintMiddleLL;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;

        while (b.next!=null && b.next.next!=null){
            a=a.next;
            b=b.next.next;
        }

        if (b.next==null){
            return a;
        }else{
            return a.next;
        }
    }

    class ListNode {
        int value;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }


}
