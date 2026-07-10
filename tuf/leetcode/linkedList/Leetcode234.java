package tuf.leetcode.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// brute force 
/*
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.val!=stack.peek()) return false;
            stack.pop();
            temp = temp.next;
        }
        return true;
    }
}

optimal solution with TC: O(n) and SC: O(1)
Reverse the list from middle and then compare values

class Solution {
    private ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while( fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        ListNode secondHead = slow.next;
        //reverse the LL from secondHead
        secondHead = reverseLL(secondHead);
        while(secondHead!=null){
            if(head.val != secondHead.val) return false;
            head = head.next;
            secondHead = secondHead.next;
        }
        return true;
    }
}
*/

public class Leetcode234 {}