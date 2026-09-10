import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        // Max Heap: [score, originalIndex]
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        // Add score and its original index
        for (int i = 0; i < score.length; i++) {
            pq.add(new int[]{score[i], i});
        }

        String[] ans = new String[score.length];

        int rank = 1;

        // Process highest scores first
        while (!pq.isEmpty()) {

            int[] athlete = pq.poll();

            int index = athlete[1];

            if (rank == 1) {
                ans[index] = "Gold Medal";
            } 
            else if (rank == 2) {
                ans[index] = "Silver Medal";
            } 
            else if (rank == 3) {
                ans[index] = "Bronze Medal";
            } 
            else {
                ans[index] = String.valueOf(rank);
            }

            rank++;
        }

        return ans;
    }
}