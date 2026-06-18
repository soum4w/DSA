package DynamicProgramming.LongestCommonSubsequence;
public class LongestPalindromicSubsequence {

    static int longestPalindromicSubsequence(String a){
        String b = new StringBuilder(a).reverse().toString();
        int len = a.length();
        int[][] dp = new int[len+1][len+1];
        for(int i=1; i<=len; i++){
            for(int j=1; j<=len; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int lcsLength = dp[len][len];

        int i = len;
        int j = len;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){                              //backtrack
            if(a.charAt(i-1)==b.charAt(j-1)) {
                sb.append(a.charAt(i-1));
                i--; j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            } else {
                j--;
            }
        }
        System.out.println("Longest Palindromic Subsequence: " + sb.reverse().toString());

        return lcsLength; // or sb.length()
    }
    public static void main(String[] args) {
        String a= "agbcba";
        System.out.println(" Palindromic Subsequence Length: "+longestPalindromicSubsequence(a));
    }
}
