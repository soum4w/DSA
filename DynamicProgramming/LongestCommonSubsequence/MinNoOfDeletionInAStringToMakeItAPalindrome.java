package DynamicProgramming.LongestCommonSubsequence;

//minimum number of deletions in a string to make it a palindrome

public class MinNoOfDeletionInAStringToMakeItAPalindrome {

    static int lcs(String a){
        String b = new StringBuilder(a).reverse().toString();
        int len = a.length();
        int[][] dp = new int[len+1][len+1];
        for(int i=1; i<=len; i++){
            for(int j=1; j<=len; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]= 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int lenOfLCS = dp[len][len];
        return len-lenOfLCS;
    }
    public static void main(String[] args) {
        String s = "agbcba";
        System.out.println(lcs(s));
    }
}

