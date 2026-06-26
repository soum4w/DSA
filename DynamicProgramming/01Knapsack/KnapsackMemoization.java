//top - down = recursion + memoization
// buttom - up = tabulation

import java.util.Arrays;

public class KnapsackMemoization {
    static int knapsack(int[] wt, int[] val, int W, int n, int[][] dp){
        if(n==0||W==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];
        if(W>=wt[n-1])
            dp[n][W] = Math.max(
                val[n-1]+ knapsack(wt, val, W-wt[n-1], n-1, dp),
                knapsack(wt, val, W, n-1, dp)
            );
        else 
            dp[n][W] = knapsack(wt, val, W, n-1, dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int wt[] = {1,2,4,5};
        int val[] = {1,3,5,7};
        int n = 4;
        int W = 7;
        int dp[][] = new int[n+1][W+1];
        for(int[] row : dp) Arrays.fill(row, -1);;
        System.out.println(knapsack(wt, val, W, n, dp));
    }
}
