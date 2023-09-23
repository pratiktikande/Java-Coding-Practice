package DSA.LinkedList;

public class AddInTheMiddle {

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

    //Add In The Middle 
    public void addmiddle(int index, int data){
        //Base case
        if(index == 0){
            addFirst(data);
            return;
        }
        //Create new Node
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        
        //Find Previous
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        //After getting previous Chnage Linkage 
        newNode.next=temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        AddInTheMiddle list = new AddInTheMiddle();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addmiddle(2, 9);
        list.printLinkedList();

    }
}
