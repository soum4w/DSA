//count the number of subsets available in the given array that makes the given sum (adding all the elements of the subset)

public class CountSubsetSum {
    static int countSubsetSum(int[] arr, int target){
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<=n; i++){
            for(int sum=1; sum<=target; sum++){
                dp[i][sum] = dp[i-1][sum];                             //excluding the current element
                if(arr[i-1]<=sum) dp[i][sum] += dp[i-1][sum-arr[i-1]]; //including the current element
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,1,10,4,8};
        int sum = 10;
        System.out.println(countSubsetSum(arr, sum));
    }
}
