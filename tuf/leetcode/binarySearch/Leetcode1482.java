package tuf.leetcode.binarySearch;

public class Leetcode1482 {
    static boolean canMakeBouquets(int[] bloomDay, int days, int m, int k){
        int flowers = 0, bouquets = 0;
        for(int bloom : bloomDay){
            if(bloom<=days){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers=0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) { //m: number of bouquets, k: number of adjacent flowers required for each bouquet
        if(((long)m*k)>bloomDay.length) return -1;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int days : bloomDay){
            low = Math.min(low, days);
            high = Math.max(high, days);
        }

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canMakeBouquets(bloomDay, mid, m, k)){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }
}

