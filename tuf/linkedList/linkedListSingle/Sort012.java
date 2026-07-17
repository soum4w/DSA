package linkedList.linkedListSingle;

public class Sort012 {
    public ListNode sortList(ListNode head) {
        // YOUR CODE GOES HERE
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        ListNode curr = head;
        
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;

        while(curr!=null){
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
            }
            else if(curr.data == 1){
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        zero.next = (oneHead.next==null)?twoHead.next : oneHead.next;
        one.next = twoHead.next;
        two.next = null;

        if(zeroHead.next!=null) return zeroHead.next;
        else if(oneHead.next != null) return oneHead.next;
        else return twoHead.next;
    }
}