package tuf.leetcode.binarySearch;

//the min element must be in the unsorted part, where nums[i] > nums[i+1]

class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        while (low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[high]){ //right side is unsorted
                low = mid +1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
