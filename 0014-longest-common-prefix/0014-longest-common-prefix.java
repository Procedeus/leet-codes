class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = "";
        String last = "";
        String par = "";
        Arrays.sort(strs);

        first = strs[0];
        last = strs[strs.length - 1];

        for(int i = 0; i < Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return par;
            }
            par += first.charAt(i);
        }
        return par;
    }
}