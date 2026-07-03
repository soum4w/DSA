package tuf.leetcode.binarySearch;

class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return true;
            // Edge Case: When duplicates make it impossible to know which half is sorted
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){ //check if left part is sorted
                if(nums[low]<=target && nums[mid]>target){
                    high = mid -1;
                } else {
                    low = mid + 1;
                }
            } else { //right part sorted
                if(nums[mid] < target && nums[high]>=target){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return false;
    }
}