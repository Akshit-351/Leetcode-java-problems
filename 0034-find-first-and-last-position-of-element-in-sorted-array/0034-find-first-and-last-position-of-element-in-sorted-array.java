class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstoccurrence(nums , target);
        int last = lastoccurrence(nums , target);
        return new int[]{first , last};
    }
        public int firstoccurrence(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
         while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1; // search left
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
         }
         return ans;
        }
        public int lastoccurrence(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
         while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1; // search right
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
        }
         }
         return ans;
        }
    }