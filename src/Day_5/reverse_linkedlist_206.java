package Day_5;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) { val = x; }
}

public class reverse_linkedlist_206 {
    public ListNode3 reverseList(ListNode3 head) {
        ListNode3 prev = null;
        ListNode3 current = head;
        ListNode3 next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printList(ListNode3 head) {
        ListNode3 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode3 head = new ListNode3(1);
        head.next = new ListNode3(2);
        head.next.next = new ListNode3(3);
        head.next.next.next = new ListNode3(4);
        head.next.next.next.next = new ListNode3(5);

        System.out.print("Original List: ");
        printList(head);

        // Reversing the list
        reverse_linkedlist_206 solution = new reverse_linkedlist_206();
        ListNode3 reversedList = solution.reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversedList);
    }
}
