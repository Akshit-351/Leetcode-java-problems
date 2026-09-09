class Solution {
    public long countCommas(long n) {
        
        long count = 0;
        long start = 1000;
        int commas = 1;

        while (start <= n) {

            long end = start * 1000 - 1;

            long last = Math.min(n, end);

            long numbers = last - start + 1;

            count += numbers * commas;

            start = start * 1000;
            commas++;
        }

        return count;
    }
}