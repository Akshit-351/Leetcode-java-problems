class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for(int num: nums){
                map.put(num , map.getOrDefault(num , 0)+1);
        }
        for(int num: map.keySet()){
           int frequency =  map.get(num);
           pq.offer(new int[]{num , frequency});
           if(pq.size() > k){
            pq.poll();
           }
        }
        int[] ans = new int[k];
        for(int i = 0; i<k; i++){
            int[] pair = pq.poll();
            ans[i] = pair[0];
         }
         return ans;
    }
}