package DSA.LinkedList.Part_II;

public class RemoveACycleInALinkedList {

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

    // Search In Linked List
    public int iterativeSearch(int key) {
        // Initiation
        Node temp = head;
        int i = 0;

        // Travel Start To end
        while (temp != null) {
            // Check Index Value with Key
            if (temp.data == key) {
                return i;
            }
            // Increment
            temp = temp.next;
            i++;
        }
        // If Not Found Key
        return -1;
    }

    // Created Helper For Recursion
    public int helper(Node head, int key) {
        // Base Case
        if (head == null) {
            return -1;
        }

        // check key found or not
        if (head.data == key) {
            return 0;
        }
        // Call Recursion
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        // Adding +1 To Previous Head Node Till Become Head Node
        return index + 1;
    }

    // Recursion call
    public int recusrsionSearch(int key) {
        return helper(head, key);
    }

    // To Reverse The LinkedList(Iterative)
    public void revsere() {
        // 3 variable
        Node prev = null;
        Node current = tail = head;
        Node next;

        // 4 steps
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Find And Remove Nth Node From End(Iterative approach)
    public void deleteNthNode(int n) {
        // Calculate Size of the LinkedList
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Base Case (Corner Case)
        if (n == size) {
            // Remove first
            head = head.next;
            return;
        }
        // Go To Size-N
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // To Check Palindrome
    // Step 1 :- Find mid
    // Step 2:- Reverse Second Half
    // Step 3 :- Compare With First Half

    // Step 1 To Calculate Mid Of LinkedList
    // We Use Slow-Fast Approach For It
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Increase by +1
            fast = fast.next.next; // Increase By +2
        }
        return slow; // slow is my Mid Node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Step 1 To Calculate Mid Of LinkedList
        // We Use Slow-Fast Approach For It
        Node midNode = findMid(head); // Call findMid
        // Step 2 To Reverse 2nd Half (3 varible , 4 step)
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // Right Half Head
        Node left = head;

        // Step 3 :- Check Left half & Right Half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    // To Check Palindrome End Here

    // To detect A Loop or Cycle In LinkedList
    public static boolean isCycle() {
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

    // To Remove A Loop/Cycle In LinkedList
    public static void removecycle() {
        // Step 1 detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true; // Cycle Exists
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // Find Meeting point
        slow = head; // Send again to head
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next; // +!
            fast = fast.next; // +1
        }
        // remove cycle -> last.next=null;
        prev.next = null;
    }
    // To Remove A Loop/Cycle In LinkedList end Here

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next= temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2
        System.out.println(isCycle());
        removecycle();
        System.out.println(isCycle());
    }
}
