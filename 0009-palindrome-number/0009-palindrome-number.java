class Solution {
    public boolean isPalindrome(int x) {
        String valor = Integer.toString(x);
        for(int i = 0, j = valor.length() -1; i < (valor.length() / 2); i++, j--){
            if(valor.charAt(i) != valor.charAt(j)){
                return false;
            }
        }
        return true;
    }
}