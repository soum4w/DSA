#include <bits/stdc++.h>
using namespace std;



//Leetcode - 169

class Solution {
public:
//using Moore's Voting Algorithm
    int majorityElement(vector<int>& nums) {
        int ele;
        int count = 0;
        for(int i=0; i<nums.size(); i++){
            if(count==0){
                ele = nums[i];
            } 
            if(ele == nums[i]) count++;
            else count--;
        }
        return ele;
    }
};