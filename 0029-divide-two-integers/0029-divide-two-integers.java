class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive long to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        long quotient = 0;

        while (dvd >= dvs) {

            long temp = dvs;
            long multiple = 1;

            // Keep doubling the divisor
            while (dvd >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            dvd = dvd - temp;
            quotient = quotient + multiple;
        }

        // Apply sign
        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}