package tuf.leetcode.linkedList;
/*
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 //brute force
class Solution {
    private int lengthOfLL(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lengthLL = lengthOfLL(head);
        if(lengthLL==n) return head.next;
        ListNode temp = head;
        int pos = lengthLL-n;
        while(pos>1){
            temp = temp.next;
            pos--;
        }
        temp.next = temp.next.next;
        return head;
    }
}
//one pass : two pointer approach 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<n; i++) fast = fast.next;
        if(fast == null) return head.next; //delete head
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
*/

public class Leetcode19 {
    
}
