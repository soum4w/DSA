package tuf.binarySearch;

class Solution {
    static long power(long base, int exp, int limit){
        long result = 1;
        for(int i=0; i<exp; i++){
            result*=base;
            if(result>limit) return result;
        }
        return result;
    }

    public int NthRoot(int n, int m) {
        int low = 1, high = m;
        while(low<=high){
            int mid = low + (high-low)/2;
            long value = power(mid, n, m);
            if(value == m) return mid;
            if(value<m) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}

public class NthRootOfM {

}
