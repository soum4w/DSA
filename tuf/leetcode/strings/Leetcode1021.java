package tuf.leetcode.strings;

//approach 1 : Stack 
/*
add element to stack and the ans. if stack is empty then add only to stack when '(' and pop when ')' , but add to ans even if pop but not in case when stack is empty
*/
//approach 2 : maintain a counter , when counter == 0 dont add to answer, +1 for '(' , -1 for ')'

public class Leetcode1021 {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++){
            if(s.charAt(i)==')') count--;
            if(count>0) ans.append(s.charAt(i));
            if(s.charAt(i)=='(') count++;
        }
        return ans.toString();
    }
}
