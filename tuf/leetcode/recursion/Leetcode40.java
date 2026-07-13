package leetcode.recursion;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Leetcode40 {
}

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int[] candidates, int target, int index, List<Integer> curr, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            curr.add(candidates[i]);
            solve(candidates, target-candidates[i], i+1, curr, ans);
            curr.remove(curr.size()-1);
        }
    }
}