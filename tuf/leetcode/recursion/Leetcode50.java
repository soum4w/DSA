public class Leetcode50 {
    public double myPow(double x, int n) {
        long N = n;
        if(n<0){
            x = 1/x;
            N = -N;
        }
        return power(x,N);
    }

    private double power(double x, long n){
        if(n==0) return 1;
        if(n%2==1){ //Odd number
            return x*(power(x*x, (n-1)/2));
        } else {
            return power(x*x, n/2);
        }
    }
}