class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add non-zero frequencies
        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {

            List<Integer> temp = new ArrayList<>();
            int cycle = 0;

            // One cycle contains at most n + 1 positions
            for (int i = 0; i <= n && !pq.isEmpty(); i++) {

                int count = pq.poll();

                count--;

                if (count > 0) {
                    temp.add(count);
                }

                cycle++;
                time++;
            }

            // Add remaining frequencies back
            for (int count : temp) {
                pq.add(count);
            }

            // Add idle time only if tasks remain
            if (!pq.isEmpty()) {
                time += (n + 1 - cycle);
            }
        }

        return time;
    }
}