package tuf.arrays;

import java.util.*;

public class CheckIfSorted {
    static boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        for(int i=0; i<nums.size()-1; i++){
            if(!(nums.get(i)<nums.get(i+1))) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,4,3,4,5));
        System.out.println(isSorted(list));
    }
}

/*
Check if the Array is Sorted II

Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

Example 1

Input : nums = [1, 2, 3, 4, 5]

Output : true

Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.

Example 2

Input : nums = [1, 2, 1, 4, 5]

Output : false

Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.
*/