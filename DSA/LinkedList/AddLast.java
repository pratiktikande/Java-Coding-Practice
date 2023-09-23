package DSA.LinkedList;

public class AddLast {

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

    //We Will Create Methods To 
    //add data Last
    public void addLast(int data){
         //Create New Node
        Node newNode = new Node(data);

        //Base case
        if(head ==null){
            head=tail=newNode;
            return;
        }
        //step 2= tail.next = Newnode;
        tail.next=newNode;  //Link

        //Step3  = tail = new node
        tail= newNode;
    }

    public static void main(String[] args) {
        AddLast add = new AddLast();
        add.addLast(3);
        add.addLast(4);
    }
}
