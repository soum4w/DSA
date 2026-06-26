package DynamicProgramming.LongestCommonSubsequence;

public class ShortestCommonSupersequence {
    static String scs(String a, String b){
        //LCS table
        int lenA = a.length(); 
        int lenB = b.length();
        int[][] dp = new int[lenA+1][lenB+1];
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        //backtrack
        int m = lenA;
        int n = lenB;
        StringBuilder sb = new StringBuilder();
        while(m>0 && n>0){
            if(a.charAt(m-1)==b.charAt(n-1)){
                sb.append(a.charAt(m-1));
                m--; n--;
            } else if(dp[m-1][n]>dp[m][n-1]){
                sb.append(a.charAt(m-1));
                m--;
            } else {
                sb.append(b.charAt(n-1));
                n--;
            }
        }
        //add remaining
        while(m>0) {
            sb.append(a.charAt(m-1));
            m--;
        }
        while (n>0) {
            sb.append(b.charAt(n-1));
            n--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "geek";
        String b = "eke";
        System.out.println(scs(a, b));
    }
}
