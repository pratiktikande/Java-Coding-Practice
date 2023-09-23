package DSA.LinkedList;

public class PrintLinkedList {

    public static class Node {
        int data;
        Node next;

        // Constructor Of class
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // We Will Create Methods To
    // add data at the beginning
    public void addFirst(int data) {
        // Create a new Node
        Node newNode = new Node(data);

        // Base case: If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Otherwise, link the new node to the current head and update the head
        newNode.next = head;
        head = newNode;
    }

    // add data at the end
    public void addLast(int data) {
        // Create a new Node
        Node newNode = new Node(data);

        // Base case: If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Otherwise, link the current tail to the new node and update the tail
        tail.next = newNode;
        tail = newNode;
    }

    // To Print LinkedList
    public void printLinkedList() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        PrintLinkedList list = new PrintLinkedList(); // Changed from AddData and AddLast
        list.printLinkedList();
        list.addFirst(1);
        list.printLinkedList();
        list.addFirst(2);
        list.printLinkedList();
        list.addLast(3); // Changed from addLast
        list.printLinkedList();
        list.addLast(4); // Changed from addLast
        list.printLinkedList();
    }
}
