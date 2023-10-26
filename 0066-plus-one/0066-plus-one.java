class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] += 1;
            return digits;
        }
        else{
            int i = digits.length - 1;
            while(i >= 0 && digits[i] == 9){
                digits[i] = 0;
                if(i == 0){
                    int[] digits1 = new int[digits.length + 1];
                    digits1[0] = 1;
                    for(int j = 1; j < digits1.length; j++){
                        digits1[j] = 0;
                    }
                    return digits1;
                }
                i--;
            }
            digits[i] += 1;
            return digits;
        }   
    }
}