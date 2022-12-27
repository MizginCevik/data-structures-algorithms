public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    public void add(int data) { // adding to the end
        Node node = new Node(data); // create a new node object from data

        if(isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in the list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) { // if this is the last element
                System.out.println(current.value + " => null");
            } else {
                System.out.print(current.value + " => ");
            }
            current = current.next;
        }
    }

    public void deleteById(int id) {
        if (isEmpty()) { // check if it is empty
            System.out.println("List is empty!!!");
        }

        Node prev = head; // assign prev and current with the head
        Node current = head;

        while (current != null) {
            if (current.value == id) { // there is a match
                if (current == head) { // if it is head
                    head = current.next;
                    current.next = null;
                } else if (current == tail) { // if it is tail
                    tail = prev;
                    prev.next = null; // Tail will be eligible for Garbage Collection
                } else { // if it in the middle
                    prev.next = current.next;
                    current.next = null; // Current will be eligible for Garbage Collection
                }
                // after deletion
                size--;
            }
            // move forward until find a match
            prev = current;
            current = current.next;
        }
    }

    public int indexOf(int id) {
        if (isEmpty()) {
            return -1;
        }
        int position = 0;
        Node current = head; // set my current with the starting element
        // iterate through the list
        while (current != null) {
            if (current.value == id) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }

    public void addFirst(int data) { // adding to the beginning
        Node node = new Node(data); // create a new node object from data
        if (isEmpty()) { // case 1: list is empty
            head = tail = node;
        } else { // case 2: list is not empty
            node.next = head;
            head = node;
        }
        size++; // increase size
    }

    public int getKthItemFromLast(int k) { // one pass: two pointer strategy or additional data structure
        // create two pointers
        Node ptr1 = head; // slow runner
        Node ptr2 = head; // fast runner

        // move ptr2 k-1 times or k times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element or hits the null (ptr2 != null)
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.value;
    }

    public void removeKthItemFromLast(int k) {
        // create three pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        // move ptr2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        // Do delete operation
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else if (ptr1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
    }

    public void removeKthFromLast2(int k) { // optimize solution
        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null) {
                System.out.println("Less than k elements");
            } else if (ptr2.next == null) {
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = ptr1.next.next;
        ptr1 = ptr1.next;
        ptr1 = null;
    }

}
