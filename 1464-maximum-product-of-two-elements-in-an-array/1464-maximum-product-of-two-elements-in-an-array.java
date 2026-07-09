class Solution {
    public int maxProduct(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        for(int num : nums){
           if(num > num1){
            num2 = num1;
            num1 = num;
           }else if(num > num2){
            num2 = num;
           }
        }
        return (num2 - 1) * (num1 - 1);
    }
}