class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = -1;

        // Find the largest lucky integer
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }
}