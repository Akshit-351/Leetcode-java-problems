class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // balance 0 is present before starting
        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            // 0 -> -1
            // 1 -> +1
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            // If same sum occurred before
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } 
            else {
                // Store FIRST occurrence only
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}