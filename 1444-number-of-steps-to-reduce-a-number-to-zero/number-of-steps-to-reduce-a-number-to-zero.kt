class Solution {
    fun numberOfSteps(num: Int): Int {
        if(num == 0){
            return 0
        }
        if(num % 2 != 0){
            return numberOfSteps(num - 1) + 1
        }
        return numberOfSteps(num / 2) + 1
    }
}