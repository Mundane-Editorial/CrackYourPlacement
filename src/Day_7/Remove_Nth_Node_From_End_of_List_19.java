package Day_7;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Remove_Nth_Node_From_End_of_List_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        // Removing the 2nd node from the end (4)
        Remove_Nth_Node_From_End_of_List_19 solution = new Remove_Nth_Node_From_End_of_List_19();
        ListNode modifiedList = solution.removeNthFromEnd(head, 2);

        System.out.print("Modified List: ");
        printList(modifiedList);
    }
}
