package DynamicProgramming.LongestCommonSubsequence;

public class PrintLCS {
    static String printLCS(String a, String b){
        //build DP
        int lenA = a.length();
        int lenB = b.length();
        int[][] dp = new int[lenA+1][lenB+1];
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        //Backtrack
        int i = lenA;
        int j = lenB;
        StringBuilder sb = new StringBuilder();
        while (i>0 && j>0) {
            if(a.charAt(i-1)==b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            } else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            } else {
                j--;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "abcdgh";
        String b = "abedfhr";
        System.out.println(printLCS(a,b));
    }
}
