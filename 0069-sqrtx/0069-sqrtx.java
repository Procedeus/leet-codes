class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int i = 1, vezes = 0;
        while(x - i >= 0){
            x -= i;
            i += 2;
            vezes++;
        }
        return vezes;
        
    }
}