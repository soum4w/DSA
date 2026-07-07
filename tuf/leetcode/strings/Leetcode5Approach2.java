package tuf.leetcode.strings;

public class Leetcode5Approach2 {
    public String longestPalindrome(String s) {
        //expand around center
        if(s==null ||s.length()>=2) return s;
        int start = 0, end = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0; i<s.length()-1; i++){
            int len1 = expand(s, i, i); //even
            int len2 = expand(s, i, i+1); //odd
            int currLen = Math.max(len1, len2);
            if(maxLen<currLen){
                start = i-(currLen-1)/2;
                end = i+currLen/2;
            }
        }
        return s.substring(start, end);
    }

    private int expand(String s, int start, int end){
        if
        while(start>=0 && end<=s.length()-1){
            if(s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
        }
        return end-start+1;
    }
}
