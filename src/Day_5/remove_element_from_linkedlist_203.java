package Day_5;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int x) { val = x; }
    ListNode1(int x, ListNode1 next) { val = x; this.next = next; }
}

public class remove_element_from_linkedlist_203 {
    public ListNode1 removeElements(ListNode1 head, int val) {
        ListNode1 temp = new ListNode1();
        ListNode1 curr = temp;

        temp.next = head;

        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {
        //linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(6);
        head.next.next.next = new ListNode1(3);
        head.next.next.next.next = new ListNode1(4);
        head.next.next.next.next.next = new ListNode1(5);
        head.next.next.next.next.next.next = new ListNode1(6);

        remove_element_from_linkedlist_203 solution = new remove_element_from_linkedlist_203();
        ListNode1 newHead = solution.removeElements(head, 6);

        ListNode1 current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
