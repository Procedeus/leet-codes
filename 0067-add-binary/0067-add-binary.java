class Solution {
    public String addBinary(String a, String b) {
        StringBuilder string = new StringBuilder();
        char res = '0';
        int i = a.length() -1, j = b.length() -1, temp = 0;
        while(i >= 0 || j >= 0 || res == '1'){
            if(i >= 0 && j >= 0){
                temp = (a.charAt(i--) - '0') + (b.charAt(j--) - '0') + (res - '0');

            }
            else if(i >= 0){
                temp = (a.charAt(i--) - '0') + (res - '0');
            }
            else if(j >= 0){
                temp = (b.charAt(j--) - '0') + (res - '0');
            }
            else{
                temp = res - '0';
            }
            if(temp > 2){
                string.append('1');
            }
            else if(temp > 1){
                string.append('0');
                res = '1';
            }
            else if(temp == 1){
                string.append('1');
                res = '0';
            }
            else{
                string.append('0');
            }
        }
        return string.reverse().toString();
    }
}