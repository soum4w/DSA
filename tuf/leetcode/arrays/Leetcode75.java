//Dutch National Flag Algorithm

package tuf.leetcode.arrays;

class Solution {
    static void swap(int[]arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length -1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}

