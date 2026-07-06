package tuf.leetcode.strings;

public class Leetcode8 {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        //Remove starting zeros
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;
        //Handle Sign 
        int sign = 1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        int num = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            //Overflow Check 
            if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10){
                return sign==-1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num*10+digit;
            i++;
        }
        return sign*num;
    }
}