public class SubseqWithSumKExists {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        //your code goes here
        return solve(nums, k, 0, 0);
    }

    private boolean solve(int[] nums, int k, int index, int sum){
        if(index==nums.length) return sum==k;
        if(solve(nums, k, index+1, sum+nums[index])) return true;
        return solve(nums, k, index+1, sum);
    }
}
