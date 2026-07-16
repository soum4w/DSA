package leetcode.recursion;

import java.util.List;
import java.util.ArrayList;

public class Leetcode17 {

    private static String[] map = {
            "",     //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        solve(0, new StringBuilder(), digits,ans);
        return ans;
    }

    private void solve(int index, StringBuilder curr, String digits, List<String> ans){
        if(curr.length()==digits.length()){
            ans.add(curr.toString());
            return;
        }
        String letters = map[digits.charAt(index)-'0'];
        for(char ch: letters.toCharArray()){
            curr.append(ch);
            solve(index+1, curr, digits, ans );
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
