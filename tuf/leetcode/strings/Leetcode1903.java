package tuf.leetcode.strings;

public class Leetcode1903 {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            if((ch-'0')%2==1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}

/*
Unicode (ASCII for digits): 
'0' : 48
'1' : 49
'2' : 50
'9' : 57
*/