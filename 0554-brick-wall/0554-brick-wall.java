class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        map.put(1 , 0);
        for(int i = 0; i<wall.size(); i++){
            List<Integer> row = wall.get(i);
            int sum = 0;
            for(int j = 0; j<row.size() -1; j++){
                sum += row.get(j);
                map.put(sum ,map.getOrDefault(sum , 0) +1);
                maxFrequency = Math.max(maxFrequency , map.get(sum));
            }
        }
        return wall.size() - maxFrequency;
    }
}