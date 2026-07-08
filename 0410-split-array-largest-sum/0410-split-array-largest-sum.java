class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int num : nums){
            low = Math.max(low , num);
            high += num;
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            int subarray = helper(nums , mid);
            if(subarray <= k){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int helper(int[] nums , int sum){
        int subarrays = 1;
        int currentsum = 0;
        for(int num: nums){
            if(currentsum + num <= sum){
                currentsum += num;
            }else{
                subarrays++;
                currentsum = num;
            }
        }
        return subarrays;
    }
}