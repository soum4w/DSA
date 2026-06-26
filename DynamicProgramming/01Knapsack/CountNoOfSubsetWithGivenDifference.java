// Q - Count the no of subsets with the given difference (given an array, get 2 subsets from that array(using all the elements) and
// the difference of those subsets should be equal to the given diff)

        // sum of s1 - sum of s2 = diff (according to the question)
        // sum of s1 + sum of s2 = total of the array (we know)
        // 2*(sum of s1) = diff + total of the array 
        // sum of s1 = (diff + total of the array)/2;
        // we need to find how many subsets (s1) are there in the array whose sum is (diff+total)/2


//unhandled test cases : Leetcode/leetcode_494_Target_sum.java

public class CountNoOfSubsetWithGivenDifference {
    static int countSubSetSum(int[]arr, int target){
        int n = arr.length;
        int [][] dp = new int[n+1][target+1];
        for(int i=0; i<=n; i++) dp[i][0] = 1;
        for(int i=1; i<=n; i++){
            for(int sum=1; sum<=target; sum++){
                dp[i][sum] = dp[i-1][sum];
                if(arr[i-1]<=sum) dp[i][sum]+=dp[i-1][sum-arr[i-1]];
            }
        }
        return dp[n][target];
    }

    static int noOfSubsetsWithDiff(int[]arr, int diff){
        int totalOfArr = 0;
        for(int ele: arr) totalOfArr+=ele;
        if(diff>totalOfArr) return 0;
        if((diff+totalOfArr)%2 !=0) return 0; // s1 can't be in fraction 
        int sumOfs1 = (diff + totalOfArr)/2;
        return countSubSetSum(arr, sumOfs1);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int diff = 1;
        System.out.println(noOfSubsetsWithDiff(arr, diff));
    }
}
