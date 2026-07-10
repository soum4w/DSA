/*
public class MergeTwoSortedLists {
    static ListNode mergeTwoSortedLists(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                dummy.next = temp1;
                temp1 = temp1.next;
            } else {
                dummy.next = temp2;
                temp2 = temp2.next;
            }
            dummy = dummy.next;
        }

        while (temp1 != null) {
            dummy.next = temp1;
            dummy = dummy.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            dummy.next = temp2;
            dummy = dummy.next;
            temp2 = temp2.next;
        }

        return head.next;
    }

}
*/