public class KnapsackBottomUp {
    static int knapsack(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= wt[i - 1]) {
                    dp[i][j] = Math.max(
                            val[i - 1] + dp[i - 1][j - wt[i - 1]],
                            dp[i][j]);
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int wt[] = { 1, 2, 5, 7 };
        int val[] = { 1, 4, 2, 9 };
        int W = 8;
        System.out.println(knapsack(wt, val, W));
    }
}