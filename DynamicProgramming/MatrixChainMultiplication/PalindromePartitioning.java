package DynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class PalindromePartitioning {

    static int [][] dp;

    static boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    static int palindromePartition(String s, int i, int j){
        if(i>=j || isPalindrome(s, i, j)) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int minCuts = Integer.MAX_VALUE;
        for(int k = i; k<j; k++){

            int left, right;

            if(dp[i][k]!=-1) left = dp[i][k];
            else left = palindromePartition(s, i, k);

            if(dp[k+1][j]!=-1) right = dp[k+1][j];
            else right = palindromePartition(s, k+1, j);
            
            int cost = 1 + left + right;
            minCuts = Math.min(minCuts, cost);
        }
        return dp[i][j] = minCuts;
    }
    public static void main(String[] args) {
        String s ="nitik";
        int n = s.length();
        dp = new int[n][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        System.out.println(palindromePartition(s, 0, n-1));
    }
}
