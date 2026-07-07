class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Search Space
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int daysUsed = helper(weights, mid);

            if (daysUsed <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int helper(int[] weights, int capacity) {

        int days = 1;
        int currentWeight = 0;

        for (int weight : weights) {

            if (currentWeight + weight <= capacity) {
                currentWeight += weight;
            } else {
                days++;
                currentWeight = weight;
            }
        }

        return days;
    }
}