package DSA.LinkedList;

public class CreateLinkedList {

    // create class Node
    public static class Node {
        int data;
        Node next; // class dataType

        // Constructor Of class
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //We Will Create Methods To 
    //add data
    //Delete data
    //Print
    //search

    public static void main(String[] args) {
        // CreateLinkedList ll = new CreateLinkedList();
        // // Manual Way To Add Data 
        // ll.head=new Node(1);
        // ll.head.next = new Node(2);
    }
}
