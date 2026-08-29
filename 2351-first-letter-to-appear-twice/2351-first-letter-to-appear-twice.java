class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(set.contains(ch[i])){
                return ch[i];
            }
            set.add(ch[i]);
        }
        return ' ';
    }
}