package tuf.leetcode.strings;

import java.util.Arrays;

public class Leetcode5 {
    private byte[][] dp;

    private boolean isPalindrome(String s, int left, int right){
        if(left>=right) return true;
        if(dp[left][right]!=-1) return dp[left][right]==1;
        boolean ans = false;
        if(s.charAt(left)==s.charAt(right)){
            ans = isPalindrome(s, left+1, right-1);
        }
        dp[left][right] = (byte)(ans?1:0);
        return ans;
    }

    public String longestPalindrome(String s) {
        if(s==null|| s.length()==0) return "";
        if(s.length()==1) return s;
        int n = s.length();
        dp = new byte[n][n];
        for(byte[] row: dp){
            Arrays.fill(row, (byte)-1);
        }
        int start = 0;
        int maxLen = 1;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrome(s, i, j) && j-i+1>maxLen){
                    maxLen = j-i+1;
                    start = i;
                }
            }
        }
        return s.substring(start, start+maxLen);
    }
}
