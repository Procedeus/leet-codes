class Solution {
    public String addBinary(String a, String b) {
        StringBuilder string = new StringBuilder();
        int i = a.length() -1, j = b.length() -1, temp = 0;
        while(i >= 0 || j >= 0 || temp == 1){
            if(i >= 0){
                temp += (a.charAt(i--) - '0');
            }
            if(j >= 0){
                temp += (b.charAt(j--) - '0');
            }
            string.append(temp % 2);
            temp /= 2;
        }
        return string.reverse().toString();
    }
}