

public class Leetcode160app1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        int lenA = getLen(p1);
        int lenB = getLen(p2);
        if(lenA>lenB){
            int diff = lenA-lenB;
            while(diff-- > 0) p1 = p1.next;
        } else {
            int diff = lenB - lenA;
            while(diff-- > 0) p2 = p2.next;
        }
        while(p1!=null && p2!=null){
            if(p1==p2) return p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }

    private int getLen(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
