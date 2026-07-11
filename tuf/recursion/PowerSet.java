import java.util.*;

public class PowerSet {
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, nums, new ArrayList<>(), 0);
        return ans;
    }

    private void solve(List<List<Integer>> ans,
                       int[] nums,
                       List<Integer> curr,
                       int index
                       ){
        //Base case
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //Include
        curr.add(nums[index]);
        solve(ans, nums, curr, index+1);
        //Remove
        curr.remove(curr.size()-1);
        //Exclude
        solve(ans, nums, curr, index+1);
    }
}
