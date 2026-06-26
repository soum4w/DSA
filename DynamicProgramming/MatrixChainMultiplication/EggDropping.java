package DynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class EggDropping {
    static int[][] dp;

    static int solve (int eggs, int floors){
        if(floors==0 || floors == 1) return floors;
        if(eggs == 1) return floors;
        if (dp[eggs][floors]!=-1) return dp[eggs][floors];
        int minAttempts = Integer.MAX_VALUE;
        for(int k=1; k<=floors; k++){
            int breaks = (dp[eggs-1][k-1]!=-1)? dp[eggs-1][k-1] : solve(eggs-1, k-1);
            int survives =(dp[eggs][floors-k]!=-1)? dp[eggs][floors-k] : solve(eggs, floors-k);
            int temp = 1 + Math.max(breaks, survives);
            minAttempts = Math.min(minAttempts, temp);
        }
        return dp[eggs][floors] = minAttempts;
    }

    public static void main(String[] args) {
        int eggs = 2;
        int floors = 10;
        dp = new int[eggs+1][floors+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        System.out.println(solve(eggs, floors));
    }
}
