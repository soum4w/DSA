public class MinimumSubsetSumDifference {

    static int minimumSubsetSumDifference(int[] arr){
        int n = arr.length;
        int range = 0;
        for(int ele: arr) range+=ele;
        boolean[][] dp = new boolean[n+1][range+1];
        for(int i=0; i<=n; i++) dp[i][0] = true;

        for(int i=1; i<=n; i++){
            for(int sum=1; sum<=range; sum++){
                dp[i][sum] = dp[i-1][sum];
                if(arr[i-1]<=sum) dp[i][sum] |= dp[i-1][sum- arr[i-1]];
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for(int s1=0; s1<=range/2; s1++){
            if(dp[n][s1]) minDiff = Math.min(minDiff, range-(2*s1)); //s2-s1 = (range-s1)-s1 //s2 = range - s1  
        }                                                      //consider the last row as the possible subset sum values
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7};
        System.out.println(minimumSubsetSumDifference(arr));
    }
}
