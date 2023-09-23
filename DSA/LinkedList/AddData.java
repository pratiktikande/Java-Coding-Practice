package DSA.LinkedList;

public class AddData {

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
    //add data
    public void addFirst(int data){
         //Create New Node
        Node newNode = new Node(data);

        //Base case
        if(head ==null){
            head=tail=newNode;
            return;
        }
        //step 2= NewNode next =head;
        newNode.next=head;  //Link

        //Step3  = head = new node
        head= newNode;
    }

    public static void main(String[] args) {
        AddData add = new AddData();
        add.addFirst(1);
        add.addFirst(2);
    }
}
