package tuf.leetcode.strings;

public class Leetcode1614 {
    public int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                maxCount = Math.max(maxCount, count);
            } 
            else if(ch==')'){
                count--;
            }
        }
        return maxCount;
    }
}