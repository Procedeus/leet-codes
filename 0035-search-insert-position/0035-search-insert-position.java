class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        boolean first = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target && first){
                index = i + 1;
            }
            else if(nums[i] == target){
                index = i;
            }
        }
        return index;
    }
}