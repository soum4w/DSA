public class EqualSumPartition {

    static boolean subsetSumBool(int[] arr, int target){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i=0; i<=n; i++){
            dp[i][0] = true;
        }
        for(int i=1; i<=n; i++){
            for(int sum=1; sum<=target; sum++){
                dp[i][sum] = dp[i-1][sum];    //excluding current element
                if(arr[i-1]<=sum){            //including current element
                    dp[i][sum] = dp[i][sum] || dp[i-1][sum-arr[i-1]];
                }
            }
        }
        return dp[n][target];
    }

    static boolean equalSumPartition(int[] arr){
        int sum = 0;
        for(int ele: arr){
            sum+=ele;
        }
        if(sum%2!=0) return false;
        return subsetSumBool(arr, sum/2);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,11,5};
        System.out.println(equalSumPartition(arr));
    }
}
