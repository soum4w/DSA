package tuf.binarySearch;

class Solution {
    //finding leftPosition
    static int leftPosition(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int leftPosition = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target) low = mid+1;
            else if (nums[mid]>target) high = mid-1;
            else {
                leftPosition = mid;
                high = mid-1;
            }
        }
        return leftPosition;
    }

    //finding right position
    static int rightPosition(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int rightPosition = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target) low = mid+1;
            else if(nums[mid]>target) high = mid -1;
            else{
                rightPosition = mid;
                low = mid+1;
            }
        }
        return rightPosition;
    }

    public int countOccurrences(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = leftPosition(nums, target);
        ans[1] = rightPosition(nums, target);
        return (ans[1]- ans[0])+1;
    }
}