package tuf.leetcode.strings;

public class Leetcode5Approach2 {
    public String longestPalindrome(String s) {
        // expand around center
        if (s == null || s.length() < 2)
            return s;
        int start = 0, end = 0;
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i); // even
            int len2 = expand(s, i, i + 1); // odd
            int currLen = Math.max(len1, len2);
            if (maxLen < currLen) {
                start = i - (currLen - 1) / 2;
                end = i + currLen / 2;
                maxLen = currLen;
            }
        }
        return s.substring(start, end+1);
    }

    private int expand(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
