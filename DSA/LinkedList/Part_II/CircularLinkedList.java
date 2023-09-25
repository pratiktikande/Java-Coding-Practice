package DSA.LinkedList.Part_II;

// A circular linked list is similar to a regular linked list, but the last node in the list points back to the
//  first node instead of having a null reference. This creates a loop, and you can traverse the list indefinitely.

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point back to itself to create the circular link
        } else {
            tail.next = newNode; // Link the current tail node to the new node
            tail = newNode;      // Update the tail to the new node
            newNode.next = head; // Point back to the head to create the circular link
        }
    }

    // Method to display the elements of the list
    public void display() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Circular Linked List:");
        list.display();
    }
}
