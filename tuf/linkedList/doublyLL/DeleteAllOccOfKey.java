package linkedList.doublyLL;



public class DeleteAllOccOfKey {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        ListNode curr = head;
        while(curr!=null){
            if(curr.val==target){
                ListNode nextNode = curr.next;
                //check if head
                if(curr.prev==null) head= head.next;
                else curr.prev.next = curr.next;

                //last node
                if(curr.next!=null) curr.next.prev = curr.prev;
                curr = nextNode;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}



//------------------ListNode--------------------------//
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}