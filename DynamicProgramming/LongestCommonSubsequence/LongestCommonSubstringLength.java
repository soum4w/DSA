package DynamicProgramming.LongestCommonSubsequence;

public class LongestCommonSubstringLength {
    static int longestCommonSubstringLength(String a, String b){
        int lenA = a.length();
        int lenB = b.length();
        int maxLen = 0;
        int[][] dp = new int[lenA+1][lenB+1];
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) {
                    dp[i][j] = 1+dp[i-1][j-1];
                    maxLen = Math.max(maxLen, dp[i][j]);
                } 
                else dp[i][j] = 0;
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        String a = "abcdgh";
        String b = "abedfhr";
        System.out.println(longestCommonSubstringLength(a, b));
    }
}
