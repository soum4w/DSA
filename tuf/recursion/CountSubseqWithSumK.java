public class CountSubseqWithSumK {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
        return solve(nums, k, 0, 0);
    }

    private int solve(int[] nums, int k, int sum, int index){
        //Base case
        if(index==nums.length){
            if(sum==k) return 1;
            return 0;
        }
        //Include
        int include = solve(nums, k, sum+nums[index], index+1);
        int exclude = solve(nums, k, sum, index+1);
        return include+exclude;
    }
}
