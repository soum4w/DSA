package linkedList.doublyLL;

import java.util.ArrayList;
import java.util.List;

public class FindPairsWithGivenSum {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        if(head==null) return ans;
        ListNode low = head;
        ListNode high = head;
        while(high.next!=null) high = high.next;
        while(low!=null && high!=null && low!=high && low.prev != high){
            int sum = low.val + high.val;
            if(sum == target){
                List<Integer> pair = new ArrayList<>();
                pair.add(low.val);
                pair.add(high.val);
                ans.add(pair);
                low = low.next;
                high = high.prev;
            }
            else if (sum > target) high = high.prev;
            else low = low.next;
        }
        return ans;
    }
}
