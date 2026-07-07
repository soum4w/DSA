package tuf.leetcode.binarySearch;

/*
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low<high){
            int mid = low +(high-low)/2;
            if(mid%2==1) mid--; //make mid even 
            if(nums[mid]==nums[mid+1]) low = mid+2;
            else high = mid;
        }
        return nums[low];
    }
}
*/
//alternative approach with ^1 
/*
if value is even then value^1 = value + 1 
if value is odd then value^1 = value - 1

0^1 = 1
1^1 = 0

2^1 = 3
3^1 = 2

5^1 = 4
6^1 = 7
*/

public class Leetcode540{
    public int singleNonDuplicate(int[] nums){
        int low = 0, high = nums.length-1;
        while (low<high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == nums[mid^1]) low = mid + 1;
            else high = mid;
        }
        return nums[low];
    }
}


