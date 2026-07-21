package binarySearch;

public class FindRowWithMax1 {
    public int rowWithMax1s(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int maxOnes = Integer.MIN_VALUE;
        int ans = -1;
        for(int i =0; i<rows; i++){
            int firstOcc = firstOcc(mat[i]);
            if(firstOcc!=-1){
                int ones = cols - firstOcc;
                if(ones>maxOnes){
                    maxOnes = ones;
                    ans = i;
                }
            }
        }
        return ans;
    }

    private int firstOcc(int[] row){
        int low = 0;
        int high = row.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(row[mid]==1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}
