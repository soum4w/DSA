package DynamicProgramming.LongestCommonSubsequence;

/*
In this problem we need to find the length of a String that contains both of the given Strings 
for example 
"geek" and "eke" -> shortest common supersequence is geeke 
we need to return the length 5
To find the length of the shortest common supersequence, we need to subtract the LCS from the total length of 2 strings
*/

public class LengthOfShortestCommonSuperSequence { 
    
    static int lengthOfShortestCommonSuperSequence(String a, String b){
        int lenA = a.length();
        int lenB = b.length();
        int[][] dp = new int[lenA+1][lenB+1];
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return lenA+lenB - dp[lenA][lenB];
    }
    public static void main(String[] args) {
        // String a = "aggtab";
        // String b = "axtxayb";
        String a = "geek";
        String b = "eke";
        System.out.println(lengthOfShortestCommonSuperSequence(a,b));
    }
}
