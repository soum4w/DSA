package tuf.leetcode.binarySearch;

public class Leetcode875  {
    static int hoursRequired(int[] piles, int speed){
        int hours = 0;
        for(int pile: piles){
            hours+=(pile+speed-1)/speed;
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int pile:piles){
            high = Math.max(high, pile);
        }
        // int ans = high;
        while(low<high){
            int mid = low + (high-low)/2;
            int hoursRequired = hoursRequired(piles, mid);
            if(hoursRequired<=h){
                // ans = mid;
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low; //return ans
    }
}
