class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Find the smallest value >= nums[i] - valueDiff
            Long value = set.ceiling((long) nums[i] - valueDiff);

            if (value != null && value <= (long) nums[i] + valueDiff) {
                return true;
            }

            set.add((long) nums[i]);

            // Keep only the previous indexDiff elements
            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}