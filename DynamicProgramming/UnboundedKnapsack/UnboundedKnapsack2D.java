package DynamicProgramming.UnboundedKnapsack;

public class UnboundedKnapsack2D {

    static int unboundedKnapsack(int[] wt, int[] val, int W){
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];

        for(int i=1; i<=n; i++){
            for(int w=1; w<=W; w++){
                dp[i][w]= dp[i-1][w]; //exclude 
                if(wt[i-1]<=w) dp[i][w] = Math.max( //include 
                    dp[i][w],
                    val[i-1] + dp[i][w-wt[i-1]]
                );
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;

        System.out.println(unboundedKnapsack(wt, val, W));
    }
}
