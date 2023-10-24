class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = "";
        String par = "";

        for(int i = 0; i < strs.length; i++){
            for(int j = i + 1; j < strs.length; j++){
                if(strs[i].length() > strs[j].length()){
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }

        first = strs[0];

        for(int i = 0; i < first.length(); i++){
            for(int j = 0; j < strs.length; j++){
                if(first.charAt(i) != strs[j].charAt(i)){
                    return par;
                }
            }
            par += first.charAt(i);
        }
        return par;
    }
}