import java.util.*;

public class SubSet1 {
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        solve(0, 0, nums, ans);
        return ans;
    }

    private void solve(int index, int sum, int[] nums, List<Integer> ans){
        if(index==nums.length){
            ans.add(sum);
            return;
        }
        //Include current element
        solve(index + 1, sum + nums[index], nums, ans);
        solve(index+1, sum, nums, ans);
    }
}
