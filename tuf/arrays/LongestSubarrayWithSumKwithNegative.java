package tuf.arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumKwithNegative {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int currSum = 0;
        int maxLen = 0;
        for(int i=0; i<n; i++){
            // Case 1: If the sum from the beginning equals K
            currSum += nums[i];
            if(currSum == k){
                maxLen = i+1;
            }
            // Case 2: Check if (currentSum - k) exists in the map
            if(map.containsKey(currSum-k)){
                int prevIndex = map.get(currSum-k);
                maxLen = Math.max(maxLen, i-prevIndex);
            }
            // Case 3: Only add currentSum to the map if it doesn't exist.
            // This ensures we keep the earliest index for the maximum length.
            if(!map.containsKey(currSum)){ //map.putIfAbsent(currSum, i);
                map.put(currSum, i);
            }
        }
        return maxLen;
    }
}
