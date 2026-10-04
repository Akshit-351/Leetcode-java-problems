class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 2;
        for(int i = 2; i<nums.length; i++){
            if(nums[i] != nums[slow - 2]){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}