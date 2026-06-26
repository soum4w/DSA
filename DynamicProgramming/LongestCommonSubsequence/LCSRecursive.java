package DynamicProgramming.LongestCommonSubsequence;

public class LCSRecursive {
    static int lcs(String a, String b, int lenA, int lenB){
        if(lenA == 0 || lenB == 0) return 0;    //Base case 
        if(a.charAt(lenA-1)==b.charAt(lenB-1)) return 1+ lcs(a, b, lenA-1, lenB-1);
        else return Math.max(lcs(a,b,lenA-1,lenB), lcs(a,b,lenA, lenB-1));
    }
    
    public static void main(String[] args) {
        String a = "abcdgh";
        String b = "abedfhr";
        System.out.println(lcs(a, b, a.length(), b.length()));
    }
}
