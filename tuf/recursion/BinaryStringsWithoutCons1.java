import java.util.*;
public class BinaryStringsWithoutCons1 {
    public List<String> generateBinaryStrings(int n) {
        // Your code goes here
        List<String> ans = new ArrayList<>();
        solve(n, "", ans);
        return ans;
    }

    private void solve(int n, String curr, List<String> ans){
        if(n==curr.length()){
            ans.add(curr);
            return;
        }
        solve(n, curr+"0", ans);
        if(curr.isEmpty() || curr.charAt(curr.length()-1)=='0'){
            solve(n, curr+"1", ans);
        }
    }
}
