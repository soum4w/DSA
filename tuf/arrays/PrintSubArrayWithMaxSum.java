package tuf.arrays;

//extended version of Leetcode 53 : Kadane's algorithm

public class PrintSubArrayWithMaxSum {
    static void maxSubArray(int[] arr){
        int start = 0; 
        int end = 0;
        int n = arr.length;
        int currentSum = arr[0];
        int maxSum = arr[0];
        int tempStart = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i]+currentSum){
                tempStart = i;
                currentSum = arr[i];
            }
            else {
                currentSum += arr[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

        }
        System.out.println("Max Sum: " + maxSum);
        System.out.print("Subarray: " );

        for(int i = start; i <=end; i++){
            System.out.print( arr[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
}
