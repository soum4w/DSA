package tuf.leetcode.strings;

public class Leetcode151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length();
        while (i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0) break;
            int j=i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            if(sb.length()>0) sb.append(' ');
            sb.append(s.substring(j+1, i+1));
            i=j;
        }
        return sb.toString();
    }
}