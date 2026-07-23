package linkedList.doublyLL;

public class RemoveDuplicates {
    public ListNode removeDuplicates(ListNode head) { // 1 1 3 3 4 5  -  1 3 4 5
        if(head == null) return head;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                ListNode duplicate = curr.next;
                curr.next = duplicate.next;
                if(duplicate.next != null) duplicate.next.prev = curr;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}

