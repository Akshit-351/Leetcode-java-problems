class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int maxLen = 0;
        for(int x : set){
            if(!set.contains(x-1)){
            int length = 1;
        while(set.contains(x+1)){
            length++;
            x++;
        }
        maxLen = Math.max(maxLen , length);
            }
        }
        return maxLen;
    }
}