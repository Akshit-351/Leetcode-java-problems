//import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] new_arr = new int[n];
        int left = 0; 
        int right = n-1; 

        for(int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];   // square each element
        }
        Arrays.sort(nums);
        return nums;
    }
}
