//Longest subarray with given sum K (positives)

package tuf.arrays;

class Solution {
    public int longestSubarrayWithSumK(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink window if sum exceeds k
            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            // Check if current window sums to k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}

