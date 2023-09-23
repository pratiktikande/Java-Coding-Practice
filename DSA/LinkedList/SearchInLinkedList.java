package DSA.LinkedList;

public class SearchInLinkedList {

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
    public static int size; // Added size to keep track of the linked list size

    // We Will Create Methods To
    // add data at the beginning
    public void addFirst(int data) {
        // Create a new Node
        Node newNode = new Node(data);

        // Base case: If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            size = 1; // Update size
            return;
        }
        // Otherwise, link the new node to the current head and update the head
        newNode.next = head;
        head = newNode;
        size++; // Increment size
    }

    // add data at the end
    public void addLast(int data) {
        // Create a new Node
        Node newNode = new Node(data);

        // Base case: If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            size = 1; // Update size
            return;
        }

        // Otherwise, link the current tail to the new node and update the tail
        tail.next = newNode;
        tail = newNode;
        size++; // Increment size
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

    // Add In The Middle
    public void addMiddle(int index, int data) {
        // Base case
        if (index == 0) {
            addFirst(data);
            return;
        }
        // Create new Node
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        // Find Previous
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // After getting previous, Change Linkage
        newNode.next = temp.next;
        temp.next = newNode;
        size++; // Increment size
    }

    // Remove First LinkedList
    public int removeFirst() {
        // Base Case: If LinkedList Is empty
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--; // Decrement size
        return val;
    }

    public int removeLast() {
        // Base Case: If LinkedList Is empty
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        // If size is 1, delete head and tail
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Remove Last LinkedList
        // previous = i = size - 2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--; // Decrement size
        return val;
    }

    //Search In Linked List
    public int iterativeSearch(int key){
        //Initiation
        Node temp = head;
        int i=0;

        //Travel Start To end
        while(temp!= null){
            //Check Index Value with Key
            if(temp.data == key){
                return i;
            }
            //Increment
            temp = temp.next;
            i++;
        }
        //If Not Found Key
        return -1;
    }

    public static void main(String[] args) {
        SearchInLinkedList list = new SearchInLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(4);
        list.addLast(5);
        list.addMiddle(2, 3);
        list.printLinkedList();
        System.out.println(list.iterativeSearch(3));
        System.out.println(list.iterativeSearch(10));

    }
}
