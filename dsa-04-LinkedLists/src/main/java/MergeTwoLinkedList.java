public class MergeTwoLinkedList {

    public static void main(String[] args) {
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
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }
    public static Node mergeLinkedLists(Node headOne, Node headTwo) {
        Node p1 = headOne;
        Node p1Prev = null;
        Node p2 = headTwo;

        while (p1 != null && p2 != null) {
            if (p1.value < p2.value) {
                p1Prev = p1;
                p1 = p1.next;
            } else {
                if (p1Prev != null) {
                    p1Prev.next = p2;
                }
                p1Prev = p2;
                p2 = p2.next;
                p1Prev.next = p1;
            }
        }
        if (p1 == null) {
            p1Prev.next = p2;
        }
        return headOne.value < headTwo.value ? headOne : headTwo;
    }
}
