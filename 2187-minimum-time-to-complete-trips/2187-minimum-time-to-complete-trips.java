class Solution {

    public long minimumTime(int[] time, int totalTrips) {

        long low = 1;
        int minTime = Integer.MAX_VALUE;

        for (int t : time) {
            minTime = Math.min(minTime, t);
        }

        long high = (long) minTime * totalTrips;
        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            long trips = helper(time, mid);

            if (trips >= totalTrips) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public long helper(int[] time, long currentTime) {

        long trips = 0;

        for (int t : time) {
            trips += currentTime / t;
        }

        return trips;
    }
}