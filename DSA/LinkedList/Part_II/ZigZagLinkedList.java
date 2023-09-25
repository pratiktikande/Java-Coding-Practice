package DSA.LinkedList.Part_II;

public class ZigZagLinkedList extends RemoveACycleInALinkedList {
    
    // Zig-Zag LinkedList Code Starts
    public void zigZag() {
        // Step 1 find Mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternative Merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
    }
    public static void main(String[] args) {
        ZigZagLinkedList list = new ZigZagLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printLinkedList();
        list.zigZag();
        list.printLinkedList();
    }
}
