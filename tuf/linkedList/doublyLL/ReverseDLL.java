// /*
// class ListNode {
//     int data;
//     ListNode prev, next;
//     ListNode(int val) {
//         this.data = val;
//         this.prev = null;
//         this.next = null;
//     }
// }
// */

// class Solution {
//     public ListNode reverseDLL(ListNode head) {
//         // Your code goes here
//         if(head==null || head.next==null) return head;
//         ListNode temp = null;
//         ListNode curr = head;
//         while(curr!=null){
//             temp = curr.prev;
//             curr.prev = curr.next;
//             curr.next = temp;

//             curr = curr.prev;
//         }
//         return temp.prev;
//     }
// }

// // null<-1<->2<->3->null