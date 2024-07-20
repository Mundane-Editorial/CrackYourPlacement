package Day_5;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}

public class merge_two_sortedlist_21 {

    public static ListNode2 mergeTwoLists(ListNode2 list1, ListNode2 list2) {
        ListNode2 temp = new ListNode2(0);
        ListNode2 current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null)
            current.next = list1;
        else
            current.next = list2;

        return temp.next;
    }

    public static void printList(ListNode2 head) {
        ListNode2 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating first sorted list: 1 -> 3 -> 5
        ListNode2 list1 = new ListNode2(1);
        list1.next = new ListNode2(3);
        list1.next.next = new ListNode2(5);

        // Creating second sorted list: 2 -> 4 -> 6
        ListNode2 list2 = new ListNode2(2);
        list2.next = new ListNode2(4);
        list2.next.next = new ListNode2(6);

        // Merging the lists
        ListNode2 mergedList = mergeTwoLists(list1, list2);

        // Printing the merged list
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}
