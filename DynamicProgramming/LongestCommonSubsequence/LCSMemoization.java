package DynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

public class LCSMemoization {

    static int[][] dp;
    
    static int lcs(String a, String b, int lenA, int lenB){
        if(lenA == 0 || lenB == 0) return 0;

        if(dp[lenA][lenB]!=-1) return dp[lenA][lenB];

        if(a.charAt(lenA-1)== b.charAt(lenB-1)) return dp[lenA][lenB] = 1+lcs(a, b, lenA-1, lenB-1);
        else return dp[lenA][lenB]= Math.max(lcs(a, b, lenA-1, lenB), lcs(a, b, lenA, lenB-1));
    }

    public static void main(String[] args) {
        String a = "abcdgh";
        String b = "abedfhr";

        dp = new int[a.length()+1][b.length()+1];
        for(int[] row : dp) Arrays.fill(row, -1);
         
        System.out.println(lcs(a, b, a.length(), b.length()));
    }
}

