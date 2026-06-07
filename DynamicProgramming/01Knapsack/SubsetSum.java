public class SubsetSum {

    static boolean subsetSum(int[] arr, int target) {
        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Sum 0 is always possible (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= target; sum++) {
                
                dp[i][sum] = dp[i - 1][sum];  // Exclude current element

                if (arr[i - 1] <= sum) {     // Include current element if possible
                    dp[i][sum] =
                        dp[i][sum] || dp[i - 1][sum - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        int target = 9;

        System.out.println(subsetSum(arr, target));
    }
}