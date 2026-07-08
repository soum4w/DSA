package tuf.leetcode.strings;

public class Leetcode151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length();
        while (i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            if(i<0) break; //Only spaces 
            int j=i;
            while(j>=0 && s.charAt(j)!=' '){ //fetch the word 
                j--;
            }
            if(sb.length()>0) sb.append(' '); //append space after the word, no space if this is the first word 
            sb.append(s.substring(j+1, i+1)); //append the word
            i=j;    //move i to j , to fetch the next word (available before the current word)
        }
        return sb.toString();
    }
}