class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder out = new StringBuilder();
        int len = strs[0].length();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < strs.length; j++){
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    return out.toString();
                }
            }
            out.append(strs[0].charAt(i));
        }
        return out.toString();
    }
}