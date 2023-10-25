class Solution {
    public int lengthOfLastWord(String s) {
        int word = 0;
        for(int i = 0, last = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                last++;
                word = last;
            }
            else{
                last = 0;
            }
        }
        return word;
    }
}