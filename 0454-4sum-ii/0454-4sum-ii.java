class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        HashMap<Integer , Integer> map = new HashMap<>();
       // first pair
        for(int a : nums1){
            for(int b : nums2){
          int sum = a + b;
          map.put(sum , map.getOrDefault(sum , 0) + 1);
            }
        }
        //second pair
        int count = 0;
        for(int a : nums3){
            for(int b : nums4){
                int sum = a + b;
                if(map.containsKey(-(sum))){
                    count += map.get(-sum);
                }
            }
        }
        return count;
    }
}