package binarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 1;
        int high = nums[n-1] - nums[0];
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canPlace(nums, k, mid)){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

    private boolean canPlace(int[] nums, int k, int distance){
        int lastPosition = nums[0];
        int cows = 1;
        for(int i=1; i<nums.length; i++){
            if((nums[i]-lastPosition)>=distance){
                lastPosition=nums[i];
                cows++;
            }
            if(cows==k) return true;
        }
        return false;
    }
}
