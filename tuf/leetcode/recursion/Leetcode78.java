package leetcode.recursion;

import java.util.*;

public class Leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(0, new ArrayList<>(), ans, nums);
        return ans;
    }

    private void solve(int index, List<Integer> curr, List<List<Integer>> ans, int[] nums){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //Include
        curr.add(nums[index]);
        solve(index+1, curr, ans, nums);
        //Exclude
        curr.remove(curr.size()-1);
        solve(index+1, curr, ans, nums);
    }
}