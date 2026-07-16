package leetcode.recursion;

import java.util.List;
import java.util.ArrayList;

public class Leetcode131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(0, s, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int index, String s, List<String> curr, List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int end = index; end<s.length(); end++){
            if(isPalindrome(s, index, end)){
                curr.add(s.substring(index, end+1));
                solve(end+1, s, curr, ans);
                curr.remove(curr.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}
