package DynamicProgramming.LongestCommonSubsequence;

public class LCSBottomUp {

    static int lcs(String a, String b){
        int lenA = a.length();
        int lenB = b.length();

        int[][] dp = new int[lenA+1][lenB+1];
        
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[lenA][lenB];
    }

    public static void main(String[] args) {
        String a = "abcdgh";
        String b = "abedfhr";
        System.out.println(lcs(a, b));
    }
}
