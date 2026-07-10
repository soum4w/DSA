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

 //brute force 
 class Solution {
 public ListNode sortList(ListNode head) {
 int n = 0;
 ListNode temp = head;
 while(temp!=null){
 n++;
 temp=temp.next;
 }
 int[] arr = new int[n];
 temp = head;
 for(int i=0; i<n; i++){
 arr[i] = temp.val;
 temp=temp.next;
 }
 Arrays.sort(arr);
 temp=head;
 for(int i=0; i<n; i++){
 temp.val = arr[i];
 temp=temp.next;
 }
 return head;
 }
 }

class Solution {
    private ListNode mergeTwoSortedList(ListNode list1, ListNode list2){
        ListNode dummyNode = new ListNode(-1);
        ListNode tail = dummyNode;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1!=null) tail.next = list1;
        if(list2!=null) tail.next = list2;
        return dummyNode.next;
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(secondHalf);

        return mergeTwoSortedList(left, right);
    }
}

 */