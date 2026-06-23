package DynamicProgramming.MatrixChainMultiplication;

public class ScrambledString {
    static boolean solve(String a, String b){
        if(a.equals(b)) return true;
        if(a.length()!=b.length()) return false;
        int n = a.length();
        for(int k=1; k<n; k++){
            
            boolean swapped = solve(a.substring(0,k), b.substring(n-k)) && solve(a.substring(k), b.substring(0,n-k));

            boolean noSwapped = solve(a.substring(0,k), b.substring(0,k)) && solve(a.substring(k), b.substring(k));

            if(swapped || noSwapped ) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "great";
        String b = "eatgr";
        System.out.println(solve(a, b));
    }
}
