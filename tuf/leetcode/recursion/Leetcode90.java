package leetcode.recursion;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Leetcode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        for(int i=index; i<nums.length; i++){
            if(index<i && nums[i] == nums[i-1]) continue;
            //Include
            curr.add(nums[i]);
            solve(i+1, nums, curr, ans);
            //Exclude
            curr.remove(curr.size()-1);
        }
    }
}
