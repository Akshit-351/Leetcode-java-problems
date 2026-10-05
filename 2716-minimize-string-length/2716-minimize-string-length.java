class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        return set.size();
    }
}