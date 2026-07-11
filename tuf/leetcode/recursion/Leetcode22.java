import java.util.*;

public class Leetcode22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n, "", list, 0, 0);
        return list;
    }

    private void solve(int n, String curr, List<String> list, int open, int close){
        if(n*2==curr.length()){
            list.add(curr);
            return;
        }
        if(open<n){
            solve(n, curr+"(", list, open+1, close);
        }
        if(close<open){
            solve(n, curr+")", list, open, close+1);
        }
    }
}
