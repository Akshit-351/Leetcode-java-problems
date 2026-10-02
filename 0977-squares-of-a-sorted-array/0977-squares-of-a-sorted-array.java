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
        for(int pos = n-1; pos>=0; pos--){
            if(nums[left]>nums[right]){
                new_arr[pos] = nums[left];
                left++;
            }else{
                new_arr[pos] = nums[right];
                right--;
            }
        } 
        return new_arr;
    }
}
