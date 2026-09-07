class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
       int m = s.length() -1;
       while(s.charAt(m) == ' '){
        m--;
       }
       while(m >= 0 && s.charAt(m) != ' '){
        count++;
        m--;
       }
       return count;
        }
}