package TCS.Others;

import java.util.LinkedList;

public class DetectALoopInLL {
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
    public static int size;
    
    public static boolean loopfinder(){
         // To detect A Loop or Cycle In LinkedList
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
         // Floyds Cycle Finding Algo(Slow-Fast Approach)
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                // Cycle Exists
                return true;
            }
        }
        // Cycle Does not exist
        return false;
    }
    // To detect A Loop or Cycle In LinkedList End
    public static void main(String[] args) {
        
        // LinkedList<Integer> ll = new LinkedList<>();
        head = new Node(1);
       head.next=new Node(2);
       head.next.next= new Node(3);
       head.next.next.next= head;
       // 1->2->3->1
       System.out.println(loopfinder());
    }
}
