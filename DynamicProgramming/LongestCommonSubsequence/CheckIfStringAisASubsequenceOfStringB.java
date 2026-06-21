package DynamicProgramming.LongestCommonSubsequence;

// check if string a is a subsequence of string b

public class CheckIfStringAisASubsequenceOfStringB {

    static boolean lcs(String a, String b){
        int [][] dp = new int[a.length()+1][b.length()+1];
        int lenA =a.length();
        int lenB = b.length();
        for(int i=1; i<=lenA; i++){
            for(int j=1; j<=lenB; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int lcs = dp[lenA][lenB];
        return lenA ==lcs;
    }
    public static void main(String[] args) {
        String a = "dabc";
        String b = "axddsabdc";
        System.out.println(lcs(a,b));
    }



    //two pointer approach TC: O(n+m)
static boolean isSubsequence(String a, String b) {
    int i = 0, j = 0;

    while (i < a.length() && j < b.length()) {
        if (a.charAt(i) == b.charAt(j)) {
            i++;
        }
        j++;
    }

    return i == a.length();
}

}


