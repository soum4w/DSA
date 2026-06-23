package DynamicProgramming.MatrixChainMultiplication;

import java.util.HashMap;

public class ScrambledString {
    static HashMap<String, Boolean> dp = new HashMap<>();

    static boolean solve(String a, String b){
        if(a.equals(b)) return true;
        if(a.length()!=b.length()) return false;
        if(a.length()<=1) return false;
        int n = a.length();

        String key = a+" "+b;
        if(dp.containsKey(key)) return dp.get(key);

        for(int k=1; k<n; k++){
            
            boolean swapped = solve(a.substring(0,k), b.substring(n-k)) && solve(a.substring(k), b.substring(0,n-k));

            boolean noSwapped = solve(a.substring(0,k), b.substring(0,k)) && solve(a.substring(k), b.substring(k));

            if(swapped || noSwapped ) {
                dp.put(key, true);
                return true;
            }
                
        }
        dp.put(key, false);
        return false;
    }
    public static void main(String[] args) {
        String a = "great";
        String b = "eatgr";
        System.out.println(solve(a, b));
    }
}
