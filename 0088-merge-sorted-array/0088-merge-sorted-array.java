class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0; j < n; j++){
            nums1[j + m] = nums2[j];
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = i + 1; j < nums1.length; j++){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = temp;
                }
            }
        }
    }
}