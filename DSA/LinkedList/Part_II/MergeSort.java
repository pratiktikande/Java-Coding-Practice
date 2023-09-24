package DSA.LinkedList.Part_II;

public class MergeSort extends RemoveACycleInALinkedList {

    // To Find mid Code
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid Node
    }

    // Merge Step Code
    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        // Append remaining elements if any
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return mergeLL.next;
    }

    // Merge Sort Steps Code
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // To Find Mid
        Node mid = getMid(head);

        // Left And right half
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printLinkedList();
        RemoveACycleInALinkedList.head = list.mergeSort(RemoveACycleInALinkedList.head);
        list.printLinkedList();
    }
}
