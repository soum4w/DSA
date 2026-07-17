package arrays;

public class FindRepeatingAndMissingNum {
    public int[] findMissingRepeatingNumbers(int[] nums) { //[3, 5, 4, 1, 1]
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int num: nums) freq[num]++;
        int repeating = -1;
        int missing = -1;
        for(int i = 1 ; i<=n; i++){
            if(freq[i]==2) repeating = i;
            if(freq[i]==0) missing = i;
        }
        return new int[]{repeating, missing};
    }
}