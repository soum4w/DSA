package leetcode.binarySearch;

public class Leetcode410 {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num:nums){
            low = Math.max(num, low);
            high+=num;
        }
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(nums, k, mid)){
                ans = mid;
                high= mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] nums, int k, int maxSum){
        int subArrays = 1;
        int sum = 0;
        for(int num:nums){
            if(sum+num<=maxSum){
                sum+=num;
            } else {
                subArrays++;
                sum=num;
                if(subArrays>k) return false;
            }
        }
        return true;
    }
}
