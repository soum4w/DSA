package binarySearch;

public class PaintersPartition {
    public int paint(int A, int B, int[] C) { //A: no of painters, B: 1 unit time, C: length of board array
        // Your code goes here
        int low = 0, high = 0;
        for(int length:C){
            low = Math.max(low, length);
            high+=length;
        }
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(C, A, mid)){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        long MOD =  10000003;
        return (int)((ans*B)%MOD);
    }

    private boolean isPossible(int[] C, int A, int maxLength){
        int currLength = 0;
        int numOfPainters = 1;
        for(int length:C){
            if(length + currLength<=maxLength){
                currLength+=length;
            } else {
                numOfPainters++;
                if(numOfPainters>A) return false;
            }
        }
        return true;
    }
}