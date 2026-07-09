class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int peakelement = 0;
        int n = nums.length;
        while(low < n-1){
            if(nums[low] < nums[low+1]){
                peakelement++;
            }else{
                break;
            }
            low++;
        }
        return peakelement;
    }
}