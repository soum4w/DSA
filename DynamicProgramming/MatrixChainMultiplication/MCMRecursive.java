package DynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class MCMRecursive {

    static int[][] dp;

    static int mcmRecursive(int[] arr, int i, int j){
        if(i>=j) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int leftCost = mcmRecursive(arr, i, k);
            int rightCost = mcmRecursive(arr, k+1, j);
            int cost = leftCost + rightCost + arr[i-1] * arr[k] * arr[j];
            minCost = Math.min(cost, minCost);
        }
        return dp[i][j] = minCost;
        
    }
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};

        int n = arr.length;
        dp = new int[n][n];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        System.out.println(mcmRecursive(arr, 1, n-1));
    }
}
