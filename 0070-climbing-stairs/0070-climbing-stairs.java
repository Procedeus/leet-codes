class Solution {
    public int climbStairs(int n) {
        if(n <= 3){
            return n;
        }
        int first = 2, sec = 3;
        for(int i = 4, temp = 0; i <= n; i++){
            temp = sec;
            sec += first;
            first = temp;
        }
        return sec;
    }
}