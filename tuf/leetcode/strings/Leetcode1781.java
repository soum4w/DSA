package tuf.leetcode.strings;

public class Leetcode1781 {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            int[] freqArr = new int[26];
            for(int j=i; j<n; j++){
                int min = Integer.MAX_VALUE;
                int max = 0;
                freqArr[s.charAt(j)-'a']++;
                for(int freq:freqArr){
                    if(freq==0) continue;
                    max = Math.max(freq, max);
                    min = Math.min(freq, min);
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}