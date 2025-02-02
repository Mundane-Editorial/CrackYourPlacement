package Day_4;

public class linked_list_cycle_141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        System.out.println(isCycle(head));
    }

    private static boolean isCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (turtle == hare) {
                return true;
            }
        }
        return false;
    }
}
