package leetcode.recursion;

import java.util.*;

public class Leetcode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int[] candidates,
                       int target,
                       int sum,
                       int index,
                       List<Integer> curr,
                       List<List<Integer>> ans){
        //Base case
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target || index==candidates.length) return;
        //Include
        curr.add(candidates[index]);
        solve(candidates, target, sum+candidates[index], index, curr, ans);
        //Remove
        curr.remove(curr.size()-1);
        //Exclude
        solve(candidates, target, sum, index+1, curr, ans);
    }
}
