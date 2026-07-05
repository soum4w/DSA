package tuf.leetcode.binarySearch;

public class Leetcode1011 {
    static boolean shipmentPossible(int[] weights, int days, int capacity) {
        int itemsWeight = 0;
        int day = 1;
        for (int weight : weights) {
            if (weight + itemsWeight > capacity) {
                day++;
                itemsWeight = weight;
            } else {
                itemsWeight += weight;
            }
        }
        return day <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int weight : weights) {
            low = Math.max(weight, low);
            high += weight;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (shipmentPossible(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
