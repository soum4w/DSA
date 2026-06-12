package DynamicProgramming.UnboundedKnapsack;

public class CoinChange1 {

    static int coinChange(int[] coins, int target){
        int n = coins.length;
        int[][] dp = new int[n+1][target+1];
        for(int i=0; i<=n; i++) dp[i][0] = 1;
        for(int i=1; i<=n; i++){
            for(int sum=1; sum<=target; sum++){
                dp[i][sum] = dp[i-1][sum];//excluding the current element
                if(coins[i-1]<=sum) dp[i][sum] += dp[i][sum-coins[i-1]];
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 5;
        System.out.println(coinChange(coins, sum));
    }
}
