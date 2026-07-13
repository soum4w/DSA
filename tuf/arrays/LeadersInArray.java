package arrays;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class LeadersInArray {
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int maxRight = Integer.MIN_VALUE;
        for(int i= n-1; i>=0; i--){
            if(nums[i]>maxRight){
                ans.add(nums[i]);
                maxRight = nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}