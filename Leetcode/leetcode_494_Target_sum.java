package Leetcode;

// sum of s1 - sum of s2 = diff
// sum of s1 + sum of s2 = total of array
// sum of s1 = (diff + total of array)/2;
//then we need to find how many possible ways are there to find sum of s1 

class leetcode_494_Target_sum {

    static int countSubsetSum(int[] arr, int target){
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];
        dp[0][0]=1;
        for(int i=1; i<=n; i++){
            for(int sum=0; sum<=target; sum++){
                dp[i][sum] = dp[i-1][sum];
                if(arr[i-1]<=sum) dp[i][sum] += dp[i-1][sum-arr[i-1]];
            }
        }
        return dp[n][target];
    }

    public int findTargetSumWays(int[] nums, int target) {
        int totalOfArray = 0;
        for(int ele:nums) totalOfArray+=ele;
        if(Math.abs(target)>totalOfArray) return 0;
        if((target+totalOfArray)%2!=0) return 0;
        int sumOfS1 = (target+totalOfArray)/2; //subset sum or sum of subset s1
        return countSubsetSum(nums, sumOfS1);
    }
}


