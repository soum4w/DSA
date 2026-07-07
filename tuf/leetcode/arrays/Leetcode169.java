package tuf.leetcode.arrays;


//Moore's voting algorithm
public class Leetcode169 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int freq = 0;
        for(int num: nums){
            if(freq ==0) candidate = num;
            if(num==candidate) freq++;
            else freq--;
        }
        return candidate;
    }
}
// 1 mix veg 4 butter roti

//Using HashMap
// class Solution {
//     public int majorityElement(int[] nums) {
//         //put the freq of every element in hashmap
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int ele: nums){
//             map.put(ele, map.getOrDefault(ele, 0)+1);
//         }

//         //traverse the hashmap 
//         int ans = nums[0];
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue()>map.get(ans)){
//                 ans = entry.getKey();
//             }
//         }
//         return ans;
//     }
// }