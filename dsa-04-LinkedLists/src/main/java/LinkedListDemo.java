public class LinkedListDemo {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        System.out.println(node1);
        System.out.println(node1.next); // null because it's not linked yet

        //point them each other:
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(node1);
        System.out.println(node1.next);
        System.out.println(node1.next.value);

        System.out.println("Node1's address is: " + node1 + " Node1's next address is: " + node1.next);
        System.out.println("Node2's address is: " + node2 + " Node2's next address is: " + node2.next);
        System.out.println("Node3's address is: " + node3 + " Node3's next address is: " + node3.next);
        System.out.println("Node4's address is: " + node4 + " Node4's next address is: " + node4.next);

        // Iteration
        Node current; // temp value
        Node head = node1;
        current = head;

        while (current != null) {
            System.out.println("Value of node is: " + current.value);
            current=current.next;
        }

    }
}
