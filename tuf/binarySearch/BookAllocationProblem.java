package binarySearch;

public class BookAllocationProblem {
    public int findPages(int[] nums, int m) {
        int n = nums.length;
        if(m>n) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int pages:nums){
            low = Math.max(low, pages);
            high+=pages;
        }
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(nums, m, mid)){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] nums, int m, int maxPages){
        int students = 1;
        int pages = 0;
        for(int num:nums){
            if(num+pages<=maxPages){
                pages+=num;
            } else{
                students++;
                pages=num;
                if(students>m) return false;
            }
        }
        return true;
    }
}