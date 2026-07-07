package tuf.binarySearch;

public class FloorAndCeilInSortedArray {
    public int[] getFloorAndCeil(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int floorVal = -1, ceilVal = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(target == nums[mid]){
                return new int[]{nums[mid], nums[mid]};
            }
            else if(nums[mid]<target){
                floorVal = nums[mid]; //possible floor candidate
                low = mid +1;
            }
            else {
                ceilVal = nums[mid]; //possible ceil candidate
                high = mid-1;
            }
        }
        return new int[]{floorVal, ceilVal};
    }
}
