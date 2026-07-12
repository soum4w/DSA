package leetcode.arrays;

public class Leetcode31 {
}

class Solution {
    public void nextPermutation(int[] nums) {
        //find the pivot
        int n = nums.length;
        int pivot = -1;
        for(int i= n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums, 0, n-1);
            return;
        }
        //swap pivot with greater than pivot
        for(int i=n-1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }
        //reverse
        reverse(nums, pivot+1, n-1);

    }

    private void reverse(int[] nums, int left, int right){
        while(left<right){
            swap(nums, left, right);
            left++; right--;
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}