class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;
        int index = 0;
        while(index < s.length()) {
            if(s.charAt(index) == '(') {
                minOpen++;
                maxOpen++;
            } else if(s.charAt(index) == ')') {
                minOpen--;
                maxOpen--;
            } else {
                minOpen--;
                maxOpen++;
            }
            if(maxOpen < 0) {
                return false;
            }
            minOpen = Math.max(minOpen,0);
            index++;
        }
        return minOpen == 0;
    }
}