package tuf.leetcode.binarySearch;

class Solution {
    static int divisionSum(int[] nums, int divisor){
        int sum=0;
        for(int num:nums){
            sum+= (num+divisor-1) / divisor;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int num:nums){
            high = Math.max(high, num);
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(divisionSum(nums, mid)>threshold){
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

public class Leetcode1283 {
    
}
