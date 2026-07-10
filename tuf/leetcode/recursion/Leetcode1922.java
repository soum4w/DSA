public class Leetcode1922 {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenIndices = (n+1)/2;
        long oddIndices = n/2;
        return (int)((power(5, evenIndices) * power(4, oddIndices))%MOD);
    }

    private long power(long x, long n){ //use binary exponential to find power
        if(n==0) return 1;
        long half = power(x,n/2);
        long ans = (half*half)%MOD;
        if(n%2==1){
            ans = (x*ans)%MOD;
        }
        return ans;
    }
}