package tuf.binarySearch;

public class FloorSqrtOfN {
    public int mySqrt(int n) {
        if(n==0 || n==1) return n;
        int low = 1, high = n;
        int ans = 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            long square = (long) mid*mid;
            if(square == n) return mid;
            else if(square < n) {
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}

