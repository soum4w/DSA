package tuf.leetcode.arrays;

// import java.util.ArrayList;
// import java.util.List;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int positive = 0;
        int negative = 1;
        for(int num : nums){
            if(num>0){
                ans[positive] = num;
                positive+=2;
            } else {
                ans[negative] = num;
                negative+=2;
            }
        }
        return ans;
    }
}


// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         List<Integer> positive = new ArrayList<>();
//         List<Integer> negative = new ArrayList<>();
//         for(int num : nums){
//             if(num>0){
//                 positive.add(num);
//             }
//             else{
//                 negative.add(num);
//             }
//         }
//         int[] ans = new int[n];
//         for(int i=0; i<n; i+=2){
//             ans[i] = positive.get(i);
//         }
//         for(int i=1; i<n; i+=2){
//             ans[i] = negative.get(i);
//         }
//         return ans;
//     }
// }