package tuf.basics;

import java.util.*;

public class HighestOccElement {
    static int highestOccEle(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        int ans = Integer.MIN_VALUE;
        int maxFreq = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            if(freq>maxFreq) {
                maxFreq = freq;
                ans = element;
            }
            else if(freq==maxFreq && ans>element) ans = element;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {100, 100, 1, 1, 1};
        System.out.println(highestOccEle(arr));
    }
}


/*
Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. If there are multiple elements that appear a maximum number of times, find the smallest of them.



Please note that this section might seem a bit difficult without prior knowledge on what hashing is, we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!


Example 1

Input: nums = [1, 2, 2, 3, 3, 3]

Output: 3

Explanation: The number 3 appears the most (3 times). It is the most frequent element.

Example 2

Input: nums = [4, 4, 5, 5, 6]

Output: 4

Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
*/