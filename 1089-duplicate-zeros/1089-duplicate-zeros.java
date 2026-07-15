class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;
        int n = arr.length;

        // Count the number of zeros
        for (int num : arr) {
            if (num == 0)
                zeros++;
        }

        // Traverse from the end
        for (int i = n - 1; i >= 0; i--) {

            if (i + zeros < n)
                arr[i + zeros] = arr[i];

            if (arr[i] == 0) {
                zeros--;

                if (i + zeros < n)
                    arr[i + zeros] = 0;
            }
        }
    }
}