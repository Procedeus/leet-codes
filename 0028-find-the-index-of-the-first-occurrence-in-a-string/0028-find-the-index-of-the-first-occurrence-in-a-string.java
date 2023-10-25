class Solution {
    public int strStr(String haystack, String needle) {
        int check = -1;
        boolean first = true;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j = 0, x = i; j < needle.length() && x < haystack.length() && needle.charAt(j) == haystack.charAt(x); j++, x++){
                    if(j == (needle.length() - 1) && first){
                        check = x - (needle.length() - 1);
                        first = false;
                    }
                }
            }
        }
        return check;
    }
}