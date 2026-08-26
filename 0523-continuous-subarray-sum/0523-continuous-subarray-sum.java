class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , -1);
        int prefixSum = 0;
        for(int i = 0; i<nums.length; i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(map.containsKey(rem)){
                int previousindex = map.get(rem);
                int length = i - previousindex;
                if(length >= 2){
                    return true;
                }
            }
            if(!map.containsKey(rem)){
                map.put(rem , i);
            }
        }
        return false;
    }
}