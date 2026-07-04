class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int a = nums1.length;
        int b = nums2.length;
        int[] result = new int[a];

        for (int i = 0; i < a; i++) {
            int nextGreater = -1;

            for (int j = 0; j < b; j++) {
                if (nums1[i] == nums2[j]) {

                    for (int k = j + 1; k < b; k++) {
                        if (nums2[k] > nums1[i]) {
                            nextGreater = nums2[k];
                            break;
                        }
                    }

                    break; 
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}
