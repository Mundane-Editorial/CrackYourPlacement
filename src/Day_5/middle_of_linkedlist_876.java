package Day_5;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class middle_of_linkedlist_876 {

    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;

        // Calculate the size of the linked list
        while (current != null) {
            size++;
            current = current.next;
        }

        ListNode turtle = head;
        ListNode hare = head;

        // Move hare by two steps and turtle by one step
        while(hare != null && hare.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
        }

        return turtle;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        middle_of_linkedlist_876 solution = new middle_of_linkedlist_876();
        ListNode middle = solution.middleNode(head);

        System.out.println("The middle node value is: " + middle.val);
    }
}
