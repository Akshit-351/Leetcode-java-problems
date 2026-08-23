class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > largest){
                secondlargest = largest;
                largest = nums[i];
                idx = i;
            }else if(nums[i] > secondlargest && nums[i] < largest){
                secondlargest = nums[i];
            }
        }
        if(largest >= secondlargest * 2) {
            return idx;
        }
        return -1;
    }
}