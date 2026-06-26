package DynamicProgramming.LongestCommonSubsequence;

/*
we need to find the LCS first,
in this case heap and pea,
LCS is ea and heap -> ea, we require 2 deletions and then ea -> pea, 1 insertion
*/

public class MinNoOfInsertionAndDeletionToConvertStringAToStringB {
    static int[] minNoOfInsertionAndDeletionToConvertStringAToStringB(String a, String b){
        int lenA = a.length();
        int lenB = b.length();
        int[][] dp = new int[lenA+1][lenB+1];
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int lcs = dp[lenA][lenB];
        int deletions = lenA - lcs;
        int insertions = lenB - lcs;
        return new int[]{insertions, deletions};
    }
    
    public static void main(String[] args) {
        String a = "heap";
        String b = "pea";
        int[] ans = minNoOfInsertionAndDeletionToConvertStringAToStringB(a, b);
        System.out.println("Insertion: " + ans[0]);
        System.out.println("Deletion: " + ans[1]);
    }
}
