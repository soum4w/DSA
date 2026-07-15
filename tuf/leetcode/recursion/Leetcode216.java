package leetcode.recursion;

import java.util.List;
import java.util.ArrayList;

public class Leetcode216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int start, int k, int n, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==k && 0 == n) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i<=9; i++){
            if(i>n) break;
            curr.add(i);
            solve(i+1, k, n-i, curr, ans);
            curr.remove(curr.size()-1);
        }
    }
}
