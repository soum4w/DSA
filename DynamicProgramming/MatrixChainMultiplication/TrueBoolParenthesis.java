package DynamicProgramming.MatrixChainMultiplication;
import java.util.Arrays;
public class TrueBoolParenthesis {
    static int[][][] dp;

    static int solve(String s, int i, int j, boolean isTrue) {
        // invalid
        if (i > j)
            return 0;
        // single element
        if (i == j) {
            if (isTrue)
                return (s.charAt(i) == 'T' ? 1 : 0);
            else
                return (s.charAt(i) == 'F' ? 1 : 0);
        }
        int flag = isTrue?1:0;
        if(dp[i][j][flag]!=-1) return dp[i][j][flag];
        int ans = 0;
        for (int k = i + 1; k < j; k += 2) {
            int lT = solve(s, i, k - 1, true);
            int rT = solve(s, k + 1, j, true);
            int lF = solve(s, i, k - 1, false);
            int rF = solve(s, k + 1, j, false);

            char op = s.charAt(k);
            // Cases
            if (op == '^') {
                if(isTrue) ans += lT * rF + rT * lF;
                else ans+= lT*rT + lF*rF;
                
            }
            if (op == '|') {
                if (isTrue) ans += lT * rT + lT * rF + rT * lF;
                else ans+= lF*rF;
            }
            if (op == '&') {
                if(isTrue) ans += lT * rT;
                else ans+= lT*rF + rT*lF + rF*lF;
            }
        }
        return dp[i][j][flag] = ans;
    }

    public static void main(String[] args) {
        String s = "T|F&T";
        int n = s.length();
        dp = new int[n][n][2];
        for(int[][] matrix : dp){
            for(int[] row : matrix){
                Arrays.fill(row, -1);
            }
        }
        System.out.println(solve(s, 0, s.length() - 1, true));
    }
}
