package tuf.leetcode.arrays;

public class Leetcode1752 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int peak = 0;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                peak++;
            }
        }
        return peak<=1;
    }
}

/*
//Brute Force 
sort the array and check after every rotation

//Brute Force 
store the sorted array 
then compare index 0 with index 1 , index 1 with index 2 , basically (i+k)%n and do it for each rotation

//Optimal 
suppose array is [3,4,5,1,2] : 
here only one peak is there 5->1 and rest are in increasing manner (even 2->3)
so if peak>1 that means it's not sorted 
so we will compare arr[i]<arr[(i+1)%n] :> %n for rotating to the first element 
*/