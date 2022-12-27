public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();

        myList.deleteById(9); // delete the tail
        myList.printNodes();
        myList.deleteById(6); // delete item in the middle
        myList.printNodes();
        myList.deleteById(0); // delete the head
        myList.printNodes();

        System.out.println(myList.indexOf(5));

        System.out.println("kth item from the last: " + myList.getKthItemFromLast(3));
        myList.removeKthItemFromLast(3);
        myList.printNodes();

        myList.removeKthFromLast2(2);
        myList.printNodes();

    }
}
